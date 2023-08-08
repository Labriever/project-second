<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>404 error</title>
<link href="<%= request.getContextPath() %>/resources/css/404error.css" rel="stylesheet">
</head>
<body>
<h1>Error!</h1>
<p class="zoom-area"><b>이 페이지는 없는 페이지 입니다!</b> 링크를 확인해주세요! </p>
<section class="error-container">
  <span class="four"><span class="screen-reader-text">4</span></span>
  <span class="zero"><span class="screen-reader-text">0</span></span>
  <span class="four"><span class="screen-reader-text">4</span></span>
</section>
<div class="link-container">
  <a target="_blank" href="./index" class="more-link">홈페이지로 돌아가기</a>
</div>
</body>
</html>