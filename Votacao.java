//feito por Camilo Cunha, c�d 555062

import javax.swing.JOptionPane;

class Votacao {
  public static void main (String args []) {
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a sua idade?"));
    if (idade<16) {
      JOptionPane.showMessageDialog(null, "Voc� n�o pode votar.");
    }else{
      if (((idade>=16) && (idade<18)) || (idade>70)) {
        JOptionPane.showMessageDialog(null, "Seu voto � facultativo.");
      }else{
        JOptionPane.showMessageDialog(null, "Voc� � obrigado a votar.");
      }
    }
  }
}