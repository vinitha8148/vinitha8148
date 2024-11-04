import java.util.*;
import java.util.stream.Stream; 

public class stream2
{
	public static void main(String[] args) {
		Stream<String> st=Stream.of("vinitha","sabitha","https://www.geeksforgeeks.org/");
		
		st.filter(x->x.startsWith("https://")).forEach(System.out::println);


	}
}