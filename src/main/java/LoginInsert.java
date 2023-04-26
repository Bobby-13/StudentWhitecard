

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/LoginInsert")
public class LoginInsert extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
	    response.setContentType("text/html"); 		
		String username=request.getParameter("username");
		String Oldpassword=request.getParameter("password");
		String Confirmpassword=request.getParameter("confirmpassword");
		String rollno=request.getParameter("rollno");
		String email=request.getParameter("email");
		StuDatabase sb=new StuDatabase();
		Connection con=DBUtil.createconnection();
		String Query="Select Email,Rollno from Login";
		int flag1=0;
		int flag2=0;
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(email.equals(rs.getString(1)))
			 {
				 flag1=1;
			 }
			 if(rollno.equalsIgnoreCase(rs.getString(2)))
			 {
				 flag2=1;
			 }
			}
			ps.close();
			con.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(flag1==1){
			out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('Email Id Already exist');");
	    	   out.println("location='register.html';");
	    	   out.println("</script>");			
				}
		else if(flag2==1){
			out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('RollNo Already exist');");
	    	   out.println("location='register.html';");
	    	   out.println("</script>");			
				}
		  else if(Oldpassword.equals(Confirmpassword))
		   {		
			sb.InsertloginValues(username, Confirmpassword, rollno, email);
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
	 	    rd.forward(request, response);	
		}
		else {
			out.println("<script>alert('Password Not Same');location='register.html';</script>");			
		}
		
		}
	


}
