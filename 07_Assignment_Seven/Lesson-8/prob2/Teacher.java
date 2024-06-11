<<<<<<< HEAD
package w3l8.prob2;

public final class Teacher{
=======
package Lesson8.Problem2;

public final class Teacher implements EmployeeData{
>>>>>>> 7209dfc68a743601ea26335f09fa51c28b04fc15
	private double bonus;
	private String name;
	private double salary;
	public Teacher(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return salary + bonus;
	}
	public double getBonus() {
		return bonus;
	}
	public String getName() {
		return name;
	}
}
