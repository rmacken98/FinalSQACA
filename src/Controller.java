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

}
