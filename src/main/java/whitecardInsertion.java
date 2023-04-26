

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

@WebServlet("/whitecardInsertion")
public class whitecardInsertion extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();  
	    response.setContentType("text/html"); 
	    
	    String RollNo=request.getParameter("RollNo") ;
	    String Sem=request.getParameter("semester");
	    
	    
	    Connection con=DBUtil.createconnection();
		String Query="Select RollNo from Student";
		int flag1=0;
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 if(RollNo.equalsIgnoreCase(rs.getString(1)))
			 {
				 flag1=1;
			 }
			}		
			ps.close();
			con.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		if(flag1==0)
		{
		out.println("<script>alert('Need to fill Personal Info 1st');location='Addstu.html';</script>");
		}
		else {
	    
	    String code1=request.getParameter("code1");
	    String title1=request.getParameter("title1");
	    String grade1=request.getParameter("grade1");
	    String cgpa1=request.getParameter("cgpa1");
	    
	    String code2=request.getParameter("code2");
	    String title2=request.getParameter("title2");
	    String grade2=request.getParameter("grade2");
	    String cgpa2=request.getParameter("cgpa2");
	    
	    String code3=request.getParameter("code3");
	    String title3=request.getParameter("title3");
	    String grade3=request.getParameter("grade3");
	    String cgpa3=request.getParameter("cgpa3");
	    
	    String code4=request.getParameter("code4");
	    String title4=request.getParameter("title4");
	    String grade4=request.getParameter("grade4");
	    String cgpa4=request.getParameter("cgpa4");
	    
	    String code5=request.getParameter("code5");
	    String title5=request.getParameter("title5");
	    String grade5=request.getParameter("grade5");
	    String cgpa5=request.getParameter("cgpa5");
	    
	    String code6=request.getParameter("code6");
	    String title6=request.getParameter("title6");
	    String grade6=request.getParameter("grade6");
	    String cgpa6=request.getParameter("cgpa6");
	    
	    String code7=request.getParameter("code"+"7");
	    String title7=request.getParameter("title7");
	    String grade7=request.getParameter("grade7");
	    String cgpa7=request.getParameter("cgpa7");
	    
	    
	    Whitecard wc=new Whitecard();
	    StuDatabase sd=new StuDatabase();
   	   boolean b=false;	    
	    
	    if(code1.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code1);
		    wc.setTitle(title1);
		    wc.setGrade(grade1);
		    wc.setCgpa(cgpa1);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    
	    if(code2.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code2);
		    wc.setTitle(title2);
		    wc.setGrade(grade2);
		    wc.setCgpa(cgpa2);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    if(code3.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code3);
		    wc.setTitle(title3);
		    wc.setGrade(grade3);
		    wc.setCgpa(cgpa3);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    if(code4.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code4);
		    wc.setTitle(title4);
		    wc.setGrade(grade4);
		    wc.setCgpa(cgpa4);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    if(code5.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code5);
		    wc.setTitle(title5);
		    wc.setGrade(grade5);
		    wc.setCgpa(cgpa5);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    
	    if(code6.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code6);
		    wc.setTitle(title6);
		    wc.setGrade(grade6);
		    wc.setCgpa(cgpa6);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    
	    if(code7.length()>0) {
	    	wc.setRollno(RollNo);
		    wc.setCode(code7);
		    wc.setTitle(title7);
		    wc.setGrade(grade7);
		    wc.setCgpa(cgpa7);
		    
		    b=sd.InsertwhitecardValues(wc,Sem);		    	
	    }
	    
	    
	    if(b==true)
		    {
	    	out.println("<script>alert('Inserted');location='index.html';</script>");
		    }
		    else
		    {
		    out.println("<script>alert('Error Occured');location='table.html';</script>");	
		    }
		    	
	    
		} 
	    
	}


}
