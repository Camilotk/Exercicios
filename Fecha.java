import java.util.*;
/* Exercicio 4
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa dever� informar inicialmente: �Para sair, digite �x��. 
 * Ap�s, dever� esperar que o usu�rio digite uma letra
 * Para qualquer letra diferente de �x� o programa dever� repetir a pergunta. 
 * Caso �x� seja digitado, o programa finaliza. 
 */
public class Fecha {
  public static void main(String[] args) { 
    char x = ' ';
    Scanner ler = new Scanner(System.in);
    
    while (x!='x') {
      System.out.println("Para sair, digite �x�");
      x = ler.next().charAt(0);
    }
    
  }
}
