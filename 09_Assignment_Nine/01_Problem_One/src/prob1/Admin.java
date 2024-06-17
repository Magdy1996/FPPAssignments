package prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key, Student> myHashMap = new HashMap<>();
		for(Student s : students){
			Key k1 =new Key(s.getFirstName(),s.getLastName());
			myHashMap.put(k1,s);
		}

		return myHashMap;
	}
}
