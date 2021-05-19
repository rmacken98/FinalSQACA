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
        Rubric rubric = Controller.createRubric("Final Year Project", criteria);
        assertTrue("Rubric created with criterion added", rubric instanceof Rubric);
    }

    // Testing the adding a criterion to a rubric method.
    @Test
    public void addCriterion() {
        Criterion criterion = new Criterion("Functionality");
        Criterion criterion2 = new Criterion("Doucmentation");
        ArrayList<Criterion> criteria = new ArrayList();
        Rubric rubric = new Rubric("Software Project", criteria);
        Controller.addCriteria(rubric, criterion);
        Controller.addCriteria(rubric, criterion2);
        assertEquals("Number of Criterion is : 2", 2, rubric.getCriterion().size());

    }

    // test to check that only the max of 10 criteria can be added to a rubric.
    @Test(expected = IllegalArgumentException.class)
    public void addCriteriaMax() {
        Criterion criterion1 = new Criterion("Documentation");
        ArrayList<Criterion> criteria = new ArrayList<Criterion>();
        Rubric rubric = new Rubric("Final Year Project", criteria);
        for (int i = 0; i < 16; i++) {
            rubric.addCriterion(criterion1);
        }

    }



       	// Test that Student Grade is created and A criterion score is added to the grade
	@Test
	public void  addCriterionScoreToGrade() {
		 Criterion criterion = new Criterion("Documentation");
		 criterion.setScore(5);
		 ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		 criteria.add(criterion);

		 Rubric rubric = new Rubric ("Final Year Project", criteria);

		 StudentGrade studentGrade = new StudentGrade(rubric.getCriterion());
		 assertTrue("StudentGrade created with score added",studentGrade instanceof StudentGrade);
		 assertEquals("Number of Grades is : 1",1 ,studentGrade.getCriterion().size());
    }


       // Test to check that getAllRubrics method retrieves all rubrics in arraylist
       @Test 
       public void getAllRubrics() {
            ArrayList<Rubric> allRubrics = new ArrayList<Rubric>();
            Criterion criterion= new Criterion("Documentation");
           
            ArrayList<Criterion> criteria = new ArrayList<Criterion>();
            criteria.add(criterion);
            
            Rubric rubric1 = new Rubric ("Final Year Project", criteria);
            Rubric rubric2 = new Rubric ("Final Year Project2", criteria);
            allRubrics.add(rubric1);
            allRubrics.add(rubric2);
           
            assertEquals("Number of Rubrics is : 2",2, Controller.getAllRubrics(allRubrics).size());
   
       }

         // Test to see if searching for a specific rubric returns desired rubric.
	    @Test 
	    public void getSpecificRubric() {
		    String rubric = "Final year project";
		    ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		    Criterion criterion = new Criterion("Documentation");
		
		    ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		    criteria.add(criterion);
		 
		    Rubric rubric1 = new Rubric ("Final Year Project", criteria);
		    Rubric rubric2 = new Rubric ("Management Exam", criteria);
		    Rubrics.add(rubric1);
		    Rubrics.add(rubric2);
		
		    assertEquals("Specific Rubric returned",rubric1, 
		    Controller.getSpecificRubric(rubric,Rubrics));
		
	}



}
