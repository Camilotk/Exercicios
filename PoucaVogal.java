import java.util.*;

/* Exercicio 10
 * Autor: Camilo Cunha de Azevedo
 * 
 *  O programa dever� ler uma letra e um n�mero N. 
 *  O programa dever� informar se a letra � uma vogal ou n�o,
 *  e caso for uma vogal, dever� mostrar na tela a vogal impressa N vezes. 
 */

public class PoucaVogal {
  public static void main (String[] args){
    char a = ' ';
    int b = 0;
    boolean v = false;
    
    Scanner ler = new Scanner(System.in);
    a = ler.next().charAt(0);
    
    switch(a) {
      case 'a': 
        v = true;
        break;
      case 'e':
        v = true;
        break;
      case 'i':
        v = true;
        break;
      case 'o':
        v = true;
        break;
      case 'u':
        v = true;
        break;
      default:
        v = false;
        break;
    }
    
    if(v){
      System.out.println("� vogal");
    } else {
      System.out.println("N�o � vogal");
    }
    
  }
}
