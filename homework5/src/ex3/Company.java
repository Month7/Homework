package ex3;

public class Company {
	Employee [] employee;
	double salaries=0;
	public Company(Employee [] employee){
		this.employee=employee;
	}
	public double salariesPay(){
		salaries=0;
		for(int i=0;i<employee.length;i++){
			salaries+=(employee[i].earnings());
		}
		
		return salaries;
	}
}
