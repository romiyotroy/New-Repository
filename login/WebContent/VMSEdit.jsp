
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--     <%@ page import="java.io.*,java.util.*,java.sql.*"%>   --%>
<%-- <%@ page import="javax.servlet.http.*,javax.servlet.*" %>   --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script language="javascript">

</script>

</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://enteprisevms.cnxhkbauy6wb.us-east-2.rds.amazonaws.com:3306/vms"  
     user="vms"  password="Vendor123"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Requirements;  
</sql:query>  
<form method="post" name="form" action="VmsEditCon.jsp">
   
<table border="1" width="10%">  

<c:forEach var="Requirements" items="${rs.rows}">  
<tr>  
<td><c:out var="rid" value="${Requirements.Rid}"/></td>  
<td><c:out value="${Requirements.position}"/></td>  
<td><c:out value="${Requirements.location}"/></td>  
<td><c:out value="${Requirements.jobtype}"/></td>  
<td><c:out value="${Requirements.client}"/></td>  
<td><c:out value="${Requirements.billrate}"/></td>  
<td><c:out value="${Requirements.payrate}"/></td>  
<td><c:out value="${Requirements.skills}"/></td>  
<td><c:out value="${Requirements.jd}"/></td>  
<td><c:out value="${Requirements.refperson}"/></td>  
<td><input type="submit" name="edit" value="edit"></td>

</tr>  
</c:forEach>  
</table>
</form>
</body>
</html>
