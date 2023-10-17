package com.Jenkins.demo.dataservices.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.Jenkins.demo.dataservices.DataService;

@ExtendWith(MockitoExtension.class)
public class DataServiceTest {

	@InjectMocks
	private DataService dataService;

	@ParameterizedTest
	@ValueSource(strings = { "Are you down", "Are you up", "Any" })
	void testDataCreator(String givenInput) throws Exception {
		// given
		// when
		try {
			String actualOutput = dataService.dataCreator(givenInput);
			// then
			if (givenInput.equalsIgnoreCase("Are you up"))
				assertEquals("Yes", actualOutput);
			else if (givenInput.equalsIgnoreCase("Are you down"))
				assertEquals("No", actualOutput);
		} catch (Exception e) {
			assertEquals("This is not a valid input",e.getMessage());
		}
	}

}
