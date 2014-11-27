package my.algorithm.app.chapter.one;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SelectionProblemTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SelectionProblemTest(String testName)
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SelectionProblemTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        SelectionProblem prob = new SelectionProblem();
        assertTrue(prob.N.length == 100);
        SelectionProblem prob2 = new SelectionProblem(200);
        assertTrue(prob2.N.length == 200);
    }

    public void testException()
    {
        SelectionProblem prob = new SelectionProblem();
        try{
            prob.findLargest(101);
            assertTrue(false);
        } catch (Exception e) {
            if (e instanceof  IllegalArgumentException)
                assertTrue(true);
            else {
                assertTrue(true);
            }
        }
    }

    public void testPerformance()
    {
        int[] testPool = new int[] {10, 100, 200, 1000, 2000, 10000, 20000, 100000, 200000, 1000000, 2000000, 10000000, 20000000};
        for (int i = 0; i< testPool.length; i++) {
            int size = testPool[i];
            SelectionProblem prob = new SelectionProblem(size);
            long start = System.currentTimeMillis();
            prob.findLargest(size/2);
            long end = System.currentTimeMillis();
            System.out.println("Size:"+size + " k:"+size/2 + " runs:"+ (end - start) );
        }

    }
}
