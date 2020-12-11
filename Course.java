package conko1;

public class Course {
	
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String sStudent) {
		students[numberOfStudents] = sStudent;
		numberOfStudents++;
	}
	
	public void dropStudent(String sStudent) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(sStudent)) {
				for (int j = 0; j < numberOfStudents; j++) {
					students[j] = students[j + 1];
				}
				students[numberOfStudents - 1] = null;
				numberOfStudents--;
				break;
			}

		}
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

}