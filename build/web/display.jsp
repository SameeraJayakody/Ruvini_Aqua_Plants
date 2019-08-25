<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>

<style>
.btn {

  background-color: #DC143C; /* Pink */
  border: none;
  color: white;
  width : 220px;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
}
}


</style>
</head>

<body  style="bgcolor: #F08080; /* Pink */
  border: none;
  color: white;">

<p><br><p/>
<div class="row">
<div class = "col-md-4">
<h3>Search...</h3>
</div>
<div class ="col-md-4">
	<form action="" method="get">
		<input type="text" class="form-control" name="q" placeholder="Search here.."/>
	</form>	
</div>


<p></p>
<table class="table table-border table-striped table-hover">
	<thread>
		<tr>
			<th>ID</th>
			<th>NIC</th>
			<th>Name</th>
			<th>Department</th>
                        <th>Contacts</th>
                        <th>Address</th>
                        <th>Gender</th>
			<th class="text-center">Expire Date</th>
			<a href="edit.jsp" class="btn btn-primary">Update date</a>
			 <th calss="text-center">Comments</th> 
			 <a href ="addnew.jsp" class="btn btn-primary">Add Comment</a>
			 
		</tr>
	</thread>
	<tbody>
	<%   Connection con;
	    Statement st;
	    ResultSet rs;
	   %>
           <% 
	   String url,user,pass;
	   
	   
	       url="dbc:mysql://localhost:3306/manageemployee";//dbname
	       user="root";
	       pass="";
	      try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            con=DriverManager.getConnection(url,user,pass);
	             
	     
	       
	   
	   
		
		String data="select * from employee ";
			st=con.createStatement();
			rs= st.executeQuery(data);
			while (rs.next()){
			out.print("<tr>");
			out.print("<td>"+rs.getString("id")+"</td>");
			out.print("<td>"+rs.getString("pname")+"</td>");
			out.print("<td>"+rs.getString("quant")+"</td>");
			out.print("<td>"+rs.getString("pric")+"</td>");
			out.print("<td>"+rs.getString("trip-start")+"</td>");
			
			out.print("<td class=\"text-center\"><a href =\"edit?u="+rs.getString("id")+" class = \"btn btn-warning\"> Edit </a><a href =\"delete.jsp?u=" +rs.getString("id")+" class =\"btn btn-danger \"> Delete </a></td>");
			out.print("</tr>");
			
			
			}
		}catch(Exception ex){
			out.print(""+ex);
		}
		%>
		
