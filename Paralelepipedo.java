import java.util.*;
import javax.swing.*;

/* Exerc�cio 1
 * Autor: Camilo Cunha de Azevedo
 * Disciplina: LAB POOI
 * 
 * O programa dever� calcular o volume de um paralelep�pedo (mostrar para o usu�rio),
 * sendo que o usu�rio dever� informar a altura, largura e profundidade do objeto: V = a.b.c
 */

public class Paralelepipedo {
  public static void main(String[] args){
    Double a = 0.0d;
    Double b = 0.0d;
    Double c = 0.0d;
    
    a = Double.parseDouble(JOptionPane.showInputDialog("Qual � o seu nome?"));
    b = Double.parseDouble(JOptionPane.showInputDialog("Informe a largura: "));
    c = Double.parseDouble(JOptionPane.showInputDialog("Informe a profundidade: "));
   
    JOptionPane.showMessageDialog(null,a*b*c);
    
    
  }
}
