
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet("/Studentservletdata")
public class Studentservletdata extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		PrintWriter out = response.getWriter();  
	    response.setContentType("text/html"); 
		Student st=new Student();
		String rollno=request.getParameter("rollno");
		st.setFname(request.getParameter("fname"));
		st.setLname(request.getParameter("lname"));
		st.setRollno(request.getParameter("rollno"));
		st.setAddress(request.getParameter("address"));
		st.setCity(request.getParameter("city"));
		st.setDegree(request.getParameter("degree")+"-"+request.getParameter("course"));
	    st.setDOB(request.getParameter("dob"));
		st.setGender(request.getParameter("gender"));
		st.setPhno(request.getParameter("phno"));
		st.setEmail(request.getParameter("email"));
		st.setPincode(request.getParameter("pincode"));
		StuDatabase sd=new StuDatabase();
		Connection con=DBUtil.createconnection();
		String Query="Select RollNo from Student";
		int flag1=0;
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(rollno.equalsIgnoreCase(rs.getString(1)))
			 {
				 flag1=1;
			 }
			}		
			ps.close();
			con.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(flag1==1)
		{
			out.println("<script> alert('RollNo Already Exists');location='Addstu.html';</script>"); 	
		}
		else {
		boolean bb= sd.InsertData(st);  
        if(bb)
        {
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
    	      rd.forward(request, response);
        }      
        else
        {
        out.println("<script> alert('Error Occured');location='Addstu.html';</script>");      	
        } 		
	}
	}
}
