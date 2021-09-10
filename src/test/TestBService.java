package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.BService;
import java.math.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class TestBService {
    public static BService demo;
    BigDecimal mon=new BigDecimal(10.0);
    @BeforeAll
    public static void beforeAll() {
        demo = new BService();
    }

    @Test
    public void checkAMD() {
    	assertAll("checkAMD",()->assertFalse(demo.checkNumber(3, 2, 1)),
    			()->assertFalse(demo.checkNumber(5, 4, 0)));
    }
    @Test
    public void checkNumber_test_a_b_true() {
        assertAll("checkAB",()->assertEquals(demo.getRenMinBi(new BigDecimal(10), "AMD")),
        		()->assertTrue(demo.checkNumber(10, 5, 0)),
        		()->assertTrue(demo.checkNumber(5, 2, 1)));
    }

    @Test
    public void checkNumber_test_b_c_true() {
        Assertions.assertTrue(demo.checkNumber(5, 6, 5));
    }

    @Test
    public void checkNumber_test_c_true() {
        Assertions.assertTrue(demo.checkNumber(1, 2, -4));
    }
}




