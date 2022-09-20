package Banco;
import java.util.Scanner;

import Contas.ContaSalario;
import Contas.ContaCorrente;
import Dados.EscolhendoMetodo;

public class CaixaEletronico {
		
    public static void main(String[] args) {
    	
    	Scanner caixaeletronico = new Scanner(System.in);
    	
    	ContaSalario contasalario = new ContaSalario();
        ContaCorrente contacorrente = new ContaCorrente();
        
        int loop = 0;
        while(loop == 0) {
        	System.out.println(" ");
        	System.out.println(" --  DIGITE O NOME DA SUA CONTA --- ");
        	String numeroConta = caixaeletronico.next();
        	
        	if(contacorrente.getNomeConta().equals(numeroConta)) {
        		System.out.println(" ");
        		System.out.println(" -- CONTA ENCONTRADA -- ");
        		System.out.println(" ");
        		EscolhendoMetodo metodo = new EscolhendoMetodo();
                metodo.escolheracaocontaCorrente();
        		loop = 1;
        	}
        	if(contasalario.getNomeConta().equals(numeroConta)) {
        		System.out.println(" ");
        		System.out.println(" -- CONTA ENCONTRADA -- ");
        		System.out.println(" ");
        		EscolhendoMetodo metodo1 = new EscolhendoMetodo();
                metodo1.escolheracaocontaSalario();
        		loop = 1;
        	}
        	
        	else {
        		System.out.println("Conta não encontrada");
        	}
        }
        
        
	}
}
