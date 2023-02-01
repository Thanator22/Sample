package exam;

public class Sample {	
	
	
	public static void main(String args[])
	{
		Student a = new Student("Mayank", "A", 98);
		Student b = new Student("Rohan", "A", 88);
		Student c = new Student("Himanshu", "A", 92);
		Student d = new Student("Abhishek", "A", 95);
	
		System.out.println((a.getMarks() > b.getMarks())? a.getName():
			( b.getMarks() > c.getMarks()) ? b.getName(): 
				(c.getMarks()> d.getMarks())? c.getName():d.getName());
	}

}
