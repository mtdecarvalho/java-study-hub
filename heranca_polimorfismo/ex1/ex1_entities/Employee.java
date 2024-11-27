package ex1_entities;

public class Employee {
	protected String name;
	protected Integer hours;
	protected Double valuePerHours;
	
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}

	public Double payment() {
		return hours * valuePerHours;
	}
	
	public String toString() {
		return getName() + " - $ " + String.format("%.2f", payment());
	}
	
}
