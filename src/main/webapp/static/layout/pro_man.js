$(function() {
	/**
	 * 数据填充
	 */

	$('#pro_table').datagrid({
		height : 'auto',
		nowrap : false,
		striped : true,
		border : false,
		collapsible : true,// 是否可折叠的
		fit : true,// 自动大小
		url : '',
		// sortName: 'code',
		// sortOrder: 'desc',
		remoteSort : false,
		idField : 'fldId',
		singleSelect : false,// 是否单选
		pagination : false,// 分页控件
		rownumbers : true,// 行号
		frozenColumns : [ [ {
			field : 'ck',
			checkbox : true
		} ] ],
		toolbar : [ {
			text : '项目',
			iconCls : 'icon-add',
			handler : function() {
				addFun();
			}
		},'-', { 
			text: '分期',
			iconCls : 'icon-add',
			handler : function() {
				addStaFun();
			}
		},'-', {
			text : '修改',
			iconCls : 'icon-edit',
			handler : function() {
				openDialog("add_dialog", "edit");
			}
		}, '-', {
			text : '删除',
			iconCls : 'icon-remove',
			handler : function() {
				delAppInfo();
			}
		} ],
	});
});

function addFun() {
	$('<div/>').dialog({
		href : '/pro/addPro.htm',
		width : 500,
		height : 300,
		modal: true,
		title : '添加新项目',
		buttons:[
		      {
		    	  text : '保存',
		    	  handler : function(){
		    		  $.messager.alert('提示','添加成功！');
		    	  }
		      },
		      {
		    	  text : '取消',
		    	  handler : function(){
		    		  console.log('销毁');
		    		  $("this").dialog("close")
		    	  }
		    	  
		      }
		]
	});
}

function addStaFun() {
	$('<div/>').dialog({
		href : '/pro/addSta.htm',
		width : 500,
		height : 300,
		modal: true,
		title : '增加项目分期',
		buttons:[
		      {
		    	  text:'保存',
		    	  handler:function(){
		    		  $.messager.alert('提示','添加成功！');
		    	  }
		      },
		      {
		    	  text : '取消',
		    	  handler : function(){
		    		  console.log('销毁');
		    		  $("this").dialog("close")
		    	  }
		      }
		]
	});
}
