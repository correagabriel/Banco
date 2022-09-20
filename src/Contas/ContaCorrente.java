package Contas;
import java.util.Scanner;

public class ContaCorrente {
    Scanner contacorrente = new Scanner(System.in);

    String nomeConta = "Gabriel";
    int numeroConta = 9872;
    String nomeBanco = "Santander";
    double saldo = 1500;
    double saldoFinal;

    /*
     * get e set nada mais são que métodos, que freqüentemente vemos em classes de Java.
        Eles servem para pegarmos informações  de variáveis da classe que são definidas como 'private', porém esses método são definidos como 'public'.
     */

    //Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
    //Usamos get para obter informações. Esse tipo de método sempre retorna um valor.

    //NOME CONTA 
    public String getNomeConta() {
        return nomeConta;
    }
    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    //NUMERO CONTA
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    //NOME BANCO
    public String getNomeBanco() {
        return nomeBanco;
    }
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    //SALDO CONTA
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

        //metodo sacar
        public void sacar (){
            System.out.println("Quantidade que irá sacar : ");
            Double valorsaque = contacorrente.nextDouble();
            if(valorsaque <= getSaldo() ){
                saldoFinal = getSaldo() - valorsaque;
                System.out.println("");
                System.out.println("Você sacou : " + valorsaque);
                setSaldo(saldoFinal);
                System.out.println("Saldo Atual : " + getSaldo());
            }else { 
                System.out.println("Saldo Isuficiente ");
            }
        }

        //metodos DEPOSITAR 
        public void depositar (){
            System.out.println("Quantidade que irá depositar : ");
                double valordeposito = contacorrente.nextDouble();
                saldoFinal = getSaldo() + valordeposito;
                setSaldo(saldoFinal);
        }
        


}