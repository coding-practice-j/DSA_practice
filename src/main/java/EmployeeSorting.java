import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeSorting {

	public static void main(String[] args) {
		Employee employee = new Employee(11, "Ram", 22, 8000, "male", Arrays.asList("chennai", "pune"));
		Employee employee2 = new Employee(12, "Sohan", 24, 12000, "male", Arrays.asList("hyderabad", "pune"));
		Employee employee3 = new Employee(22, "Riya", 25, 30000, "female", Arrays.asList("noida", "pune"));
		Employee employee4 = new Employee(33, "Juhi", 21, 15000, "female", Arrays.asList("chennai", "gurgaon"));
		Employee employee5 = new Employee(44, "Divya", 26, 18000, "female", Arrays.asList("hyderabad", "bengaluru"));
		Employee employee6 = new Employee(55, "Ankita", 22, 22000, "female", Arrays.asList("chennai", "hyderabad"));
		
		
		List<Employee> list = new ArrayList<>();
		list.add(employee);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		
		//list.sort(Collections.reverseOrder());
		
		Map<String, String> map1 = new TreeMap<>(); 
		
		List<Integer> list1 = Arrays.asList(4,7,1,4,8);
		
		list1.sort(Collections.reverseOrder());
		
		//System.out.println(list1);
		
		String str = "sakshi Jain";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i =0; i<str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		
		map.entrySet().stream().filter(e -> e.getValue() > 1).forEach(System.out::println);
		
		 String str1 = new String("JAVA").intern();
		 String str2 = "JAVA";

		 System.out.println(str1.equals(str2));
		 System.out.println(str1==str2);
		
	}

}
