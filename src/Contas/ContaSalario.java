package Contas;
import  java.util.Scanner;

public class ContaSalario {
    Scanner contasalario = new Scanner(System.in);
    String nomeConta = "Milena Fernandes";
    int numeroConta = 9872;
    String nomeBanco = "Nubank";
    double saldo = 1800;
    double saldofinal = 0;

    //NOME CONTA
    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }
    public String getNomeConta() {
        return nomeConta;
    }

    //NOME BANCO
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
    public String getNomeBanco() {
        return nomeBanco;
    }       

    //NUMERO CONTA
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    //SALDO
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        public void sacar(){
            System.out.println(" -- SACAR -- ");
            System.out.println("Quantidade que irá sacar : ");
            Double valorsaque = contasalario.nextDouble();
            if(valorsaque <= getSaldo() ){
                saldofinal = getSaldo() - valorsaque;
                System.out.println("Você sacou : " + valorsaque);
                System.out.println("Saldo Atual : " + getSaldo());
            }else { 
                System.out.println("Saldo Isuficiente ");
            }
        }
} 
