package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.print("Número: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Informe a quantia a sacar: ");
		double amount = sc.nextDouble();
		try {
			account.withdraw(amount);
			System.out.println("Novo saldo: " + account.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
}
