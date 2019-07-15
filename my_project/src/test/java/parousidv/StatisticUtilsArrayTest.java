package parousidv;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StatisticUtilsArrayTest {

    @Test
    public void shouldAnswerTrue()
    {
        StatisticUtilsArray tester = new StatisticUtilsArray();
        //@tol : The number of decimals which must be thw same (tolerance)
        int tol = 5;

        //assert statements
        assertEquals(1.2,tester.min(tester.descriptiveStatistics),tol);
        assertEquals(4.5,tester.max(tester.descriptiveStatistics),tol);
        assertEquals(2.3,tester.median(tester.descriptiveStatistics),tol);
        assertEquals(2.666666666,tester.mean(tester.descriptiveStatistics),tol);
        assertEquals(1.680277754,tester.standDev(tester.descriptiveStatistics),tol);

    }

}
