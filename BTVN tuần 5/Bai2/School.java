package Bai2;

public class School {
	private String nameSchool, date;
	public School() {
		
	}
	public School(String nameSchool, String date) {
		this.nameSchool = nameSchool;
		this.date = date;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
