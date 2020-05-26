package tucker20ListsStacksQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

//executable class for employee class
public class Executable {

	public static void main (String[] args) {
		//create the array for Employee class holding at least 8 objects
		Employee[] arrayObjects = new Employee[8];
		arrayObjects[0] = new Employee("23232", "Baker", "Amy", 100000);
		arrayObjects[1] = new Employee("56789", "Jones", "Dan", 130000);
		arrayObjects[2] = new Employee("11111", "Scott", "Bob", 65000);
		arrayObjects[3] = new Employee("67765", "Jones", "Don", 140000);
		arrayObjects[4] = new Employee("12345", "Baker", "Tom", 200000);
		arrayObjects[5] = new Employee("12579", "Jones", "Pat", 80000);
		arrayObjects[6] = new Employee("45454", "Perez", "Ava", 105000);
		arrayObjects[7] = new Employee("24680", "Scott", "Ann", 90000);
		
		//create ArrayList from the array of Employee objects
		ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(arrayObjects));
		System.out.println("Staff Alpha sorted by names \n");
		
		//use a for each method and a lambda expression to print all employees alphabetically sorted by name
		employeeList.sort((Employee e1, Employee e2) -> e1.getLastName().compareTo(e2.getLastName()));
		employeeList.forEach((e) -> System.out.println(e));
		
		//create a LinkedList from the array list
		LinkedList<Employee> newLinkedList = new LinkedList<>(employeeList);
		
		//create an iterator capable of cycling both forward and backward through LinkedList
		ListIterator<Employee> iteration = newLinkedList.listIterator();
		
		//iterate forward through LinkedList
		System.out.println("\n Forward \n");
		while(iteration.hasNext()) {
			System.out.println(iteration.next());
		}
		
		//iterate backward through LinkedList
		System.out.println("\n Backward \n");
		while(iteration.hasPrevious()) {
			System.out.println(iteration.previous());
		}
	}
}
