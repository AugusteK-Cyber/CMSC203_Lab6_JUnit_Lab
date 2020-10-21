/*
 * Class: CMSC203
 * Instructor: Robert Alexander
 * 
 * Description: 	The program creates a JUnit Test Class for Gradebook.java.
 * 
 * Due: MM/DD/YYYY (<10/22/2020>)
 * 
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Auguste Basile Romeo Kiendrebeogo______
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {

	// Attributes of GradeBook.  
	GradeBook gradeBook1;
	GradeBook gradeBook2;

	@BeforeEach
	void setUp() throws Exception {

		// Create at least two objects of GradeBook to hold 5 scores.
		gradeBook1 = new GradeBook(5);
		gradeBook2 = new GradeBook(5);

		/* call the addScore method for each of the GradeBook objects 
		 * at least twice (but no more than 5 times) to add some random
		 * scores of your choice to the GradeBook objects
		 */

		gradeBook1.addScore(27.51);
		gradeBook1.addScore(91.39);
		gradeBook1.addScore(65.98);
		gradeBook1.addScore(96.11);

		gradeBook2.addScore(97.67);
		gradeBook2.addScore(58.25);
		gradeBook2.addScore(82.15);
		gradeBook2.addScore(100);
		gradeBook2.addScore(91.22);		

	}

	@AfterEach
	void tearDown() throws Exception {

		gradeBook1 = null;
		gradeBook2 = null;		
	}

	@Test
	void testAddScore() {
		
		// Test gradeBook1 and gradeBook2 scores added
		
		assertTrue(gradeBook1.toString().equals("27.51 91.39 65.98 96.11 0.0"));
		assertTrue(gradeBook2.toString().equals("97.67 58.25 82.15 100.0 91.22"));
	}

	@Test
	void testGetScoreSize() {

		// Test score array size
		assertEquals(4, gradeBook1.getScoreSize());
		assertEquals(5, gradeBook2.getScoreSize());
	}

	@Test
	void testSum() {

		// Test sum of the values in the arrays
		assertEquals(280.99, gradeBook1.sum(), .0001);
		assertEquals(429.29, gradeBook2.sum(), .0001);
	}

	@Test
	void testMinimum() {

		// Test minimum of the values in the arrays
		assertEquals(27.51, gradeBook1.minimum(), .001);
		assertEquals(58.25, gradeBook2.minimum(), .001);
	}

	@Test
	void testFinalScore() {

		// Test minimum of the values in the arrays
		assertEquals(253.48, gradeBook1.finalScore(), .001);
		assertEquals(371.04, gradeBook2.finalScore(), .001);
	}

	@Test
	void testToString() {

		// Test gradeBook1 and gradeBook2 toString output
		assertTrue(gradeBook1.toString().equals("27.51 91.39 65.98 96.11 0.0"));
		assertTrue(gradeBook2.toString().equals("97.67 58.25 82.15 100.0 91.22"));
	}

}
