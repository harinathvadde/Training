package dc.zeroco.list;

public class Employee {

	String id;
	String name;
	int exp;
	double sal;
	
	public Employee(String id, String name, int exp, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", exp=" + exp + ", sal=" + sal + "]";
	}
}
