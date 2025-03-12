
/*Implemente um programa em Java que receba o saldo inicial de uma conta bancária 
e três transações (positivas para depósitos e negativas para saques). 
O programa deve calcular e exibir o saldo final da conta.*/

// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class SintaxeJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        // TODO: Na linha abaixo, implemente a entrada das três transações:
        double valor1 = scanner.nextDouble();
        double valor2 = scanner.nextDouble();
        double valor3 = scanner.nextDouble();
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial+valor1+valor2+valor3;
        
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}