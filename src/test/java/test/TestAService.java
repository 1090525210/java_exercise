package test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import junit.BService;
import mockito.AService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestAService {
	BigDecimal mon=new BigDecimal(10.0);
	@InjectMocks
	private AService aService;
	
	@Mock
	private BService mockedBS;
	
	@Test
	public void testJPY() throws Exception {
		Mockito.when(mockedBS.getRenMinBi(mon, "JPY")).thenReturn(mon.multiply(new BigDecimal(0.06)));
		
		Assertions.assertEquals(aService.getRenMinBi(mon, "JPY"), mon.multiply(new BigDecimal(0.06)).setScale(1, RoundingMode.HALF_UP));
		Mockito.verify(mockedBS).getRenMinBi(mon, "JPY");
	}
	
	@Test
	public void testAMD() throws Exception {
		Mockito.when(mockedBS.getRenMinBi(mon, "AMD")).thenReturn(mon.multiply(new BigDecimal(6.5)));
		
		Assertions.assertEquals(aService.getRenMinBi(mon, "AMD"), mon.multiply(new BigDecimal(6.5)).setScale(1, RoundingMode.HALF_UP));
		Mockito.verify(mockedBS).getRenMinBi(mon, "AMD");
	}
	
	@Test
	public void testCNY() throws Exception {
		Mockito.when(mockedBS.getRenMinBi(mon, "CNY")).thenReturn(mon);
		
		Assertions.assertEquals(aService.getRenMinBi(mon, "CNY"), mon.setScale(0, RoundingMode.HALF_UP));
		Mockito.verify(mockedBS).getRenMinBi(mon, "CNY");
	}

}
