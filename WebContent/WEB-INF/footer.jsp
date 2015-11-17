</div>
<%@page import="net.ko.debug.KDebugClient"%>
<%@page import="net.ko.framework.KoHttp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- footer -->
<%String pathF=request.getServletContext().getContextPath(); 
if((request.getServerName()).contains("kobject"))
	pathF="";
%>
<div id="main-ajax-loader" style="display: none"><span>Chargement...</span></div>
<script src="<%=pathF%>/js/userJS.js"></script>
<script type="text/javascript" src="messages.kjs"></script>
<%
if(KDebugClient.isActive()){
	out.print(KDebugClient.getMenu(request));
}
%>
<%=KoHttp.kajaxIncludes(request)%>
</body>
</html>