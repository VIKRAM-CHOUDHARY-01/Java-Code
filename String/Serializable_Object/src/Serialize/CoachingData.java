package Serialize;

import java.io.Serializable;
import java.util.ArrayList;

public class CoachingData implements Serializable {
	private int totalStudents;
	private String Course;
	private ArrayList<String> Teachers;
	private static final long SerialVersionUID = 1L;

	public CoachingData(int totalStudents, String course, ArrayList<String> teachers) {
		super();
		this.totalStudents = totalStudents;
		Course = course;
		Teachers = teachers;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public ArrayList<String> getTeachers() {
		return Teachers;
	}

	public void setTeachers(ArrayList<String> teachers) {
		Teachers = teachers;
	}

	@Override
	public String toString() {
		return "CoachingData [totalStudents=" + totalStudents + ", Course=" + Course + ", Teachers=" + Teachers + "]";
	}

}
