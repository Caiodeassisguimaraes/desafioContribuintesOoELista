package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes voc? vai digitar? ");
		int quantityTaxPayer = sc.nextInt();

		for (int i = 0; i < quantityTaxPayer; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte: ");
			System.out.print("Renda anual com sal?rio: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com presta??o de servi?o: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos m?dicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
		}

		System.out.println();

		  int i = 1; 
		  for (TaxPayer taxPayerList : list) {
			  System.out.println("Resumo do "+ (i++) + "o contribuinte:");
			  System.out.println(taxPayerList); 
		  }

		/*for (int i = 0; i < list.size(); i++) {
			System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
			System.out.println(list);
		}*/

		sc.close();

	}

}
