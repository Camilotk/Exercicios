import java.util.*;

/* Exercicio 11
 * Autor: Camilo Cunha de Azevedo
 * 
 *  O programa dever� ler o nome de uma pessoa, letra por letra, 
 * e informar se o nome digitado foi �Jean� ou n�o.
 */

public class ComparaStringJean {
  public static void main (String[] args) {
    String j = "JEAN";
    Scanner ler = new Scanner(System.in);
    String s = " ";
    s = ler.next();
    s = s.toUpperCase();
    
    if (j.equals(s)) {
      System.out.println("�");
    }else {
      System.out.println("N�o");
    }
      
    }
}