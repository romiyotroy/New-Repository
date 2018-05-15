<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="JQuery/jquery.min.js"> 
</script>
 <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>
<script type="text/javascript" src="JQuery/datatable.editor.js"></script>
<script>
$(document).ready(function(){
    $("#view").click(function(){
    	//alert("on cli");
        $.post("JSONViewServlet",{},function(data){
        	//alert("data");
        	//var obj[]=JSON.parser(data);
        	var arr = $.parseJSON(data);
        	//alert(arr);
        	$("#table").load("DataTableJSON.jsp");
        	});
        
    });
});
</script>
</head>
<body>
	<button id="view">View Req</button>
	<div id="table"></div>
</body>
</html>