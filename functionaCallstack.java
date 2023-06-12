
public class functionaCallstack
{
	public static void main(String[] args) {
		printHello();
		 System.out.println("All function end  ");
	}
	
	public static void printHello(){
	    System.out.println("Print Hello Started ");
	    PrintWorld();
		if(true){
		return ;
		}
	     System.out.println("Print Hello end");
	}
	
	public static void PrintWorld(){
	    System.out.println("Print World ");
	}
}

