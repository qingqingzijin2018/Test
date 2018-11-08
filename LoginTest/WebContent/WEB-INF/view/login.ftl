<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Cache-Control" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<title>登录页</title>
</head>
<body>
    <div style="text-align:center;">
	    <#if error?exists>
	    	<div style="color:red;">${error}</div>
	    </#if>
        <form action="LoginController_login.do">
            <p>
                              账户：<input type="text" name="username" />
            </p>
            <p>
                              密码：<input type="password" name="password" />
            </p>
            <p>
               <input type="submit" value="点击登录" />
            </p> 
        </form>
    </div>
</body>
</html> 