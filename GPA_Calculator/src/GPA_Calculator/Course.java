public class Course {
	public static final int CREDIT_MAJOR = 3;
	public static final int CREDIT_GENERAL = 2;
	
	public final String name;
	public final int credit;
	public final String grade;
	
	public Course(String name, int credit, String grade) {
		// 持失切 持失
		this.credit = credit;
		this.name = name;
		this.grade = grade;
	}
	
	public double getScore() {
		switch (grade) {
		case "A+":
			return 4.5;
		case "A":
			return 4.0;
		case "B+":
			return 3.5;
		case "B":
			return 3.0;
		case "C+":
			return 2.5;
		case "C":
			return 2.0;
		case "D+":
			return 1.5;
		case "D":
			return 1.0;
		case "F":
			return 0.0;
		}
		return -1;
	}
}