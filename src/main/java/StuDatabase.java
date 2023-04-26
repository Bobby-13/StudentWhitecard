import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;

public class StuDatabase {
	public static void createtablewhitecard()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table Whitecard(Rollno varchar2(50),Semester varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("Whitecard Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void I()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table I(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("I Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void II()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table II(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("II Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void III()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table III(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("III Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void IV()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table IV(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("IV Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void V()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table V(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("V Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void VI()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table VI(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("I Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void VII()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table VII(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("VII Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void VIII()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table VIII(Rollno varchar2(50),code varchar2(50),title varchar2(50),grade varchar2(50),cgpa varchar2(50))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			System.out.println("VIII Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static boolean InsertwhitecardValues(Whitecard wc,String sem)
	{
		Connection con=DBUtil.createconnection();
		String Query="Insert into "+sem+" values(?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,wc.getRollno());
			ps.setString(2,wc.getCode());
			ps.setString(3,wc.getTitle());
			ps.setString(4,wc.getGrade());
			ps.setString(5,wc.getCgpa());
			
			int count=ps.executeUpdate();
			ps.close();
			con.close();
			if(count>0)
			{
				return true;
			}
			else
				 return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	public static void createtablelogin()
	{
		Connection con=DBUtil.createconnection();
		String Query="create table Login(Username varchar2(30),Password varchar2(30),Rollno varchar2(30),Email varchar2(30))";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.executeUpdate();
			//System.out.println("Login Table Created");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean InsertloginValues(String user,String password,String rollno,String email)
	{
		Connection con=DBUtil.createconnection();
		String Query="Insert into Login values(?,?,?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,user);
			ps.setString(2,password);
			ps.setString(3,rollno);
			ps.setString(4,email);
			
			int count=ps.executeUpdate();
			ps.close();
			con.close();
			if(count>0)
			{
				return true;
			}
			else
				 return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}
	
	public static boolean LoginValidation(String email,String password)
	{
		Connection con=DBUtil.createconnection();
		String Query="Select Password from Login where email=?";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) { 
			 System.out.println(rs.getString(1));
			 if(rs.getString(1).equals(password))
				{
					return true;
				}
				else {
					return false;
				}
			}
			ps.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public static boolean Oldpassowrdverification(String email,String oldpassword)
	{
		Connection con=DBUtil.createconnection();
		String Query="Select Password from Login where email=?";
		
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,email);
			ResultSet rs = ps.executeQuery();
			String psw="";
			while (rs.next()) { 
			 psw=rs.getString(1);
			}
			ps.close();
			con.close();
			if(psw.equals(oldpassword))
			{
				return true;
			}
			else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static boolean ChangePassword(String email,String OldPassword,String NewPassword)
	{
		boolean bb=Oldpassowrdverification(email,OldPassword);
		if(bb==false)
			 return false;
		else {
		Connection con=DBUtil.createconnection();
		String Query="UPDATE Login SET Password=? where email=?";
		try {
			PreparedStatement ps=con.prepareStatement(Query);
			ps.setString(1,NewPassword);
			ps.setString(2,email);

			ps.executeUpdate();
			ps.close();
			con.close();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
		}
		
	}
	
	
	  public static void createtable()
      {
      	Connection con=DBUtil.createconnection();
           String query="create table Student(First_Name varchar2(40),"
           		+ "Last_Name varchar2(40),"
           		+ "RollNo varchar2(20),"
           		+ "Address varchar2(150),"
           		+ "Gender varchar2(20),"
           		+ "Degree varchar2(10),"
           		+ "DOB varchar2(30),"
           		+ "pincode varchar2(30),"
           		+ "city varchar2(30),"
           		+ "PhoneNumber varchar2(30),"
           		+ "Email varchar2(40)"
           		+ ")";
           try {
				PreparedStatement ps=con.prepareStatement(query);
				ps.executeUpdate();
				System.out.println("Table Created");
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
      }
      
      
      public static boolean InsertData(Student st)
      {
      	Connection con=DBUtil.createconnection();
      	String query="Insert into Student values(?,?,?,?,?,?,?,?,?,?,?)";
      	try {
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,st.getFname());
				ps.setString(2,st.getLname());
				ps.setString(3,st.getRollno());
				ps.setString(4,st.getAddress());
				ps.setString(5,st.getGender());
				ps.setString(6,st.getDegree());
				ps.setString(7,st.getDOB());
				ps.setString(8,st.getPincode());
				ps.setString(9,st.getCity());
				ps.setString(10,st.getPhno());
				ps.setString(11,st.getEmail());
				int count=ps.executeUpdate();
				ps.close();
				con.close();
				if(count>0)
				{
					return true;
				}
				else
					 return false;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		return false;
			
      }
  
      public static void Individualview(String Rollno)
      {
      	Connection con=DBUtil.createconnection();
      	String query="select *from Student where RollNo=?";
    
      	try {
      		PreparedStatement ps=con.prepareStatement(query);
      		ps.setString(1,Rollno);
      		ps.executeUpdate();
      		ps.close();
      	}
      	catch (SQLException e) {
				e.printStackTrace();
			}
      }
      
      
      public static void AllStudentview()
      {
      	Connection con=DBUtil.createconnection();
      	String query="select *from Student";
    
      	try {
      		PreparedStatement ps=con.prepareStatement(query);     	
      		ps.executeUpdate();
      		ps.close();
      	}
      	catch (SQLException e) {
				e.printStackTrace();
			}
      }
      
      
      public static void RemoveStudent(String Rollno)
      {
      	Connection con=DBUtil.createconnection();
      	String query="Delete from Student where RollNo=?";
    
      	try {
      		PreparedStatement ps=con.prepareStatement(query);
      		ps.setString(1,Rollno);
      		ps.executeUpdate();
      		ps.close();
      	}
      	catch (SQLException e) {
				e.printStackTrace();
			}
      }
      

   	 

     
	}
     

