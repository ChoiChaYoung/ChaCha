<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<%@ include file="/WEB-INF/include/include-topmenu.jspf" %>
<script type="text/javascript">
    $(document).ready(function(){

    });
</script>
</head>
<body>
    <div align="center" style="height: 200px; padding-top: 100px">
	    <a href="/moon/sample/openBoardList.do" class="btn" id="btnMain" style="padding: 50px">GO!!!</a>
	</div>
	${sessionScope.menuList}
<%@ include file="/WEB-INF/include/include-body.jspf" %>
</body>
</html>