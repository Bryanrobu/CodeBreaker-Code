package masterMind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> autos = new HashMap<>();
        autos.put("nee", "test1");
        autos.put("2", "test2");
        autos.put("3", "test3");
        
        System.out.println(autos.get("nee"));

	}
}
