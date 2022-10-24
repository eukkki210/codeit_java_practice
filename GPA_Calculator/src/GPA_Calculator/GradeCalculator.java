import java.util.ArrayList;

public class GradeCalculator {
	
	public final String name;
	public final double currentScore;
	public final int currentCredit;
	// final 번수는 무조건 초기화 필요함 (ctrl+n)
	private final ArrayList<Course> courses = new ArrayList<>();
	
	public GradeCalculator(String name, double currentScore, int currentCredit) {
		this.name = name;
		this.currentScore = currentScore;
		this.currentCredit = currentCredit;
	}
	
	public void addCourse(Course course) {
		// 값을 리턴하지 않기 때문에 void 사용
		// 학점 계싼을 addCourse에서하고 print 에서는 출력만 담당
		// 과목 추가만하고 print에서 계산과 출력을 모두 담당
		courses.add(course);
		}
	
	public void print() {
		System.out.println("직전 학기 성적: " + currentScore + " (총 " + currentCredit + "학점)");
		
		double scoreSum = 0;
		int creditSum = 0;
		for(Course c : courses) {
			scoreSum += c.getScore() * c.credit;
			creditSum += c.credit;
		}
		double currentGrade = scoreSum / creditSum;
		System.out.println("이번 학기 성적: " + String.format("%.10f", currentGrade) + " (총 " + creditSum + "학점)");
		
		double totalScore = currentScore * currentCredit + scoreSum;
		int totalCredit = currentCredit + creditSum;
		double totalGPA = totalScore / totalCredit;
		
		System.out.println("전체 예상 학점: "+ String.format("%.10f", totalGPA) + " (총 " + totalCredit + "학점)");
	}
}