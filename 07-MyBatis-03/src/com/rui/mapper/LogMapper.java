package com.rui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.rui.pojo.Log;

public interface LogMapper {
	List<Log> selAll();
	
	/* List<Log> selByAccInAccOut(String accIn, String accOut); */
	/*
	 * 通过MyBatis的注解
	 * mapper.xml中就可以使用注解中标识的变量名
	 * 将数据变为了map 前者为key 后者的内容时value*/
	 List<Log> selByAccInAccOut(@Param("accIn") String accIn,@Param("accOut") String accOut);
	 
	 int upd(Log log);
	 
	 Log selByLog(Log log);
}
