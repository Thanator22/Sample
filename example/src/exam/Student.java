package exam;

public class Student {

	public Student(String name, String clas, int marks) {
		super();
		this.setName(name);
		this.clas = clas;
		this.setMarks(marks);
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private String clas;
	private int marks;
}
