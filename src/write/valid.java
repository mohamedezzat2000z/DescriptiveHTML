package write;

import java.io.Reader;
import java.io.StringReader;

public class valid {
	public boolean Validator(String x) {
		try {
			Reader reader = new StringReader(x+"\n");
			Write gen=new Write(reader);
			gen.create();
			return true;
			}
		    catch(Throwable e){
				return false;
			}
	}
}
