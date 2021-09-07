//Object类 P16
package objectP16;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
	private int sapId;
	private String name;
	private double salary;
	private LocalDate hireDay;
	private LocalDate newDay;
	
	public Employee(int sapId, String name, double salary, int year, int month, int day) {
		this.sapId=sapId;
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year,month,day);
		newDay= hireDay.plusMonths(6);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Employee other = (Employee) obj;
		if(hireDay == null) {
			if(other.hireDay != null) {
				return false;
			}
		}else if(!hireDay.equals(other.hireDay)) {
			return false;
		}
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		if(Double.doubleToLongBits(salary)!=Double.doubleToLongBits(other.salary)) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String hire = hireDay.format(fmt);
		String start = newDay.format(fmt);
		return getClass().getName() + "[sapId=" + sapId +", name=" + name + ", salary=" + salary + ", hireDay=" + hire + ", 转正=" + start+ "]"; 
	}
	
	@Override
	public int hashCode() {
		int result = 11* name.hashCode()+ 13* new Double(salary).hashCode() + 7* hireDay.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1000,"Jerry",10000,2021,9,6);
		Employee emp2 = new Employee(1000,"Jerry",10000,2021,9,6);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println("The hashcode of them is same?" + (emp1.hashCode()==emp2.hashCode()));
		System.out.println("Are they equal?"+ emp1.equals(emp2));
	}
}
