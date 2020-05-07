import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculating {
    double x;
    private static final double DELTA = 1e-15;


    @Before
    public void setUP(){
        x = 14;
    }

    @Test (expected = Except.class)
    public void TC1() throws Except{
        double expected = 25244.292;
        double res = new Calculating(79).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test
    public void TC2() throws Except{
        double expected = 762.692;
        double res = new Calculating(x).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC3() throws ExceptString{
        double expected = 7780.124;
        double res = new Calculating("  4  4").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test (expected = Except.class)
    public void TC4() throws Except{
        double expected = 11781.619;
        double res = new Calculating(-9).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC5() throws Except{
        double expected = 11781.619;
        double res = new Calculating(- 7).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC6() throws Except{
        double expected = 11781.619;
        double res = new Calculating(-   14).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC7() throws Except{
        double expected = 11781.619;
        double res = new Calculating(- 389).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = ExceptString.class)
    public void TC8() throws ExceptString{
        double expected = 11781.619;
        double res = new Calculating( "23,9").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test
    public void TC9() throws Except{
        double expected = 5340562.549407999;
        double res = new Calculating( 23,9).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC10() throws Except{
        double expected = 5097410.05;
        double res = new Calculating( 23.).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC11() throws Except{
        double expected = 845462.549;
        double res = new Calculating( 23.9).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test (expected = ExceptString.class)
    public void TC12() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "23.,9").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC13() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "yoi").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC14() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "9cvb").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC15() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC16() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "+").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test (expected = ExceptString.class)
    public void TC17() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "(93").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Incorrect entry.
    }

    @Test
    public void TC18() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( "    ").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test
    public void TC19() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( " ").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test
    public void TC20() throws ExceptString{
        double expected = 845462.549;
        double res = new Calculating( " ").equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - ...
    }

    @Test (expected = Except.class)
    public void TC21() throws Except{
        double expected = 845462.549;
        double res = new Calculating(1).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test (expected = Except.class)
    public void TC22() throws Except{
        double expected = 845462.549;
        double res = new Calculating(-3).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test
    public void TC23() throws Except{
        double expected = 7781.557;
        double res = new Calculating(49).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test
    public void TC24() throws Except{
        double expected = 4358.8427;
        double res = new Calculating(41,7).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test(expected = Except.class)
    public void TC25() throws Except{
        double expected = 19967.246;
        double res = new Calculating(-9.45).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test(expected = Except.class)
    public void TC26() throws Except{
        double expected = 16967.8542;
        double res = new Calculating(71.4).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Except: Wrong range
    }

    @Test(expected = Except.class)
    public void TC27() throws Except{
        double expected = 23957.6248;
        double res = new Calculating(-1.89).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }

    @Test(expected = Except.class)
    public void TC28() throws Except{
        double expected = 9285.97435;
        double res = new Calculating(-1).equation3();
        Assert.assertEquals(expected, res, DELTA);
        // Expected Output - Результат обчислення
    }
}
