package BasicJava1;

public class nested_if {
	public static void main(String[] args) {
		String UN ="Minal";
		String pwd="minal@1111";
		
		if(UN == "Minal") {
			System.out.println("user name is correct");
			
			if(pwd=="minal@1111") {
				System.out.println("pass correct");
				System.out.println("lodin succesfully");
				
			}
			else {
				System.out.println("password wrong");
				System.out.println("login fail");
			}	
			}
			else 
			{
				System.out.println("invalid username");
				System.out.println("login failed");
				
			}
			
		}
	}


