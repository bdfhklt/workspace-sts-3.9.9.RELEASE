<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
	
	<!-- 1. bootstrap, 2, 사용자 저장 -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" />
	<link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet" />
	<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
	
	<!-- 1. jquery, 2. bootstrap, 3. 사용자 저장 -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>	
	
</head>

<body>

	<form action="login.do" method="post" enctype="multipart/form-data">
	<div class="container">
	    <div class="row">
	        <div class="col-md-offset-5 col-md-3">
	            <div class="form-login">
		            <h4>Welcome back.</h4>
		            <input type="text" id="userName" name="mem_id" class="form-control input-sm chat-input" placeholder="username" value="id2"/>
		            <br />
		            <input type="text" id="userPassword" name="mem_pw" class="form-control input-sm chat-input" placeholder="password" value="pw"/>
		            <br />	
		            <div class="wrapper">
		            <span class="group-btn">     
		                <button type="submit" class="btn btn-primary btn-md">
		                	login
		                </button>
		            </span>
		            </div>
	            </div>
	        </div>
	    </div>
	</div>
	</form>
	
</body>
</html>