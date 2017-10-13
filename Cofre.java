import java.util.*;

/* Exercicio 12
 * Autor: Camilo Cunha de Azvedo
 *
 * O programa dever� simular um sistema de cofre. A senha secreta � �1�, �2�, �3�. 
 * O programa dever� informar �liberado� caso os valores forem informados exatamente nessa ordem, caso
 * contr�rio dever� repetir mais 3 vezes. Caso o usu�rio n�o acerte at� a terceira tentativa, o programa
 * dever� informar que ficara bloqueado. Importante: o valor lido n�o dever� ser �123� e sim �1�, �2� e �3�. 
 */

public class Cofre {
  public static void main (String[] args){
    boolean a = false;
    boolean b = false;
    boolean c = false;
    char a1 = '1';
    char a2 = '2';
    char a3 = '3';
    Scanner ler = new Scanner(System.in);
    char b1 = 0;
    int erros = 0;
    
    //Senha 1
    for (int i = 0; i<3; i++) {
      System.out.println("Digite o primeiro n�mero da senha: ");
      b1 = ler.next().charAt(0);
      
      if (b1 == a1){
        a = true;
        break;
      }
      
      if (i==2) {
        System.out.println("bloqueado");
        System.exit(0);
      }
    }
    
    //Senha 2
    for (int i = 0; i<3; i++) {
      System.out.println("Digite o segundo n�mero da senha: ");
      b1 = ler.next().charAt(0);
      
      if (b1 == a2){
        b = true;
        break;
      }
      
      if (i==2) {
        System.out.println("bloqueado");
        System.exit(0);
      }
    }
    
     //Senha 3
      for (int i = 0; i<3; i++) {
      System.out.println("Digite o terceiro n�mero da senha: ");
      b1 = ler.next().charAt(0);
      
      if (b1 == a3){
        c = true;
        break;
      }
      
      if (i==2) {
        System.out.println("bloqueado");
        System.exit(0);
      }
    }
    
    if (a && b && c) {
      System.out.println("Liberado");
    }
  }
}
