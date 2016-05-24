
<%@taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE  html>
<html>
<head>
<meta charset="UTF-8">
<title>index_page</title>
</head>
<body>
<s:url action="produits" namespace="/" var="lien1"></s:url>
<s:a href="%{lien1}" >Registre webservices</s:a>
</body>
</html>