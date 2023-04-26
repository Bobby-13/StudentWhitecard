
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

@WebServlet("/Loginvalidation")
public class Loginvalidation extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
	    response.setContentType("text/html"); 
	    String email=request.getParameter("email");
	    String password=request.getParameter("password");
	    Connection conn=DBUtil.createconnection();
		String Query="Select Email from Login";
		int flag=0;
		try {
			PreparedStatement ps=conn.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(email.equalsIgnoreCase(rs.getString(1)))
			 {
				 flag=1;
			 }
			}		
			ps.close();
			conn.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(flag==0)
		{
		out.println("<script> alert('No User Account for this email..');location='register.html';</script>");
		}
		else {
	    StuDatabase s=new StuDatabase();
	    boolean b=s.LoginValidation(email,password);
	    if(b)
	    {
	    	 RequestDispatcher rd=request.getRequestDispatcher("index.html");
	 	      rd.forward(request, response);	 	      
	    }
	    else {
	    	out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('User or password incorrect');");
	    	   out.println("location='login.html';");
	    	   out.println("</script>");
	    }
		}
	}
}
