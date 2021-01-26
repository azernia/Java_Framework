<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
	//页面加载完成后执行
	//相当于 window.onload=function(){} $(document).ready(function(){});
	$(function(){
	$("form").submit(function(){
		//表单选择器,    :input标签type属性值
		if($(":text:eq(0)").val()==""||$(":text:eq(1)").val()==""||$(":text:eq(2)").val()==""){
			alert("请填写完整信息");
			//阻止默认行为
			return false;
		}
	});
});
</script>
</head>
<body>
	<form action="is" method="post">
		<table>
			<tr>
				<td colspan="2"
					style="text-align: center; font-size: 30px; font-weight: bold;">
					花卉信息</td>
			</tr>
			<tr>
				<td><b>花卉名称:</b></td>
				<td><input type="text" name="fname" value="" /></td>
			</tr>
			<tr>
				<td><b>花卉价格:</b></td>
				<td><input type="text" name="price" value="" /></td>
			</tr>
			<tr>
				<td><b>原产地:</b></td>
				<td><input type="text" name="production" value="" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="提交" />
					<input type="reset" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>