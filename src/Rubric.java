import java.util.ArrayList;

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

public Rubric (String rubricName) {
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



	
	
}
