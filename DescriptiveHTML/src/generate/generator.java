package generate;

import static org.junit.Assert.*;

import org.junit.Test;

public class generator {

	@Test
	public void test() {
		Parser parser = new Parser();
		assertEquals("Error",parser.parsing(""));
		assertEquals("<h1>Hello World</h1>",parser.parsing("ADD HEADING WITH TEXT \"Hello World\""));
		assertEquals("<img src=\"image.JPG\" />",parser.parsing("ADD IMAGE WITH SOURCE \"image.JPG\""));
		assertEquals("<a src=\"www.facebook.com\"style=\"font-family:Consolas;color:BLUE;\">Click Me 1.2.3</a>",parser.parsing("ADD LINK WITH TEXT \"Click Me 1.2.3\" AND WITH LINK \"www.facebook.com\" WITH COLOR \"BLUE\" AND WITH FONT \"Consolas\""));
		assertEquals("<p>this is a paragraph text</p>",parser.parsing("ADD PARAGRAPH WITH TEXT \"this is a paragraph text\""));
	}

}
