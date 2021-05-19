import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class Tests {
    
  // Test creation of Rubric object
  @Test
  public void createRubricWithCriterion() {
        Criterion c1 = new Criterion("Documentation");
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        criteria.add(c1);
        Rubric rubric=  Controller.createRubric("Final Year Project", criteria);
        assertTrue("Rubric created with criterion added",rubric instanceof Rubric);
  }




}
