
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
import java.util.LinkedHashMap;
@WebServlet("/RemoveStuent")
public class RemoveStudent extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String rno=request.getParameter("rollno");
		PrintWriter out = response.getWriter();  
       response.setContentType("text/html"); 
       Connection conn=DBUtil.createconnection();
		String Query="Select RollNo from Student";
		int flag=0;
		try {
			PreparedStatement ps=conn.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(rno.equalsIgnoreCase(rs.getString(1)))
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
			out.println("<script> alert('RollNo Not Exist');location='index.html';</script>");
		}
		else {
       StuDatabase st=new StuDatabase();
       st.RemoveStudent(rno);
   	out.println("<script> alert('"+rno+" Removed');location='index.html';</script>");
		}
	}

}
