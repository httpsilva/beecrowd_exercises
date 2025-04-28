/*
Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
 */

import java.util.Scanner;
public class BEE1018 {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    int valor, c100, c50, c20, c10, c5, c2, c1, resto;
    // entrada
    valor = teclado.nextInt();
    // processamento
    c100 = valor / 100;
    resto = valor % 100;

    c50 = resto / 50;
    resto = resto % 50;

    c20 = resto / 20;
    resto = resto % 20;

    c10 = resto / 10;
    resto = resto % 10;

    c5 = resto / 5;
    resto = resto % 5;

    c2 = resto / 2;
    c1 = resto % 2;

    // saída
    System.out.println(valor);
    System.out.println(c100 + " nota(s) de R$ 100,00");
    System.out.println(c50 + " nota(s) de R$ 50,00");
    System.out.println(c20 + " nota(s) de R$ 20,00");
    System.out.println(c10 + " nota(s) de R$ 10,00");
    System.out.println(c5 + " nota(s) de R$ 5,00");
    System.out.println(c2 + " nota(s) de R$ 2,00");
    System.out.println(c1 + " nota(s) de R$ 1,00");

    teclado.close();
  }
}