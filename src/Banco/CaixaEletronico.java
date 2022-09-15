package Banco;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ContaCorrente contaCorrente = new ContaCorrente();
		ContaSalario contaSalario = new ContaSalario();
				
			System.out.println("BEM VINDO  - -  CAIXA ELETRONICO ");
			System.out.println("");
			System.out.println("Digite o numero da sua conta : ");
			System.out.println("[1] - CONTA CORRENTE");
			System.out.println("[2] - CONTA SALARIO");
			System.out.println("[3] - CRIAR CONTA");
			Integer conta = scanner.nextInt();
			
				if(conta == 1) {
					contaCorrente.tipoConta();
					System.out.println(" ");
					System.out.println("ESCOLHA A SUA OPERACAO : ");
					System.out.println("[1] - VER CONTA | | [2] - SAIR CONTA");
					Integer opcao = scanner.nextInt();
					
					if(opcao == 1) {
						for(int i = 0; i<4;i++) {
							System.out.println("Escolha seu tipo de operação ");
							System.out.println(" ");
							System.out.println("[1] SACAR  - [2] DEPOSITAR - [3] SAIR ");
							Integer operacoes = scanner.nextInt();
								switch (operacoes) {
									case 1:
										System.out.println("Você escolheu SACAR");
										System.out.println("Você deseja sacar : ");
										Double saque = scanner.nextDouble();
										contaCorrente.sacar();			
										System.out.println("Dinheiro na conta " + contaCorrente.getSaldoconta());
										break;
									case 2: 
										System.out.println("Você escolheu DEPOSITAR");
										System.out.println(" ");
										System.out.println("Você deseja depositar : ");
										Integer depositar = scanner.nextInt();
										contaCorrente.depositar();
										break;
									case 3:
										System.out.println("VOCÊ SAIU DO PROGRAMA");
										System.out.println(" ");
										break;
								}
						}
					}else System.out.println("VOCÊ SAIU DO PROGRAMA");
				}
				else if(conta == 2){
					contaSalario.tipoConta();
				}
				else if(conta == 3) {
					System.out.println("1 2 3 - CRIANDO UMA CONTA");
				}
				
				
	}
}
 
