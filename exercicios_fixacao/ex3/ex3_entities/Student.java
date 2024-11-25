package ex3_entities;

public class Student {
	public String name;
	public double n1, n2, n3;

	public double finalGrade() {
		return n1 + n2 + n3;
	}

	public String pass() {
		return finalGrade() >= 60 ? "PASS" : String.format("FAILED\nMISSING %.2f POINTS", 60 - finalGrade());
	}

	public String toString() {
		return name + ", " + n1 + ", " + n2 + ", " + n3;
	}
}
