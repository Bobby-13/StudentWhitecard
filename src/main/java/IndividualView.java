
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

@WebServlet("/IndividualView")
public class IndividualView extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String rno=request.getParameter("rollno");
		PrintWriter out = response.getWriter();  
       response.setContentType("text/html"); 
       Connection con=DBUtil.createconnection();
		String Query="Select RollNo from Student";
		int flag=0;
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(rno.equalsIgnoreCase(rs.getString(1)))
			 {
				 flag=1;
			 }
			}		
			ps.close();
			con.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
       
		if(flag==0)
		{
		out.println("<script> alert('RollNo Not Exist');location='index.html';</script>");
		}      
		else {
       out.println("<html>"
       		+ "<head>"
       		+ "<style>"
       		+ " h1 {"
       		+ "         font-family: Copperplate, Papyrus, fantasy;	 "	 		
       		+ "        margin: 100px auto;"
       		+ "        text-align: center;"
       		+ "        color: black;"
       		+ "        font-size: 40px;"
       		+ "        max-width: 600px;"
       		+ "        position: relative;"
       		+ "      }label{\r\n"
       		+ "padding: 5px 10px;"
       		+ "color: black;\r\n"
       		+ "  text-shadow: 2px 2px 4px #000000;\r\n"
       		+ "}\r\n"
       		+ ""
       		+ "fieldset {\r\n"
       		+ "  background-color: #eeeeee;\r\n"
       		+ "}\r\n"
       		+ "\r\n"
       		+ "legend {\r\n"
       		+ "  background-color: gray;\r\n"
       		+ "  color: white;\r\n"
       		+ "  padding: 5px 10px;\r\n"
       		+ "}\r\n"
       		+ "\r\n"
       		+ "input {\r\n"
       		+ "  margin: 5px;\r\n"
       		+ "}\r\n"
       		+ "</style>\r\n"
       		+ "<!-- CSS only -->\r\n"
       		+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
       		+ "</head>\r\n"
       		+ "<body>\r\n"
       		+ "<section class=\"intro\">\r\n"
       		+ "  <div class=\"bg-image h-100\" style=\"background-color: #6095F0;\">\r\n"
       		+ "    <div class=\"mask d-flex align-items-center h-100\">\r\n"
       		+ "      <div class=\"container\">\r\n"
       		+ "        <div class=\"row justify-content-center\">\r\n"
       		+ "          <div class=\"col-7\">\r\n"
       		+ "            <div class=\"card shadow-2-strong\" style=\"background-color: #f5f7fa;\">\r\n"
       		+ "              <div class=\"card-body\">\r\n");
       
       
   	Connection conn=DBUtil.createconnection();
   	String query="select *from Student where RollNo=?";
   	try {
   		PreparedStatement ps1=conn.prepareStatement(query);
   		ps1.setString(1,rno); 
   		ResultSet rs = ps1.executeQuery();
   		
   		
   		while(rs.next()) {
 	
       out.println("<h1>"+ rs.getString(1) +" "+ rs.getString(2)+"</h1><hr><label>Roll No:</label>"+rs.getString(3)+"<br><hr><label>Address :</label>" + rs.getString(4)+ "<br><hr><label>Gender :</label>" + rs.getString(5)+ "<br><hr><label>Degree :</label>" +  rs.getString(6) + "<br><hr>\r\n"
    		+ " <label>Date of Birth:</label>" +  rs.getString(7) +"<br> <hr><label>Pincode:</label>" + rs.getString(8)+"<br><hr><label>City:</label>"+rs.getString(9)+"<br><hr><label>Phone Number:</label>"+rs.getString(10) +"<br><hr><label>E-mail:</label>"+rs.getString(11)+ "<br>");   
   		
   		}
       out.println("<center><a href='index.html' class=\"btn btn-success\">Back</a></center></div></div></div></div></div></div></div></section><script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script></html>");       
   		ps1.close();
   	}
   	catch (SQLException e) {
				e.printStackTrace();
			}	

	}
	}

}
