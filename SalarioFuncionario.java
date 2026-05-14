package Nnica;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double soma = 0.0;
		int quantidade = 10;
		
		System.out.println("===== SOMA DE SALÁRIO DOS FUNCIONARIOS ======\n");
		
		for(int i= 1 ; i <= quantidade ; i++) {
			System.out.println(" Digite o salário do funcionario" + i + ": R$");
			double salario = scanner.nextDouble();
			soma += salario;
					}
		
	System.out.println("\n ========================");
	System.out.println("Total de Funcionario" + quantidade);
	System.out.println("Soma total dos salarios : R$" + (soma/quantidade));
	System.out.println("============================");
	
	scanner.close();
	
	
	}
	

}
