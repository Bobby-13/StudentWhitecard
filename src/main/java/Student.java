import java.util.Date;
public class Student {
private String fname;
private String lname;
private String rollno;
private String address;
private String gender;
private String degree;
private String DOB;
private String pincode;
private String city;
private String email;
private String phno;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getRollno() {
	return rollno;
}
public void setRollno(String rollno) {
	this.rollno = rollno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDegree() {
	return degree;
}
public void setDegree(String degree) {
	this.degree = degree;
}
public String getDOB() {
	return DOB;
}
public void setDOB(String string) {
	DOB = string;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public Student(String fname, String lname,String rollno,String address, String gender, String degree,
		String dOB, String pincode, String city, String email, String phno) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.rollno = rollno;
	this.address = address;
	this.gender = gender;
	this.degree = degree;
	this.DOB = dOB;
	this.pincode = pincode;
	this.city = city;
	this.email = email;
	this.phno = phno;
}
public Student() {
}
}
