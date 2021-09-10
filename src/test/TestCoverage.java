package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import junit.CoverageDemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class TestCoverage {
    public static CoverageDemo demo;
    @BeforeAll
    public static void beforeAll() {
        demo = new CoverageDemo();
    }

    @Test
    public void checkNumber_test_false() {
    	assertAll("checkFalse",()->assertFalse(demo.checkNumber(3, 2, 1)),
    			()->assertFalse(demo.checkNumber(5, 4, 0)));
    }
    @Test
    public void checkNumber_test_a_b_true() {
        assertAll("checkAB",()->assertTrue(demo.checkNumber(3, -1, 0)),
        		()->assertTrue(demo.checkNumber(10, 5, 0)),
        		()->assertTrue(demo.checkNumber(5, 2, 1)));
    }

    @Test
    public void checkNumber_test_b_c_true() {
        assertTrue(demo.checkNumber(5, 6, 5));
    }

    @Test
    public void checkNumber_test_c_true() {
        Assertions.assertTrue(demo.checkNumber(1, 2, -4));
    }
}



