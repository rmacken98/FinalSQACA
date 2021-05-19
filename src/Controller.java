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
}
