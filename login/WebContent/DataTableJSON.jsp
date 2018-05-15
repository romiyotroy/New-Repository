<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.net.URLDecoder,java.io.File" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>JSON Datatable</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">  
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/r/bs-3.3.5/jq-2.1.4,dt-1.10.8/datatables.min.css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
 <script type="text/javascript" src="https://cdn.datatables.net/buttons/1.5.1/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/select/1.2.5/js/dataTables.select.min.js"></script>
<script type="text/javascript" src="JQuery/datatable.editor.js"></script>


<script type="text/javascript">

$(document).ready(function() {
	
	
	//alert("path,j::"+path);
    $('#example').DataTable( {
        ajax: "JSON/test.json",
        columns: [
            { "data": "reqid" },
            { "data": "position" }
        ]
  
        
    } );
} );



/* $(document).ready(function() {
    $('#example').DataTable( {
        "ajax": "/JSON/datatable_data.json",
  
  "columnDefs": [ {
   "targets": 1,
   "data": "postUrl",
   "render": function(data){
    return '<a href="'+data+'">view</a>';
   }
  }],
  "columns": [
      
	   { "data": "postTitle" },
	   { "data": "postUrl" }
	        ]
	    } );
	} ); */
	
	
	
</script>
</head>
<body>
<div class="container-fluid">

<table id="example" class="table table-bordered">
        <thead>
            <tr>
            	
                <th>Requirement ID</th>
                <th>Position</th>
            </tr>
        </thead>
</table>
    
</div>
</body>
</html>