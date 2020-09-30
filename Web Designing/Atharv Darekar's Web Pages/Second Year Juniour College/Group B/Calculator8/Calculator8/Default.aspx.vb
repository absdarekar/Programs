Partial Public Class _Default
    Inherits System.Web.UI.Page

    Protected Sub Button1_Click(ByVal sender As Object, ByVal e As EventArgs) Handles Button1.Click
        Dim a As Date
        Dim b As Integer
        a = TextBox1.Text
        b = DateDiff(DateInterval.Day, a, Now)
        Response.Write("Total Number Of Days Are =")
        Response.Write(b)
    End Sub
End Class