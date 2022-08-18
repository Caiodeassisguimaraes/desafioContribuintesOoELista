package entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;

	public TaxPayer() {

	}

	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		super();
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public double getServicesIncome() {
		return servicesIncome;
	}

	public void setServicesIncome(double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public void setCapitalIncome(double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(double healthSpending) {
		this.healthSpending = healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public void setEducationSpending(double educationSpending) {
		this.educationSpending = educationSpending;
	}

	//Revisar os metodos para os calculos
	
	public double salaryTax() {
		double salaryTax;
		double salaryMonth = salaryIncome/12;
		if (salaryMonth < 3000.00) {
			salaryTax = 0.0;
		} else if (salaryMonth < 5000.00) {
			salaryTax = (salaryMonth * 0.1) * 12;
		} else {
			salaryTax = (salaryMonth * 0.2) * 12;
		}
		return salaryTax;
	}

	public double servicesTax() {
		double servicesTax;
		if (servicesIncome <= 0) {
			servicesTax = 0.0;
		} else {
			servicesTax = servicesIncome * 0.15;
		}
		return servicesTax;
	}

	public double capitalTax() {
		double capitalTax;
		if (capitalIncome > 0) {
			capitalTax = capitalIncome * 0.20;
		} else {
			capitalTax = 0.0;
		}
		return capitalTax;
	}

	public double grossTax() {
		//double grossTax;
		//grossTax = salaryTax() + servicesTax() + capitalTax();
		//return grossTax;
		return salaryTax() + servicesTax() + capitalTax();
	}

	public double taxRebate() {
		double taxRebate;
		if ((healthSpending + educationSpending) > (grossTax() * 30.0 / 100.0)) {
			taxRebate = grossTax() * 30.0 / 100.0;
		} else {
			taxRebate = healthSpending + educationSpending;
		}
		return taxRebate;

	}

	public double netSalary() {
		return grossTax() - taxRebate();
	}

	//Metodo toString esta certo
	
	public String toString() {
		return "Imposto bruto total: " + String.format("%.2f", grossTax()) + String.format("%n") 
		+ "Abatimento: " + String.format("%.2f", taxRebate()) + String.format("%n")
		+ "Imposto devido: " + String.format("%.2f", netSalary()) + String.format("%n");
	}
	
	/*public String toString() {
		return "Renda anual com salário: " + String.format("%.2f", salaryIncome) + String.format("%n") 
		+ "Renda anual com prestação de serviço: " + String.format("%.2f", servicesIncome) + String.format("%n")
		+ "Renda anual com ganho de capital: " + String.format("%.2f", capitalIncome) + String.format("%n")
		+ "Gastos médicos: " + String.format("%.2f", healthSpending) + String.format("%n")
		+"Gastos educacionais: "+ String.format("%.2f", educationSpending) + String.format("%n");
	}*/
	

}
