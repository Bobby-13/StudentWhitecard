
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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;

@WebServlet("/AllStudentView")
public class AllStudentView extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><head>"
		 		+ "<script>html,"
		 		+ "body,"
		 		+ ".intro {"
		 		+ "  height: 100%;"
		 		+ "}"
		 		+ ""
		 		+ "table td,"
		 		+ "table th {"
		 		+ "  text-overflow: ellipsis;"
		 		+ "  white-space: nowrap;"
		 		+ "  overflow: hidden;"
		 		+ "}"
		 		+ ""
		 		+ ".card {"
		 		+ "  border-radius: .5rem;"
		 		+ "}"
		 		+ ""
		 		+ ".table-scroll {"
		 		+ "  border-radius: .5rem;"
		 		+ "}"
		 		+ ""
		 		+ "thead {"
		 		+ "  top: 0;"
		 		+ "  position: sticky;"
		 		+ "}</script>"
		 		+ "<!-- CSS only -->"
		 		+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\"></head>"
		 		+ "<body><section class=\"intro\">"
		 		+ "  <div class=\"bg-image h-100\" style=\"background-color: #f5f7fa;\">"
		 		+ "    <div class=\"mask d-flex align-items-center h-100\">"
		 		+ "      <div class=\"container\">"
		 		+ "        <div class=\"row justify-content-center\">"
		 		+ "          <div class=\"col-12\">"
		 		+ "            <div class=\"card shadow-2-strong\">"
		 		+ "              <div class=\"card-body p-0\">"
		 		+ "                <div class=\"table-responsive table-scroll\" data-mdb-perfect-scrollbar=\"true\" style=\"position: relative; height: 700px\">"
		 		+ "                  <table class=\"table table-dark mb-0\">"
		 		+ "                    <thead style=\"background-color: #393939;\">");  
	      out.println("<tr class=\"text-uppercase text-success\"><th>First Name</th><th>Last Name</th><th>Roll No</th><th>Address</th><th>Gender</th><th>Degree</th><th>DOB</th><th>Pincode</th><th>City</th><th>Phone Number</th><th>Email Id</th></tr>  </thead> <tbody>");     	     
	
      Connection con=DBUtil.createconnection();
    	String query="select *from Student";
  
    	try {
    		PreparedStatement ps=con.prepareStatement(query);     	
    		
    		ResultSet rs = ps.executeQuery();
    			while (rs.next()) {     
    			 out.println("<tr><td>"+ rs.getString(1) +"</td><td>" + rs.getString(2)+ "</td><td>" + rs.getString(3) + "</td><td>" + rs.getString(4)+ "</td><td>" + rs.getString(5)+ "</td><td>" +  rs.getString(6) + "</td><td>" +  rs.getString(7) +"</td><td>" + rs.getString(8)+ "</td><td>" + rs.getString(9) + "</td><td>" +  rs.getString(10) +"</td><td>" +  rs.getString(11)+ "</td></tr>");        
    		}
    	      out.println("</tbody>\r\n"
    	      		+ "                  </table>\r\n"
    	      		+ "                </div>\r\n"
    	      		+ "              </div>\r\n"
    	      		+ "            </div>\r\n"
    	      		+ "          </div>\r\n"
    	      		+ "        </div>\r\n"
    	      		+ "      </div>\r\n"
    	      		+ "    </div>\r\n"
    	      		+ "  </div>\r\n"
    	      		+ "</section>");  
    	      out.println("<!-- JavaScript Bundle with Popper -->\r\n"
    	      		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script></html></body>");
    		ps.close();
    	}
    	catch (SQLException e) {
				e.printStackTrace();
			} 
		

	
   } 
}
