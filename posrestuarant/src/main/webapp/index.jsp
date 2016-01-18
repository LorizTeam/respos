<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<body>
<h2>Hello World!</h2>
<form action="login.action" method="post">

	<s:textfield name="usermodel.username" />
	<s:textfield name="usermodel.password" />
	
	<button type="submit" name="submit">Submit</button>
</form>

</body>
</html>
