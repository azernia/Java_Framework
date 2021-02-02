package com.rui.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
/**
 * 文件下载
 * @author Rui
 * Date 2021年2月2日 下午3:06:35
 */
@Controller
public class DemoController {
	@RequestMapping("upload")
	public String upload(MultipartFile file,String name) throws IOException{
		String fileName = file.getOriginalFilename();
		String suffix = fileName.substring(fileName.lastIndexOf("."));
		//判断上传文件类型
		if(suffix.equalsIgnoreCase(".png")){
			String uuid = UUID.randomUUID().toString();
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:/"+uuid+suffix));
			return "/index.jsp";
		}else{
			return "error.jsp";
		}
	}
}
