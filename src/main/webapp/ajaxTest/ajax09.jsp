<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="<%= request.getContextPath() %>/resource/css/icon/css/all.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>

<script>
$(document).ready(function() {
  const appRoot = "${pageContext.request.contextPath}";
  $("#btn01").click(function() {
    $.ajax({
      url : appRoot + "/cont18/met01",
      method : "delete" // method는 type 속성으로 변경 가능, 값은 HTTP Method (ex:get, post, put, delete) 
    });
  });
  
  $("#btn021").click(function() {
    $.ajax({
      url : appRoot + "/cont18/met02",
      type : "get"
    });
  });
  
  $("#btn022").click(function() {
    $.ajax({
      url : appRoot + "/cont18/met02",
      type : "post"
    });
  });
  
  $("#btn023").click(function() {
    $.ajax({
      url : appRoot + "/cont18/met02",
      type : "put"
    });
  });
  
  $("#btn024").click(function() {
    $.ajax({
      url : appRoot + "/cont18/met02",
      type : "delete"
    });
  });
});
</script>

<title>Insert title here</title>
</head>
<body>

<button id="btn021">/cont18/met02 get</button>
<button id="btn022">/cont18/met02 post</button>
<button id="btn023">/cont18/met02 put</button>
<button id="btn024">/cont18/met02 delete</button>

<button id="btn01">/cont18/met01 요청</button>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-fQybjgWLrvvRgtW6bFlB7jaZrFsaBXjsOMm/tB9LTS58ONXgqbR9W8oWht/amnpF" crossorigin="anonymous"></script>
</body>
</html>










