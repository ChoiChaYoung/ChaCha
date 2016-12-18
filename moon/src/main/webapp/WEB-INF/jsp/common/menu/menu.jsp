<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<script type="text/javascript">

</script>
</head>
<style>
/* 메뉴 디자인 */
div, ul, li { margin:0; padding:0; }

#topMenu {
	float:right;
	margin:0px 5px 3px 5px;
	padding:0 0 3px 0;
	box-shadow: 0px 0px 15px rgba(0,0,0,.3);
	-moz-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
	-webkit-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
	-o-box-shadow: 0px 0px 15px rgba(0,0,0,.3);
	-moz-border-radius: 3px;
	-khtml-border-radius: 3px;
	-webkit-border-radius: 3px;
	border-radius: 3px;
	background-color:#5c5c5c;
}

#topMenu ul li {
	float:left;
	list-style-type:none;
}

#topMenu a {
	height:16px;
	color:#f1f1f1;
	font-family:arial;
}

#topMenu ul ul {
display:none;
}

#topMenu ul li:hover ul {
 display: block;
}

#topMenu ul ul {
display:none;
position:absolute;
background-color:#5c5c5c;
}

#topMenu ul ul li {
float:none;
}
</style>
<body>
	<div id="topMenu">
		<ul>
			<li><a href="#">${list[0].MENU_NAME}</a></li>

			<li><a href="#">Menu 2</a>
				<ul>
					<li><a href="#">Sub Menu 1</a></li>
					<li><a href="#">Sub Menu 2</a></li>
					<li><a href="#">Sub Menu 3</a></li>
				</ul>
			</li>

			<li><a href="#">Menu 3</a>
				<ul>
					<li><a href="#">Sub Menu 1</a></li>
					<li><a href="#">Sub Menu 2</a></li>
					<li><a href="#">Sub Menu 3</a></li>
				</ul>
			</li>

			<li><a href="#">Menu 4</a></li>
			<li><a href="#">Menu 5</a></li>
		</ul>
	</div>
</body>
</html>