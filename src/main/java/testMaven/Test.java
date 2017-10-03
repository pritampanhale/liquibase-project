package testMaven;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws JsonProcessingException {
		
		
		Employee e = new  Employee();
		e.setId(12);
		e.setName("twelve");
		
		ObjectMapper mapper = new ObjectMapper();
		String writeValueAsString = mapper.writeValueAsString(e);
		System.out.println(writeValueAsString);
		
	}
}
