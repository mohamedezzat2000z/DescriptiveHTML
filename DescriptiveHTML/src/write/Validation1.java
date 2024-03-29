package write;

import static org.junit.Assert.*;

import org.junit.Test;

public class Validation1 {

	@Test
	public void test() {
		valid parser = new valid();
		assertFalse(parser.Validator("ADD PARAGRAPH WITH WITH FONT \"Arial\" AND TEXT \"Good bye\""));
		assertFalse(parser.Validator("ADD IMAGE WITH SOURCE"));
		assertFalse(parser.Validator(""));
		assertTrue(parser.Validator("ADD LINK WITH TEXT \"Click Me 1.2.3\" AND WITH LINK \"www.facebook.com\" WITH COLOR \"BLUE\" AND WITH FONT \"Consolas\""));
		assertFalse(parser.Validator("ADD HEADING WITH TEXT \"Hello World!\""));
		assertTrue(parser.Validator("ADD HEADING WITH TEXT \"Hello World\""));
		assertTrue(parser.Validator("ADD PARAGRAPH WITH TEXT \"this is a paragraph text\""));
		assertTrue(parser.Validator("ADD IMAGE WITH SOURCE \"image.JPG\""));
		assertTrue(parser.Validator("ADD LINK WITH TEXT \"Search\" AND WITH LINK \"http://google.com\""));
		assertFalse(parser.Validator("HEADING WITH TEXT \"wrong input\""));
	}

}