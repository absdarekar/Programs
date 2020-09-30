<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="Default.aspx.vb" Inherits="Time10._Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Server side and Client Side Time and Date</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <h1 align="center"><u>Client side local date and time :</u></h1>
    <script language ="javascript">
        document.write("<h3>Client side date :" + new Date().toDateString() +"</h3>");
        document.write("<h3>Client side time :" + new Date().toLocaleTimeString() +"</h3>");
    </script>
    <%
        Response.Write("<h1><center><u>Server side date and time :</u></center></h1>")
        Response.Write("<h3>Server side date is :" & Date.Today & "</h3>")
        Response.Write("<h3>Server side time is :" & DateAndTime.TimeString & "</h3>")
    %>
    </div>
    </form>
</body>
</html>
