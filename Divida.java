//feito por Camilo Cunha, c�d 555062

import javax.swing.JOptionPane;

class Divida {
  public static void main (String args []) {
   Double valorInicial = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor inicial do seu D�bito?"));
   Double meses = Double.parseDouble(JOptionPane.showInputDialog(null, "A Quantidade de meses que se passou:"));
   Double juros = Double.parseDouble(JOptionPane.showInputDialog(null, "Quanto � o valor dos Juros (ao m�s)?"));
   if(juros>1) {
     juros = ((juros/100));
   }
   
   Double total = (valorInicial*juros*meses);
   JOptionPane.showMessageDialog(null, "O total de sua d�vida � "+total);
  }
}