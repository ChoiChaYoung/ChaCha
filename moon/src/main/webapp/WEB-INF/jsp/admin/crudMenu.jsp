<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
<%@ include file="/WEB-INF/include/include-topmenu.jspf" %>
<script type="text/javascript">
    $(document).ready(function(){
        $("#write").on("click", function(e){ //글쓰기 버튼
            e.preventDefault();
            fn_openBoardWrite();
        }); 
         
        $("a[name='title']").on("click", function(e){ //제목 
            e.preventDefault();
            fn_openBoardDetail($(this));
        });
    });
     
     
    function fn_openBoardWrite(){
        var comSubmit = new ComSubmit();
        comSubmit.setUrl("<c:url value='/sample/openBoardWrite.do' />");
        comSubmit.submit();
    }
     
    function fn_openBoardDetail(obj){
        var comSubmit = new ComSubmit();
        comSubmit.setUrl("<c:url value='/sample/openBoardDetail.do' />");
        comSubmit.addParam("IDX", obj.parent().find("#IDX").val());
        comSubmit.submit();
    }
</script>
</head>
<body>
    <h2>메뉴 목록</h2>
<!-------------------------------- body start ------------------------------------->







<!-------------------------------- body  end -------------------------------------->
<!------------------------------ buttion start ------------------------------------>
    <a href="#this" class="btn" id="write">글쓰기</a>

<!------------------------------ buttion   end ------------------------------------>
<%@ include file="/WEB-INF/include/include-body.jspf" %>
</body>
</html>