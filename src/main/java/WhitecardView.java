
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
@WebServlet("/WhitecardView")
public class WhitecardView extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
	    response.setContentType("text/html");
	    String Rollno=request.getParameter("Rollno");
	    String sem=request.getParameter("semester");
	
	    Connection con=DBUtil.createconnection();
		String Q1="Select RollNo from I";
		String Q2="Select RollNo from II";
	    String Q3="Select RollNo from III";
	    String Q4="Select RollNo from IV";
		String Q5="Select RollNo from V";
	    String Q6="Select RollNo from VI";
        String Q7="Select RollNo from VII";
	    String Q8="Select RollNo from VIII";
		int f1=0;
		int f2=0;
		int f3=0;
		int f4=0;
		int f5=0;
		int f6=0;
		int f7=0;
		int f8=0;
		try {
			PreparedStatement ps1=con.prepareStatement(Q1);
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) { 
			 if(Rollno.equalsIgnoreCase(rs1.getString(1)))
			 {
				 f1=1;
			 }
			}		
			ps1.close();
			
			PreparedStatement ps2=con.prepareStatement(Q2);
			ResultSet rs2 = ps2.executeQuery();
			while (rs2.next()) { 
			 if(Rollno.equalsIgnoreCase(rs2.getString(1)))
			 {
				 f2=1;
			 }
			}		
			ps2.close();
			
			
			PreparedStatement ps3=con.prepareStatement(Q3);
			ResultSet rs3 = ps3.executeQuery();
			while (rs3.next()) { 
			 if(Rollno.equalsIgnoreCase(rs3.getString(1)))
			 {
				 f3=1;
			 }
			}		
			ps3.close();
			
			
			PreparedStatement ps4=con.prepareStatement(Q4);
			ResultSet rs4 = ps4.executeQuery();
			while (rs4.next()) { 
			 if(Rollno.equalsIgnoreCase(rs4.getString(1)))
			 {
				 f4=1;
			 }
			}		
			ps4.close();
			
			
			PreparedStatement ps5=con.prepareStatement(Q5);
			ResultSet rs5 = ps5.executeQuery();
			while (rs5.next()) { 
			 if(Rollno.equalsIgnoreCase(rs5.getString(1)))
			 {
				 f5=1;
			 }
			}		
			ps5.close();
			
			PreparedStatement ps6=con.prepareStatement(Q6);
			ResultSet rs6 = ps6.executeQuery();
			while (rs6.next()) { 
			 if(Rollno.equalsIgnoreCase(rs6.getString(1)))
			 {
				 f6=1;
			 }
			}		
			ps6.close();
			
			
			PreparedStatement ps7=con.prepareStatement(Q7);
			ResultSet rs7 = ps7.executeQuery();
			while (rs7.next()) { 
			 if(Rollno.equalsIgnoreCase(rs7.getString(1)))
			 {
				 f7=1;
			 }
			}		
			ps7.close();
			
			
			PreparedStatement ps8=con.prepareStatement(Q8);
			ResultSet rs8 = ps8.executeQuery();
			while (rs8.next()) { 
			 if(Rollno.equalsIgnoreCase(rs8.getString(1)))
			 {
				 f8=1;
			 }
			}		
			ps8.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n"
				+ "    <meta name=\"description\" content=\"au theme template\">\r\n"
				+ "    <meta name=\"author\" content=\"Hau Nguyen\">\r\n"
				+ "    <meta name=\"keywords\" content=\"au theme template\">\r\n"
				+ "    <title>Tables</title>\r\n"
				+ "    <link href=\"csss/font-face.css\" rel=\"stylesheet\" media=\"all\">\r\n"
				+ "    <link href=\"vendor/bootstrap-4.1/bootstrap.min.css\" rel=\"stylesheet\" media=\"all\">\r\n"
				+ "    <link href=\"csss/theme.css\" rel=\"stylesheet\" media=\"all\">\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">"
				+ "</head>\r\n"
				+ "<body class=\"animsition\" background:\"black\">");
		
		
		out.println("\r\n"
				+ "<section class=\"vh-100\"\">\r\n"
				+ "  <div class=\"container h-100\">\r\n"
				+ "    <div class=\"row d-flex justify-content-center align-items-center h-100\">\r\n"
				+ "      <div class=\"col-lg-12 col-xl-11\">\r\n"
				+ "        <div class=\"card text-black\" style=\"border-radius: 25px;\">\r\n"
				+ "          <div class=\"card-body p-md-5\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "");
		
		out.println(" <div class=\"table-responsive table-responsive-data2\">\r\n"
				+ "                                <h2 style=\"align-items: center\">End Semester Examination</h2>\r\n"
				+ "                                <h3 style=\"align-items: center\">Rollno :"+ Rollno +"</h3><h4 style=\"align-items: center\">Sem :"+sem+"<sup>th</sup></h4>"
				+ "                                    <table class=\"table table-striped table-hover\" style=\"text-align:center ;\">");		
	    if(sem.equals("I"))
	    {
	    	if(f1==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from I where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;	
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
		
	    if(sem.equals("II"))
	    {
	    	if(f2==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from II where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	 
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
		
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    if(sem.equals("III"))
	    {
	    	if(f3==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from III where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	    			
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
		 
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    
	    
	    if(sem.equals("IV"))
	    {
	    	if(f4==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from IV where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	    				    				
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    
	    
	    if(sem.equals("V"))
	    {
	    	if(f5==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from V where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	    			
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    	
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    
	    if(sem.equals("VI"))
	    {
	    	if(f6==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from VI where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	    			
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    
	    if(sem.equals("VII"))
	    {
	    	if(f7==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from VII where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;
	    			
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
		   
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				} 	
	    }
	    
	    
	    if(sem.equals("VIII"))
	    {
	    	if(f8==0)
	    	{
	    		out.println("<script>alert('Data Not Found');location='whitecardView.html';</script>");
	    	}
	    	Connection conn=DBUtil.createconnection();
	    	String query="select code,title,grade,cgpa from VIII where Rollno=?";
	    	  
	    	try {
	    		PreparedStatement ps=conn.prepareStatement(query);     	
	    	
	    		ps.setString(1,Rollno);
	    		ResultSet rs = ps.executeQuery();
	    		
	    		out.println(" <tr><th>Course Code</th><th>Course Title</th><th>Grade</th><th>CGPA</th></tr>");
	    		while(rs.next())
	    		{
	    			if(rs.getString(1)==null)
	    				break;  				
	    			out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");    
	    			
	    		}
	    		
		   
	    		ps.close();
	    	}
	    	catch (SQLException e) {
					e.printStackTrace();
				}
	    	
	    }
	    
	    out.println("<a href=\"index.html\" class=\"btn btn-secondary\"> <span class=\"glyphicon glyphicon-backward\"></span> Back\r\n"
	    		+ "</a></div></div></div></div></div></div></section></table>"
	    		+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>"
	    		+ "</body></html>");
	    
	}

}
