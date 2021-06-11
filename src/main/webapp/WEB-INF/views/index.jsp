<%@ include file="../partials/taglibs.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <jsp:include page="../partials/head.jsp"/>
    <title>Home</title>
</head>
<body>
<div class="container">
    <h1>Welcome in ${message}</h1>
</div>
    
    <form method="POST" action="/login" id="loginForm" class="form-custom validatedForm" autocomplete="off">           
        <input type="hidden" name="token" value="${fn:escapeXml(token)}" />                 
    </form>  
</body>
</html>
