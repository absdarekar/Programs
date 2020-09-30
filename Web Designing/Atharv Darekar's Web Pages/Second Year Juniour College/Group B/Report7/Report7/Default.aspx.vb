Partial Public Class _Default
    Inherits System.Web.UI.Page
    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As EventArgs) Handles Button1.Click
        Dim A As String = Request.ServerVariables("Remote_addr")
        Dim B As String = Request.ServerVariables("Server_Port")
        Dim C As String = Request.ServerVariables("Script_Name")
        Dim D As String = Request.ServerVariables("HTTP_User_agent")
        Dim T As String = Request.ServerVariables("HTTP_Host")
        Dim F As String = Request.ServerVariables("Path_Info")
        Dim G As String = Request.ServerVariables("Request_method")
        Response.Write("<h1> IP Address is: </h1>" & A)
        Response.Write("<br>")
        Response.Write("<h1> Server Port Number is: </h1>" & B)
        Response.Write("<br>")
        Response.Write("<h1> Server Software Version is: </h1>" & C)
        Response.Write("<br>")
        Response.Write("<h1> Local Address is: </h1>" & D)
        Response.Write("<br>")
        Response.Write("<h1> Remote Address is: </h1>" & T)
        Response.Write("<br>")
        Response.Write("<h1> Path Information is: </h1>" & F)
        Response.Write("<br>")
        Response.Write("<h1> Request Method is: </h1>" & G)
        Response.Write("<br>")
    End Sub
End Class