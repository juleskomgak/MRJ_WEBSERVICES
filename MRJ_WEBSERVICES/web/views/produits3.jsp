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
<s:textfield name="produit.ref" label="Ref"></s:textfield>
<s:textfield name="produit.designation" label="Désignation"></s:textfield>
<s:textfield name="produit.prix" label="Prix"></s:textfield>
<s:textfield name="produit.quantite" label="Quantite"></s:textfield>
<s:checkbox label="Promo" name="produit.promo"></s:checkbox>
<s:hidden name="editMode"></s:hidden>

<s:submit value="Save"></s:submit>
</s:form>
</div>
<div class="table1">

<table>
<tr> <th>Ref</th> <th>Désignation</th> <th>Prix </th> <th>Quantité</th> <th>Promo</th> </tr>

<s:iterator value="produits">

  <tr> <td><s:property value="ref"/></td>
       <td> <s:property value="designation"/></td>
       <td> <s:property value="prix"/> </td>
       <td> <s:property value="quantite"/></td> 
       <td><s:property value="promo"/></td>
       <s:url action="delete" namespace="/" var="lien2">
             <s:param name="ref"> <s:property value="ref"/></s:param>
             
        </s:url>
        <td> 
        <s:a href="%{lien2}">delete</s:a>
       </td>
       <s:url action="edit" namespace="/" var="lien3">
             <s:param name="ref"> <s:property value="ref"/></s:param>
             
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