import java.util.*;
/*Exercicio 2
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa dever� calcular a convers�o de km/h para m/s. 
 * O usu�rio dever� informar o valor em km/h 
 * e o programa dever� mostrar o valor da convers�o. 
 */

public class ConversaoKmM {
  public static void main (String[] args) {
    int kmh = 0;
    
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite o valor em Km/h: ");
    kmh = ler.nextInt();
    System.out.println("O resultado � "+(kmh/3.6)+" m/s.");
  }
}
