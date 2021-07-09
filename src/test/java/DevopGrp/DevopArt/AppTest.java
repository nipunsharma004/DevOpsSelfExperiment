package DevopGrp.DevopArt;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        System.out.println("I am trying to trigger build in jenkins on each push via git to github, hoping to be successful");
        System.out.println("no it didn't work as per push so i scheduled it based on a time in build trigger jenkins");
        System.out.println("above worked hurray!");
        System.out.println("DevOps Testing Successful");
    }
}
