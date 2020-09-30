<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="Default.aspx.vb" Inherits="HitCounter9._Default" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" >
<head runat="server">
    <title>Untitled Page</title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
    <h1 style ="height:65px;width:450px">
    <b><big>Hit Counter</big></b>
    </h1>
    <%
        Application.Lock()
        Application("Count") = Application("Count") + 1
        Application.UnLock()
    %>
    <h1>The number of visitors to this page=</h1>
    <b>
    <center>
    <h1>
    <%
        Response.Write(Application("Count"))
        Response.Write("<br>")
    %> 
    </h1>
    </center>
    </b>
    </div>
    </form>
</body>
</html>
