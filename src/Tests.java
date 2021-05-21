import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class Tests {

	// Test creation of Rubric object with criterion.
	@Test
	public void createRubricAddCriterion() {
		Criterion c1 = new Criterion("Documentation");
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		criteria.add(c1);
		Rubric rubric = Controller.createRubric("Final Year Project", criteria);
		assertTrue("Rubric created with criterion added", rubric instanceof Rubric);
	}

	// Testing adding a criterion to a rubric method.
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
		Criterion c1 = new Criterion("Documentation");
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		Rubric r = new Rubric("Final Year Project", criteria);
		for (int i = 0; i < 16; i++) {
			r.addCriterion(c1);
		}

	}

	// Test that Student Grade is created and criterion score is added to the grade.
	@Test
	public void addCriterionScoretoGrade() {
		Criterion c1 = new Criterion("Documentation");
		c1.setScore(5);
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		criteria.add(c1);

		Rubric rubric = new Rubric("Final Year Project", criteria);

		StudentGrade sg = new StudentGrade(rubric.getCriterion());
		assertTrue("StudentGrade created with score added", sg instanceof StudentGrade);
		assertEquals("Number of Grades is : 1", 1, sg.getCriterion().size());
	}

	@Test
	public void getAllRubrics() {
		ArrayList<Rubric> allRubrics = new ArrayList<Rubric>();
		Criterion c1 = new Criterion("Documentation");

		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		criteria.add(c1);

		Rubric r = new Rubric("Final Year Project", criteria);
		Rubric r2 = new Rubric("Final Year Project2", criteria);
		allRubrics.add(r);
		allRubrics.add(r2);

		assertEquals("Number of Rubrics is : 2", 2, Controller.getAllRubrics(allRubrics).size());

	}
	
	@Test
	public void rubricAddgradeLoop() {
		ArrayList<Criterion> criteria= new ArrayList<Criterion>();
		Rubric r = Controller.createRubric("Exam", criteria);
		ArrayList<StudentGrade> grades = new ArrayList<StudentGrade>();
		StudentGrade studentGrade1 = new StudentGrade(criteria);
		StudentGrade studentGradeg2 = new StudentGrade(criteria);
		grades.add(studentGrade1);
		grades.add(studentGradeg2);

		Controller.gradeACriterion("Documentation", studentGrade1, 5);
		Controller.gradeACriterion("Testing", studentGrade1, 3);
		Controller.gradeACriterion("Technical Solution", studentGrade1, 2);
		Controller.gradeACriterion("Documentation", studentGradeg2, 3);
		Controller.gradeACriterion("Testing", studentGradeg2, 2);
		Controller.gradeACriterion("Technical Solution", studentGradeg2, 3);
		
		assertEquals("Number of Rubrics is : 2", 2, Controller.loopAddGrades(r, grades).getGrades().size());

		
		
	}
	
	

	// Test to see if searching for a specific rubric returns desired rubric.
	@Test
	public void getSpecificRubric() {
		String rubric = "Final year project";
		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		Criterion c1 = new Criterion("Documentation");

		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		criteria.add(c1);

		Rubric r = new Rubric("Final Year Project", criteria);
		Rubric r2 = new Rubric("Management Exam", criteria);
		Rubrics.add(r);
		Rubrics.add(r2);

		assertEquals("Specific Rubric returned", r, Controller.getSpecificRubric(rubric, Rubrics));

    }
    

    @Test
	public void studentGradeCriterionTests() {
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		StudentGrade studentGrade = new StudentGrade(criteria);
		Controller.gradeACriterion("Documentation", studentGrade, 5);
		
		assertEquals( 1, studentGrade.getCriterion().size());
		assertEquals( 5, studentGrade.getCriterionGrade("Documentation").get(0));
		assertEquals( "Documentation", studentGrade.getCriterionName(0));
	}


    @Test
    public void isCriteerionScoreInvalid() {
		
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		StudentGrade studentGrade = new StudentGrade(criteria);
		
		assertEquals( 5, Controller.gradeACriterion("Documentation", studentGrade, 5).getGrades().get(0));

		assertThrows(IllegalArgumentException.class, () -> {
			Controller.gradeACriterion("Documentation", studentGrade, 75);
		  });
	
	}

	// Test to check if student grades are added to rubric and scores from criterion
	// are added to a student grade
	@Test
	public void addStudentGrade() {
		Rubric rubric = new Rubric("Finaly Year Project");
		Criterion c1 = new Criterion("Documentation");
		Criterion c2 = new Criterion("Testing");
		// sets the students score
		c1.setScore(5);
		c2.setScore(2);

		rubric.addCriterion(c1);
		rubric.addCriterion(c2);

		StudentGrade studentGrade = new StudentGrade(rubric.getCriterion());
		// adds the grade to the rubric
		rubric.addGrade(studentGrade);

		assertEquals("Grade added to rubric", 1, rubric.getGrades().size());
		assertEquals("Score of first criterion", "5", studentGrade.getGrades().get(0).toString());

	}

	@Test
	public void getGrades() {
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		Controller.createRubric("Final Year Project", criteria);
		Criterion criterion1 = Controller.createNewCriterion("Documentation");
		criterion1.setScore(5);
		Criterion criterion2 = Controller.createNewCriterion("Testing");
		criterion2.setScore(5);

		StudentGrade grade = new StudentGrade(criteria);
		grade.addCriterion(criterion1);
		grade.addCriterion(criterion2);

		assertEquals("List of grades returned", 2, grade.getGrades().size());

	}

	@Test
	public void getCriterionGrades() {
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		Rubric rubric = Controller.createRubric("Final Year Project", criteria);
		Criterion criterion1 = Controller.createNewCriterion("Documentation");
		criterion1.setScore(5);
		Criterion criterion2 = Controller.createNewCriterion("Testing");
		criterion2.setScore(5);

		StudentGrade grade = new StudentGrade(criteria);
		StudentGrade grade2 = new StudentGrade(criteria);

		grade.addCriterion(criterion1);
		grade.addCriterion(criterion2);

		rubric.addGrade(grade);
		rubric.addGrade(grade2);

		assertEquals("List of grades returned", 2, rubric.getCriterionGrade("Testing").size());

	}

	@Test
	public void getGradesbyRubric() {

		String rubric = "Final year project";
		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		Criterion criterion1 = new Criterion("Documentation");
		criterion1.setScore(5);
		Criterion criterion2 = new Criterion("Testing");
		criterion2.setScore(5);

		Rubric rubric1 = new Rubric("Final Year Project", criteria);
		Rubric rubric2 = new Rubric("Management Exam", criteria);

		rubric1.addCriterion(criterion1);
		rubric1.addCriterion(criterion2);

		StudentGrade studentGrade = new StudentGrade(rubric1.getCriterion());
		rubric1.addGrade(studentGrade);

		Rubrics.add(rubric1);
		Rubrics.add(rubric2);

		assertEquals("Specific Rubric returned", rubric1.getGrades(), Controller.getGradesbyRubric(Rubrics, rubric));
	}

	// Test to check that the average grade for a rubric is calculated
	@Test
	public void getAverageGrade() {

		String rubric = "Final year project";
		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();

		Criterion criterion1 = Controller.createNewCriterion("Documentation");
		Criterion criterion2 = Controller.createNewCriterion("Testing");
		Criterion criterion3 = Controller.createNewCriterion("Technical Solution");

		criterion1.setScore(5);
		criterion2.setScore(3);
		criterion3.setScore(2);

		Rubric rubric1 = Controller.createRubric("Final Year Project", criteria);
		Rubric rubric2 = Controller.createRubric("Management Exam", criteria);

		rubric1.addCriterion(criterion1);
		rubric1.addCriterion(criterion2);
		rubric1.addCriterion(criterion3);

		StudentGrade studentGrade = new StudentGrade(rubric1.getCriterion());
		rubric1.addGrade(studentGrade);

		Rubrics.add(rubric1);
		Rubrics.add(rubric2);
		assertEquals(3, Math.round(Controller.getAverageRubricScore(rubric, Rubrics)));

	}

	// Tests to check whether the average score for a specified criterion is
	// calculated
	@Test
	public void getAverageofACriterion() {

		String rubric = "Final year project";

		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		ArrayList<StudentGrade> studentGrades = new ArrayList<StudentGrade>();
//	         StudentGrade studentGrade = new StudentGrade(criteria);
//	         StudentGrade studentGrade2 = new StudentGrade(criteria);

		Criterion criterion1 = Controller.createNewCriterion("Documentation");
		Criterion criterion2 = Controller.createNewCriterion("Testing");
		Criterion criterion3 = Controller.createNewCriterion("Technical Solution");

//			 	Controller.gradeACriterion(criterion1, studentGrade, 3);
//		        Controller.gradeACriterion(criterion2, studentGrade, 4);
//		        Controller.gradeACriterion(criterion3, studentGrade, 1);
//		        Controller.gradeACriterion(criterion1, studentGrade2, 5);
//	            Controller.gradeACriterion(criterion2, studentGrade2, 5);
//		        Controller.gradeACriterion(criterion3, studentGrade2, 5);

		criterion1.setScore(3);
		criterion3.setScore(4);
		criterion2.setScore(1);

		Rubric rubric1 = new Rubric("Final Year Project", criteria);
		Rubric rubric2 = new Rubric("Management Exam", criteria);

		rubric1.addCriterion(criterion1);
		rubric1.addCriterion(criterion2);
		rubric1.addCriterion(criterion3);

		criterion2.setScore(5);
		rubric2.addCriterion(criterion2);

		StudentGrade studentGrade = new StudentGrade(criteria);
		StudentGrade studentGrade2 = new StudentGrade(criteria);

		studentGrade.addCriterion(criterion2);
		studentGrade.addCriterion(criterion1);

		studentGrade2.addCriterion(criterion2);
		studentGrade2.addCriterion(criterion3);

		criteria.add(criterion1);

		rubric1.addGrade(studentGrade);
		rubric1.addGrade(studentGrade);

		studentGrades.add(studentGrade);
		studentGrades.add(studentGrade2);

		Rubrics.add(rubric1);
		Rubrics.add(rubric2);

		assertEquals(3, Math.round(Controller.getAverageofCriterion(studentGrades, "documentation")));

	}

	// Test to get the max and minimum student grade from a rubric.
	// Also tests standard deviation calculation.
	@Test
	public void minMaxAndStandardDevGrade() {
		String rubric = "Final year project";

		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		ArrayList<Criterion> criteria2 = new ArrayList<Criterion>();

		ArrayList<StudentGrade> studentGrades = new ArrayList<StudentGrade>();

	
		Rubric rubric1 = new Rubric("Final Year Project", criteria);

		StudentGrade studentGrade1 = new StudentGrade(criteria);
		StudentGrade studentGradeg2 = new StudentGrade(criteria2);

		Controller.gradeACriterion("Documentation", studentGrade1, 5);
		Controller.gradeACriterion("Testing", studentGrade1, 3);
		Controller.gradeACriterion("Technical Solution", studentGrade1, 2);
		Controller.gradeACriterion("Documentation", studentGradeg2, 3);
		Controller.gradeACriterion("Testing", studentGradeg2, 2);
		Controller.gradeACriterion("Technical Solution", studentGradeg2, 3);

		rubric1.addGrade(studentGrade1);
		rubric1.addGrade(studentGradeg2);
		studentGrades.add(studentGrade1);
		studentGrades.add(studentGradeg2);
		Rubrics.add(rubric1);

		assertEquals(1, Math.round(Controller.getStandardDeviationRubricScore(rubric, Rubrics)));
		assertEquals(10, Controller.getMinorMaxGradeforRubric(rubric, Rubrics, "Max"));
		assertEquals(8, Controller.getMinorMaxGradeforRubric(rubric, Rubrics, "Min"));

	}

	// Test to check that the student grade with highest and lowest scores for a
	// criterion is returned
	// Also check standard deviation calculation for criterion
	@Test
	public void MinOrMaxStandardDevCriterion() {

		String rubric = "Final year project";

		ArrayList<Rubric> Rubrics = new ArrayList<Rubric>();
		ArrayList<Criterion> criteria = new ArrayList<Criterion>();
		ArrayList<StudentGrade> studentGrades = new ArrayList<StudentGrade>();
		StudentGrade studentGrade1 = new StudentGrade(criteria);
		StudentGrade studentGrade2 = new StudentGrade(criteria);

		Controller.gradeACriterion("Documentation", studentGrade1, 5);
		Controller.gradeACriterion("Testing", studentGrade1, 1);
		Controller.gradeACriterion("Tech", studentGrade1, 2);
		Controller.gradeACriterion("Documentation", studentGrade2, 5);
		Controller.gradeACriterion("Testing", studentGrade2, 5);
		Controller.gradeACriterion("Tech", studentGrade2, 1);

		Rubric rubric1 = new Rubric("Final Year Project", criteria);

		rubric1.addGrade(studentGrade1);
		rubric1.addGrade(studentGrade2);

		studentGrades.add(studentGrade1);
		studentGrades.add(studentGrade2);

		Rubrics.add(rubric1);

		assertEquals(0, Math.round(Controller.getStandardDeviationCriterion(studentGrades, "Documentation")));
		assertEquals(5, Controller.getMinorMaxGradeofCriterion(studentGrades, "Documentation", "max"));
		assertEquals(1, Controller.getMinorMaxGradeofCriterion(studentGrades, "Testing", "min"));

	}

}
