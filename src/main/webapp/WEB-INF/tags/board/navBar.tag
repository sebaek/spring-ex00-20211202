<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<c:url value="/board/list" var="listUrl"></c:url>
<c:url value="/board/register" var="registerUrl"></c:url>
<c:url value="/member/signup" var="signupUrl"></c:url>
<c:url value="/member/login" var="loginUrl"></c:url>

<nav class="navbar navbar-expand-lg navbar-light bg-light">

    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="${listUrl }">목록</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="${registerUrl }">글쓰기</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="${signupUrl }">회원가입</a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="${loginUrl }">로그인</a>
      </li>
    </ul>
</nav>
