import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
class HelloUser {
	public HelloUser (String userName) {
		
	}
}

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");
		System.out.print("Please enter your name: ");
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		String userName = new String();
		
		try {
			userName = buffer.readLine();
		} catch(IOException e) {
			System.out.println(e.toString());
		} finally {
			HelloUser user = new HelloUser(userName);
			System.out.println("Hello " + userName + "!");
		}
	}

}
