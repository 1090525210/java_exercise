package test;

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
	@InjectMocks
	private AService aService;
	
	@Mock
	private BService mockedBS;

}
