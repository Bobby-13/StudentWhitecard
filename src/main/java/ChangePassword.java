
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

@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String email=request.getParameter("email");
		String Oldpassword=request.getParameter("oldpassword");
		String Newpassword=request.getParameter("newpassword");
		PrintWriter out = response.getWriter();  
	       response.setContentType("text/html");
	       StuDatabase st=new StuDatabase();
	      boolean bb=st.ChangePassword(email,Oldpassword,Newpassword);
	      out.print("<html><body>");
	      if(bb)
	      {	    	
	    		out.println("<script> alert('Password SuccessFully Changed..');location='login.html';</script>");
	      }
	      else {
	    		out.println("<script> alert('Incorrect OldPassword or Invalid EmailId');location='change-password.html';</script>");
	      }
	      out.print("</body></html>");	   
	}

}
