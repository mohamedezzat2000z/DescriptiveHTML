package generate;

import java.io.Reader;
import java.io.StringReader;


public class Parser {
	
	public String parsing(String x) {
		try {
			Reader reader = new StringReader(x+"\n");
			Generate asd=new Generate(reader);
			String out=asd.create();
			return out;
			}
		    catch(Throwable e){
				return "Error";
			}
	}

}