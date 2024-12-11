package combodevice_application;

import combodevice_entities.ComboDevice;
import combodevice_entities.ConcretePrinter;
import combodevice_entities.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("8090");
		p.processDoc("My letter");
		p.print("My letter");
		System.out.println();
		
		ConcreteScanner s = new ConcreteScanner("1090");
		s.processDoc("My email");
		System.out.println("Scan result: " + s.scan());
		System.out.println();
		
		ComboDevice cd = new ComboDevice("1880");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());
		
		
	}

}
