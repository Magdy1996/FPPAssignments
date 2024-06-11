<<<<<<< HEAD
package w3l8.prob2;
=======
package Lesson8.Problem2;
>>>>>>> 7209dfc68a743601ea26335f09fa51c28b04fc15
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
<<<<<<< HEAD
	public static double computeSumOfSalaries(List/*<implement>*/ aList) {
		return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return
=======
	public static double computeSumOfSalaries(List<EmployeeData> employees) {
		//return 0.0;
		//implement
		//compute sum of all salaries of people in aList and return
		double sum = 0.0;
		if(employees == null) return sum;
		for(EmployeeData emp : employees) {
			if(emp != null){
				sum += emp.getSalary();
			}
		}
		return sum;
>>>>>>> 7209dfc68a743601ea26335f09fa51c28b04fc15
	}
}
