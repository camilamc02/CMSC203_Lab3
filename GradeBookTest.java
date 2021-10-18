package lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook gradeB;
	GradeBook gradeB2;

	@BeforeEach
	void setUp() throws Exception {
		gradeB=new GradeBook(5);
		gradeB.addScore(95);
		gradeB.addScore(12.3);
		gradeB2=new GradeBook(5);
		gradeB2.addScore(45);
		gradeB2.addScore(37);
		gradeB2.addScore(70);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeB=null;
		gradeB2=null;
	}
	@Test
	void testGradeBook() {
		
	}

	@Test
	void testAddScore() {
		System.out.println(gradeB.toString());
		assertTrue(gradeB.toString().equals("95.0 12.3 0.0 0.0 0.0 "));
		assertEquals(2,gradeB.getScoreSize());

		System.out.println(gradeB2.toString());
		assertTrue(gradeB2.toString().equals("45.0 37.0 70.0 0.0 0.0 "));
		assertEquals(3,gradeB2.getScoreSize());

	}

	@Test
	void testSum() {
		assertEquals(107.3, gradeB.sum());
		assertEquals(152, gradeB2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(12.3, gradeB.minimum());
		assertEquals(37, gradeB2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(95.0, gradeB.finalScore());
		assertEquals(115, gradeB2.finalScore());
	}

	@Test
	void testGetScoreSize() {
	//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
