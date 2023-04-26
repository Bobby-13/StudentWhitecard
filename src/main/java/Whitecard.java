
public class Whitecard {
private String Rollno;
private String code;
private String title;
private String grade;
private String cgpa;
public String getRollno() {
	return Rollno;
}
public void setRollno(String rollno) {
	Rollno = rollno;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getCgpa() {
	return cgpa;
}
public void setCgpa(String cgpa) {
	this.cgpa = cgpa;
}
public Whitecard(String rollno, String code, String title, String grade, String cgpa) {
	super();
	Rollno = rollno;
	this.code = code;
	this.title = title;
	this.grade = grade;
	this.cgpa = cgpa;
}
public Whitecard() {
	// TODO Auto-generated constructor stub
}


}
