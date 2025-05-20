/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

Entrada
O arquivo de entrada contém 4 valores inteiros.

Saída
Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 */

import java.util.Scanner;
public class BEE1007 {
  public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
    int A, B, C, D, DIFERENCA;
    // entrada
    A = teclado.nextInt();
    B = teclado.nextInt();
    C = teclado.nextInt();
    D = teclado.nextInt();
    // processamento
    DIFERENCA = (A * B - C * D);
    // saída
    System.out.println("DIFERENCA = " + DIFERENCA);

    teclado.close();
  }
}