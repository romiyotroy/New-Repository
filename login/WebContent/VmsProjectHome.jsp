<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VMS Registration</title>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">

<style>
body{background-image:url("https://img00.deviantart.net/330c/i/2009/298/0/2/mac_style_wallpaper___set_by_varcolacu.jpg");
font-size:24px; color:maroon; font-weight:bold}
form{padding-left:25%; width:600px;display:inline-block;}
h1{text-align:center;text-decoration:underline; }
input[type=text],select{width:20em;float:right}
input[type=number]{width:20em;float:right}
input[type=email]{width:20em;float:right}
input[type=tel]{width:20em;float:right}
input[type=submit]{float:right; font-size:30px; background-color:green; color:white}
textarea{margin-top:1%;margin-bottom:1%;width:40em;height:5em;float:right}
</style>
</head>

<body>
<h1>REGISTRATION</h1>
<form action="vmsHomeServlet" method="post">
Position <input type="text" name="position" id="pos"><br>
Location 
		<select name="location" id="loc">
				<option value="NY">NY</option>
				<option value="NJ">NJ</option>
				<option value="FL">FL</option>
		</select><br>
Job Type
	<input type="radio" name="jobType" value="permanant" style="margin-left:35%">Permanant &nbsp; &nbsp;
	<input type="radio" name="jobType" value="contract">Contract<br>
Client <input type="text" name="client" id="client"><br>
Billrate <input type="number" name="billrate" min="1" max="999999"><br>
Payrate <input type="number" name="payrate" min="1" max="999999"><br>
Skills <input type="text" name="skills" id="skills"><br>
Job Description <textarea name="description" id="des" placeholder="write Job description"></textarea><br>
Reference Person <input type="text" name="ref" id="ref"><br>
Reference Email <input type="email" name="refEmail" id="refEmail"><br>
Phone Number <input type="tel" name="phoneNumber" id="phoneNumber"><br>
Remark <textarea name="remark" id="remark" ></textarea><br>
Status
	<select name="status" id="status">
		<option value="open">Open</option>
		<option value="Closed">Closed</option>
	</select><br>
Pre Req <input type="text" name="preReq" id="preReq"><br><br>
<input type="submit" value="Submit">
</form>


</body>
</html>