package tst.project.bean;

public class StudentBean {
	private int student_id;
	private String Student_name;
	private String Student_gender;
	public int getStudent_id() {
		return student_id;
	}
	public StudentBean setStudent_id(int student_id) {
		this.student_id = student_id;
		return this;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public StudentBean setStudent_name(String student_name) {
		Student_name = student_name;
		return this;
	}
	public String getStudent_gender() {
		return Student_gender;
	}
	public StudentBean setStudent_gender(String student_gender) {
		Student_gender = student_gender;
		return this;
	}
	

}
