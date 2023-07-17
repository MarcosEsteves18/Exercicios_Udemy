import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Funcionario> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int employees = sc.nextInt();
		
		for(int i = 0; i < employees; i++) {
			System.out.println();
			System.out.println("Employees #" + (i+1) + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Funcionario func = new Funcionario(id, name, salary);
			
			list.add(func);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idSalary = sc.nextInt();
		
		Funcionario func = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		if(func == null) {
			System.out.print("This id does ot exist! ");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}
		
//		Integer pos = position(list, idSalary);
//		if(pos == null) {
//			System.out.print("This id does ot exist! ");
//		}else {
//			System.out.print("Enter the percentage: ");
//			double percentage = sc.nextDouble();
//			list.get(pos).increaseSalary(percentage);
//		}
		
		System.out.println();
		System.out.println("List of Employees: ");
		for(Funcionario emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(ArrayList<Funcionario> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
