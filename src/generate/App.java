package generate;

import write.Write;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        
        Generate asd=new Generate(System.in);
        StringBuilder sb = new StringBuilder();
        asd.create(sb);
        System.out.println("Syntax is okay\n"+sb.toString());        
        }catch(Throwable e){
        	
            System.out.println("Syntax check failed: ");
            e.printStackTrace();
        
	}

}
}
