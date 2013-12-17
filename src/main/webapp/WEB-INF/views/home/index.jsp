<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/head.jsp" %>
<script type="text/javascript" src="/static/layout/default.js"></script>
<style>
<!--
body {
	width: 100%px; height: 100%; mar
}
._content {padding: 10px}
.easyui-tree a{text-decoration: none;color: #777777;}
.tree-icon{margin-top: 5px;}
.tree-node,.tree li a {line-height: 28px!important;height: 28px!important;}
.tree-node-selected a{color:white !important;} 

-->
</style>
<body class="easyui-layout">
        <div data-options="region:'north',border:0" style="padding: 5px; background-color: #F4F4F4">
        	<h2>万科认购签约管理系统</h2>
        </div>  
         <div id="_menus" data-options="region:'west',split:true,title:'导航选项'" style="width:200px;">
         	<%@ include file="../includes/menu.jsp" %>
         </div>  
         <div data-options="region:'center',iconCls:'icon-ok'" name="contentFrame">  
              <div id="navTabs" class="easyui-tabs" data-options="fit:'true'" border="false" plain="true">
             	<div class="_content" id="wel" title="欢迎页面">
             		<iframe scrolling="yes" frameborder="0"  src="/home/wel.htm" style="width:100%;height:100%;"></iframe>
             	</div>
             </div>
         </div>  
</body>

<script type="text/javascript">
<!--
//$('#wel').load('/views/welcome.jsp');
//-->
</script>

<%@ include file="../includes/footer.jsp"%>
