import java.util.ArrayList;

public class GradeCalculator {
	
	public final String name;
	public final double currentScore;
	public final int currentCredit;
	// final ������ ������ �ʱ�ȭ �ʿ��� (ctrl+n)
	private final ArrayList<Course> courses = new ArrayList<>();
	
	public GradeCalculator(String name, double currentScore, int currentCredit) {
		this.name = name;
		this.currentScore = currentScore;
		this.currentCredit = currentCredit;
	}
	
	public void addCourse(Course course) {
		// ���� �������� �ʱ� ������ void ���
		// ���� ����� addCourse�����ϰ� print ������ ��¸� ���
		// ���� �߰����ϰ� print���� ���� ����� ��� ���
		courses.add(course);
		}
	
	public void print() {
		System.out.println("���� �б� ����: " + currentScore + " (�� " + currentCredit + "����)");
		
		double scoreSum = 0;
		int creditSum = 0;
		for(Course c : courses) {
			scoreSum += c.getScore() * c.credit;
			creditSum += c.credit;
		}
		double currentGrade = scoreSum / creditSum;
		System.out.println("�̹� �б� ����: " + String.format("%.10f", currentGrade) + " (�� " + creditSum + "����)");
		
		double totalScore = currentScore * currentCredit + scoreSum;
		int totalCredit = currentCredit + creditSum;
		double totalGPA = totalScore / totalCredit;
		
		System.out.println("��ü ���� ����: "+ String.format("%.10f", totalGPA) + " (�� " + totalCredit + "����)");
	}
}