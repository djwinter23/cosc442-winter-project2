package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class PointTest.
 */
public class PointTest {

	/** The p 1. */
	private Point p1;
	
	/**
	 * Sets the up.
	 *
	 * @throws Exception the exception
	 */
	@Before
	public void setUp() throws Exception {
		 p1 = new Point(2.0, 5.0);
	}

	/**
	 * Tear down.
	 *
	 * @throws Exception the exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test get X.
	 */
	@Test
	public void testGetX() {
		assertEquals(2.0, p1.getX(), 0.001);
	}

	/**
	 * Test get Y.
	 */
	@Test
	public void testGetY() {
		assertEquals(5.0, p1.getY(), 0.001);
	}

}
