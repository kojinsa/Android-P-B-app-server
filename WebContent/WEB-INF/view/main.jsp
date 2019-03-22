<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
<c:import url="/WEB-INF/template/link.jsp"></c:import>
</head>
<body>
<div id="wrap">
    <div id="leftWrap">
        <div class="box_list" ><a href="/ajax/main">API NAME</a></div>
    </div>
    <div id="rightWrap">
            <div id="methodBox">
				<button>검색</button>
            </div>
            <div id="resultBox">
                <div id="result">
				
                </div>
            </div>
    </div>
</div>
<script src="/js/jquery.js"></script>
<script>

</script>
</body>
</html>