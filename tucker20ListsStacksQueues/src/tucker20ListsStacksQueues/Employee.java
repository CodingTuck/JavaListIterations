package tucker20ListsStacksQueues;

class Employee {
	
	//create the attributes for employees (private)
			private String id;
			private String lastName;
			private String firstName;
			private int salary;

	//create parameterized constructor
	public Employee(String id, String lastName, String firstName, int salary) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	//getters for the attributes
	public String getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	
	//toString method to display an employee's attributes
	@Override
	public String toString() {
		return "ID " + id + ":" + lastName + ", " + firstName + ", " + "salary $" + salary; 
	}
}











