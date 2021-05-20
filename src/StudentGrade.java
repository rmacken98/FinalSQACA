import java.util.ArrayList;

public class StudentGrade {

ArrayList<Criterion> criteria= new ArrayList<Criterion>();

public StudentGrade(ArrayList<Criterion> criteria) {
	this.criteria=criteria;
}

public ArrayList<Criterion> getCriterion() {
	return criteria;
}

public void setCriterion(ArrayList<Criterion> criterion) {
	this.criteria = criterion;
}

public void addCriterion(Criterion criterion) {
		
	this.criteria.add(criterion);

}

public ArrayList<Integer> getGrades()
{
	
	ArrayList<Integer> grades = new ArrayList<Integer>();


	for(Criterion c : this.criteria)
	{
		int score = c.getScore();
		grades.add(score);
	}

	
	return grades;
}



}