$(function() {
	$('#_menus ul li').click(function() {
		var _title = $(this).text();
		var _url = $(this).find('a').attr('url');
		addTab(_title, _url);
	});
});

/**
 * 添加新的tab标签
 * 
 * @param title
 * @param href
 * @param ico
 */
addTab = function(title, href) {
	var _tab = $('#navTabs');
	if (_tab.tabs('exists', title)) {
		// tab 已经存在,选中
		_tab.tabs('select', title);
		// refreshTab(obj)
	} else {
		if (href) {
			var content = '<iframe scrolling="yes" frameborder="0"  src="'
					+ href + '" style="width:100%;height:100%;"></iframe>';
			_tab.tabs('add', {
				title : title,
				content : content,
				closable : true,
			});
		}
	}
};

/**
 * 刷新tab
 * 
 * @param obj
 */
refreshTab = function(obj) {
	var _tab = $('#navTabs');
};
;