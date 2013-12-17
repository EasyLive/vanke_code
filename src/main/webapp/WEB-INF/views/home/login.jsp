<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/head.jsp" %>
<body style="visibility:visible">
	 <div id="loginWindow" class="easyui-dialog" title="登陆窗口" style="width:300px;height:180px;padding:5px;background: #fafafa;">
	        <div border="false" style=" padding-left:30px; background:#fff;border:1px solid #ccc;">
	            <form action="/home/index">
	                <table>
	                    <tr>
	                        <td>账号：</td>
	                        <td><input id="username" style="width: 150px;" /></td>
	                    </tr>
	                    <tr>
	                        <td>密码：</td>
	                        <td><input type="password" id="password" style="width: 150px;" /></td>
	                    </tr>
	                </table>
	            </form>
	        </div>
	        <div border="false" style="text-align:center;height:30px;line-height:30px; margin-top:6px;">
	            <a class="easyui-linkbutton" iconCls="icon-thereof" href="javascript:void(0)" id="aboutSys">关于</a>
	            <a class="easyui-linkbutton" iconCls="icon-ok" href="/home/index" id="btnLogin">登陆</a>
	        </div>
</div>
</body>
</html>