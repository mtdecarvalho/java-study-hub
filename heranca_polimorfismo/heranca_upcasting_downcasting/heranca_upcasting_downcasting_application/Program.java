package heranca_upcasting_downcasting_application;

import heranca_upcasting_downcasting_entities.Account;
import heranca_upcasting_downcasting_entities.BusinessAccount;
import heranca_upcasting_downcasting_entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// A conversão é feita sem nenhum problema, pois toda subclasse de Account é uma Account também.
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		// É preciso fazer um casting explícito.
		
		/*
		BusinessAccount acc5 = (BusinessAccount)acc3;
		acc3 foi instanciada como SavingsAccount, e não como BusinessAccount, portanto isso vai dar um erro.
		Nesse caso não é detectado um erro pelo compilador, porém ao executar, vai ser detectado um erro 
		e uma exceção será gerada.
		
		Para contornarmos esse comportamento, usamos a palavra instanceof para checar se acc3 é uma instância válida
		de BusinessAccount antes de fazer o casting.
		*/
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
		} else if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Updated balance!");
		}
		
		// O programa não vai entrar no primeiro if, e vai entrar no segundo if
		// Dessa forma não ocorre erro e o downcasting é feito corretamente.
		
	}

}
