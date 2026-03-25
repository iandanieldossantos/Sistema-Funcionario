package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID: ");
		int id = sc.nextInt();
		System.out.print("Nome do funcionario: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Salario: ");
		double salario = sc.nextDouble();
		
		Employee employee = new Employee(id, nome, salario);
		
		System.out.println("Dados: ");
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Porcentagem de aumento: ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);

		System.out.println("Dados atualizados: ");
		System.out.println(employee);
			
		sc.close();
	}
}
