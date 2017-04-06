package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.EmailAddresses;
import main.URLContent;

public class EmailAddressTest {
	@Test
	public void testFindEmailAddresses()
	{
    	String testString = "*** test@gmail.com&&^ test2@gmail.com((& test.test3@gmail.com";
    	ArrayList result = EmailAddresses.find(testString);
    	assertEquals(3, result.size());

    	testString = "test@yahoo.com&&^ ((& test.test3@yahoo.com&&^ ";
    	result = EmailAddresses.find(testString);
    	assertEquals(2, result.size());
	}

	@Test
	public void testGetURLContent()
	{
		String urlString = "www.facebook.com";
		Boolean result = URLContent.getContent(urlString);
		assertEquals(true, result);

		urlString = "www.google.com";
		result = URLContent.getContent(urlString);
		assertEquals(true, result);
	}
}
