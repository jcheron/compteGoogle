<%@ page session="true" language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%String path=request.getServletContext().getContextPath(); 
if((request.getServerName()).contains("kobject"))
	path="";
%>
<!DOCTYPE HTML>
<html>
<head>
<script src="<%=path%>/js/sizzle.js"></script>
<script src="<%=path%>/js/forms.js"></script>

<link href='https://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="<%=path%>/css/lightbox.kcss">
<link rel="stylesheet" href="<%=path%>/css/main.kcss">
<link rel="stylesheet" href="<%=path%>/css/list.kcss">
<link rel="stylesheet" href="<%=path%>/css/debug.kcss">
<link rel="stylesheet" href="<%=path%>/css/css3.kcss">
<link rel="stylesheet" href="<%=path%>/css/userStyle.kcss">
<link rel="stylesheet" href="<%=path%>/css/glyphicons.css">
<meta charset="UTF-8" />
<title>Comptes Google</title>
</head>
<body id="body">
	<div class="bs-docs-header">
		<div class="container">
			<div class="header">
				<h1 id="title">Comptes Google</h1>
				<p>Base de données Historique et favoris</p>
			</div>
		</div>
	</div>
<div class="container">
<!-- header -->