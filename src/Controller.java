import java.util.ArrayList;
public class Controller {
  
    // creates a new Rubric.
    public static Rubric createRubric(String name, ArrayList<Criterion> criteria) {
		
		Rubric newRubric = new Rubric(name, criteria); 
				return newRubric;
		
	}
	
}
