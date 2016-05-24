<%@taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>produits</title>
<link href="css/style.css" type="text" rel="stylesheet"/>
</head>
<body>

<div >
<s:form action="save" method="post">
<s:textfield name="webservice.name" label="Nom du webservice"></s:textfield>
<s:textfield name="webservice.ip" label="Ip du webservice"></s:textfield>
<s:textfield name="webservice.port" label="Port"></s:textfield>
<s:textfield name="webservice.descriptif" label="Description"></s:textfield>
<s:checkbox label="REST" name="webservice.rEST"></s:checkbox>
<s:hidden name="editMode"></s:hidden>

<s:submit value="Save"></s:submit>
</s:form>
</div>
<div class="table1">

<table>
<tr> <th>Nom du webservice</th> <th>Ip du webservice</th> <th>Port </th> <th>Description</th> <th>REST</th> </tr>

<s:iterator value="webservices">

  <tr> <td><s:property value="name"/></td>
       <td> <s:property value="ip"/></td>
       <td> <s:property value="port"/> </td>
       <td> <s:property value="description"/></td> 
       <td><s:property value="REST"/></td>
       <s:url action="delete" namespace="/" var="lien2">
             <s:param name="name"> <s:property value="name"/></s:param>
             
        </s:url>
        <td> 
        <s:a href="%{lien2}">delete</s:a>
       </td>
       <s:url action="edit" namespace="/" var="lien3">
             <s:param name="name"> <s:property value="name"/></s:param>
             
        </s:url> 
        <td>
        <s:a href="%{lien3}">edit</s:a>
       </td>
   </tr>

</s:iterator>

</table>

</div>
</body>
</html>