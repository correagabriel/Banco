package Dados;
import java.util.Scanner;
import Contas.ContaSalario;
import Contas.ContaCorrente;

public class EscolhendoMetodo {
		
        Scanner escolha = new Scanner(System.in);
        
        ContaSalario contasalario = new ContaSalario();
        ContaCorrente contacorrente = new ContaCorrente();

        public void escolheracaocontaCorrente () {
            System.out.println(" -- BEM VINDO AO CAIXA ELETRONICO -- ");
            System.out.println(" -- ESCOLHA SUA OPERAÇÃO --  ");
            System.out.println(" ");
            System.out.println(" [1] - SACAR | |  [2] - DEPOSITAR | | [3] - SAIR ");
            int operacoes = escolha.nextInt();
            
            	switch (operacoes) {
            		case 1:
            			contacorrente.sacar();
            			System.out.println(" ");
            			System.out.println(" -- SAQUE REALIZADO COM SUCESSO -- ");
            			System.out.println(" ");
            			escolheracaocontaCorrente ();
            			break;
            		case 2:
            			contacorrente.depositar();
            			System.out.println(" ");
            			System.out.println(" -- DEPOSITO REALIZADO COM SUCESSO -- ");
            			System.out.println(" ");
            			escolheracaocontaCorrente ();
            			break;
            		case 3:
            			System.out.println(" -- SAINDO DO SISTEMA -- ");
            			break;
            	}
        }
        
        public void escolheracaocontaSalario ( ) {
        	System.out.println(" -- BEM VINDO AO CAIXA ELETRONICO -- ");
        	System.out.println(" ");
        	System.out.println(" -- ESCOLHER SUA OPERAÇÃO -- ");
        	System.out.println(" [1] - SACAR | | [2] - VER SALDO | | [3] - SAIR ");
        	int operacoes = escolha.nextInt();
        	
        		switch(operacoes) { 
        		case 1:
        			contasalario.sacar();
        			System.out.println(" - SAQUE REALIZADO COM SUCESSO - ");
        			System.out.println(" ");
        			escolheracaocontaSalario ();
        			break;
        			
        		case 2: 
        			System.out.println(" ");
        			contasalario.versaldo();
        			
        		case 3: 
        			System.out.println(" -- SAINDO DA CONTA -- ");
        		}
        		
        }
}

