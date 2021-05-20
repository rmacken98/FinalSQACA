import java.util.ArrayList;
public class Controller {
  
    // creates a new Rubric.
    public static Rubric createRubric(String name, ArrayList<Criterion> criteria) {
		
		Rubric newRubric = new Rubric(name, criteria); 
				return newRubric;
		
    }
    
    // Adds a criteria to a rubric
    public static Rubric addCriteria(Rubric rubric, Criterion criterion) {
		
		rubric.addCriterion(criterion);
		return rubric;
    }
    
    //returns a list of all rubrics
	public static ArrayList<Rubric> getAllRubrics(ArrayList<Rubric> allRubrics) {	
		
		return allRubrics;
    }
    

     // method to search through list of rubrics by name to find a specific rubric object 
	public static Rubric getSpecificRubric(String rubricName, ArrayList<Rubric> rubric) {
        Rubric specificRubric = null;
    
        for(Rubric search: rubric)
        {
            if(search.getRubricName().equalsIgnoreCase(rubricName))
            {
                
                specificRubric= search;
            }

        }
        
        return specificRubric;
}

// searches through array list of rubrics and gets a list of the grades for the desired rubric
public static ArrayList<StudentGrade> getGradesbyRubric(ArrayList<Rubric> rubric , String rubricName)
{
    ArrayList<StudentGrade> grades = null;
    for(Rubric search: rubric)
    {
        if(search.getRubricName().equalsIgnoreCase(rubricName))
        {
            
            grades= search.getGrades();
        }

    }
    return grades; 
}

// calculates the average student grades from a specified rubric
public static double getAverageRubricScore(String rubricName, ArrayList<Rubric> rubrics) {
	Rubric rubric = getSpecificRubric(rubricName,rubrics);
	return rubric.getGrades().get(0).getAverage();
	
}



// calculates the average grade for a specific criterion
public static double getAverageOfCriterion(ArrayList<StudentGrade> studentGrades, String criterionName) {
	
	ArrayList<Criterion> criteria = new ArrayList<Criterion>();
	Rubric rubric =new Rubric("dummy rubric",criteria);
	try {
	for (int i=0; i<studentGrades.size();i++ ) {
		rubric.addGrade(studentGrades.get(i));
	}
	}catch(Exception e) {e.printStackTrace();}
	return rubric.getCriterionAverage(criterionName);
}

public static int getHighestGradeforRubric(String rubricName, ArrayList<Rubric> rubrics){
	Rubric rubric= getSpecificRubric(rubricName,rubrics);
	return rubric.highestGrade();
}

public static int getLowestGradeforRubric(String rubricName, ArrayList<Rubric> rubrics){
	Rubric rubric= getSpecificRubric(rubricName,rubrics);
	return rubric.lowestGrade();
}


public static int getHighestGradeofCriterion(ArrayList<StudentGrade> studentGrades, String criterionName) {
	
	ArrayList<Criterion> criteria = new ArrayList<Criterion>();
	Rubric rubric =new Rubric("dummy rubric",criteria);
	try {
	for (int i=0; i<studentGrades.size();i++ ) {
		rubric.addGrade(studentGrades.get(i));
	}
	}catch(Exception e) {e.printStackTrace();}
	return rubric.highestCriterionGrade(criterionName);
}


public static int getLowestGradeofCriterion(ArrayList<StudentGrade> studentGrades, String criterionName) {
	
	ArrayList<Criterion> criteria = new ArrayList<Criterion>();
	Rubric rubric =new Rubric("dummy rubric",criteria);
	try {
	for (int i=0; i<studentGrades.size();i++ ) {
		rubric.addGrade(studentGrades.get(i));
	}
	}catch(Exception e) {e.printStackTrace();}
	return rubric.lowestCriterionGrade(criterionName);
}




}
