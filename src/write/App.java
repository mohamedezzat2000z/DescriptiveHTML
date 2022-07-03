package write;
public class App {
	public static void main(String[] args) throws ParseException{
        try {
        Write asd=new Write(System.in);
        asd.create();
        System.out.println("Syntax is okay");
        
        }catch(Throwable e){
            System.out.println("Syntax check failed: " + e.getMessage());
        }
	}
}
