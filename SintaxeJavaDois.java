/*
Crie um programa que classifique os clientes de um banco com 
base no saldo de suas contas. O programa deve receber o saldo 
e classificá-lo em três categorias:

    "Negativado" para saldos abaixo de zero.
    "Baixo" para saldos entre 0 e 500, inclusive.
    "Confortavel" para saldos acima de 500.
*/


// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class SintaxeJavaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();

        // TODO: Implemente a classificação do cliente com base no saldo:
        if (saldo < 0){
            System.out.println("Negativado");
        }else{
            if (saldo >= 0 && saldo <= 500){
                System.out.println("Baixo");
            }else{
                System.out.println("Confortavel");
            }
        }
        scanner.close();
    }
}
