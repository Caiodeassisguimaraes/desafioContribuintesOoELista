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

		System.out.print("Quantos contribuintes você vai digitar? ");
		int quantityTaxPayer = sc.nextInt();

		for (int i = 0; i < quantityTaxPayer; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte: ");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			//TaxPayer contribuinte = new TaxPayer (salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);
			//list.add(contribuinte);
			list.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
			
			//list.get(salaryIncome).salaryTax();
		}
		/*int i = 1;
		for (TaxPayer taxPayerList : list) {
			//System.out.println("Resumo do "+ (i++)+"o contribuinte:");
			double salaryTax = taxPayerList.getSalaryIncome();
			taxPayerList.salaryTax(list.indexOf(salaryIncome));
		}*/

		System.out.println();
		//List<TaxPayer> listResult = list.stream().filter(listResult.).collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
			System.out.println(list);
			//System.out.println("Tributacao do Salario: " + list.get(i).salaryTax(list.get(i).getSalaryIncome()));
			
			/*System.out.println("Tributacao do Salario: " + list.get(i).salaryTax());
			System.out.println("Tributacao do Servico: " + list.get(i).servicesTax());
			System.out.println("Tributacao sobre o Ganho de Capital: " + list.get(i).capitalTax());
			
			System.out.println("Imposto bruto total: " + list.get(i).grossTax());*/
			//list.get(i).getSalaryIncome();
		}

		sc.close();

	}

}
