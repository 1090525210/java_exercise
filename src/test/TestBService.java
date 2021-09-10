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
    public void checkNull() {
    	Throwable exception = assertThrows(Exception.class, () -> demo.getRenMinBi(null, "SGP"));
        assertEquals("money cannot be null", exception.getMessage());
    }
    @Test
    public void checkAMD() {
        assertAll("checkAMD",()->assertEquals(demo.getRenMinBi(mon,"AMD"), mon.multiply(new BigDecimal(6.5)))
        		);
    }

    @Test
    public void checkJPY() {
    	assertAll("checkjpy",()->assertEquals(demo.getRenMinBi(mon,"JPY"), mon.multiply(new BigDecimal(0.06)))
        		);    
    	}
    
    @Test
    public void checkCNY() {
    	assertAll("checkcny",()->assertTrue(demo.getRenMinBi(mon,"CNY").compareTo(mon)==0),
    			()->assertEquals(demo.getRenMinBi(mon,"CNY"), mon)
        		);    
    	} 
    
    @Test
    void exceptionTesting() {        
        Throwable exception = assertThrows(Exception.class, () -> demo.getRenMinBi(mon, "SGP"));
        assertEquals("unknown type:SGP", exception.getMessage());
    }

  
    @Test
    public void checkjpy() {
    	try {
			Assertions.assertEquals(demo.getRenMinBi(mon,"JPY"), mon.multiply(new BigDecimal(0.06)));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}




