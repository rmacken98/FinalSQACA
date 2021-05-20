import java.util.ArrayList;
import java.util.Collections;

public class Rubric {
	private String rubricName;
	private ArrayList<Criterion> criteria = new ArrayList<Criterion>();
	private ArrayList<StudentGrade> grades = new ArrayList<StudentGrade>();

	public ArrayList<StudentGrade> getGrades() {
		return grades;
	}

	public void setGrades(ArrayList<StudentGrade> grades) {
		this.grades = grades;
	}

	public Rubric(String rubricName) {
		this.rubricName = rubricName;
	}

	public Rubric(String rubricName, ArrayList<Criterion> criteria) {

		this.rubricName = rubricName;
		this.criteria = criteria;
	}

	public String getRubricName() {
		return rubricName;
	}

	public void setRubricName(String rubricName) {
		this.rubricName = rubricName;
	}

	public ArrayList<Criterion> getCriterion() {
		return criteria;
	}

	public void setCriterion(ArrayList<Criterion> criterion) {
		this.criteria = criterion;
	}

	// sets limit of criteria that can be added to 10
	// throws exception if limit is exceeded
	public void addCriterion(Criterion criterion) {
		if (this.criteria.size() < 10) {

			this.criteria.add(criterion);
		} else {
			throw new IllegalArgumentException("There can only be a maximum of 10 criteria");
		}

	}

	public void addGrade(StudentGrade grade) {
		this.grades.add(grade);
	}

	public ArrayList<Integer> getCriterionGrade(String criterion) {
		ArrayList<Integer> grades = new ArrayList<Integer>();

		for (StudentGrade studentGrade : this.grades)
			for (int i = 0; i < this.grades.size(); i++) {

				{
					int score = studentGrade.getCriterion().get(i).getScore();
					if (studentGrade.getCriterion().get(i).getCriteria().equalsIgnoreCase(criterion)) {

						grades.add(score);

					}
				}
			}

		return grades;
	}

	// gets the average grade for a specific criterion
	public double getCriterionAverage(String criterion){
	
		double totalScore= 0;
		for(int i: this.getCriterionGrade(criterion)) {
			
			totalScore+=i;
		}
		double mean = totalScore/this.getGrades().size();
		return mean;
				
	
	}

	// method to get either the highest or lowest student grade for a rubric
	public int minOrMaxGrade(String option) {
		ArrayList<Integer> grades = new ArrayList<Integer>();

		
		for (StudentGrade studentGrade : this.getGrades()) {
			grades.add(studentGrade.getTotalGrade());
		}
		
		
		if (option.equalsIgnoreCase("max")) {
			
			return Collections.max(grades);
			
		} 
		else if (option.equalsIgnoreCase("min")) {
			
			return Collections.min(grades);
		}

		else {
			throw new IllegalArgumentException("Must choose an option of either Max or Min");
		}

	}
	
	// method to get either the highest or lowest student grade for a criterion

	public int minOrMaxCriterionGrade(String criterion, String option) {
		ArrayList<Integer> grades = new ArrayList<Integer>();

		for (StudentGrade studentGrade : this.getGrades()) {
			for (int i = 0; i < this.grades.size(); i++) {

				if (studentGrade.getCriterion().get(i).getCriteria().equalsIgnoreCase(criterion)) {
					grades.add(studentGrade.getGrades().get(i));
				}
			}
		}

		if (option.equalsIgnoreCase("max")) {
			
			return Collections.max(grades);
			
		} 
		else if (option.equalsIgnoreCase("min")) {
			
			return Collections.min(grades);
		}

		else {
			throw new IllegalArgumentException("Must choose an option of either Max or Min");
		}

	}

}

