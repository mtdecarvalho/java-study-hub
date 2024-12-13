package problema_motivador_1_entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>(); 
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if (list.isEmpty())
			throw new IllegalStateException("List is empty");
		return list.get(0);
	}
	
	public void print() {
		System.out.print("[");
		for (T i : list) {
			if (list.getLast() == i)
				System.out.print(i);
			else
				System.out.print(i + ", ");
		}
		System.out.println("]");
	}
}
