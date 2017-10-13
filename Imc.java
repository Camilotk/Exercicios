//feito por Camilo Cunha, c�d 555062

import javax.swing.JOptionPane;

class Imc {
  public static void main (String args []) {
    Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso:"));
    Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu altura:"));
    String sexo = JOptionPane.showInputDialog(null, "Digite seu sexo: \n[H] Homem [M] Mulher");
   
    Double imc = (peso/(Math.pow(altura, 2)));
    System.out.println(imc);
    
    switch (sexo) {
      case "H":
        if (imc<20.7) {
          JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso.");
      }else{
        if ((imc>=20.7) && (imc<=26.4)) {
          JOptionPane.showMessageDialog(null, "Voc� est� no peso ideal.");
        }else{
          JOptionPane.showMessageDialog(null, "Voc� est� acima do peso.");
        }
      }
        break;
        case "M":
        if (imc<19.1) {
          JOptionPane.showMessageDialog(null, "Voc� est� abaixo do peso.");
      }else{
        if ((imc>=19.1) && (imc<=25.8)) {
          JOptionPane.showMessageDialog(null, "Voc� est� no peso ideal.");
        }else{
          JOptionPane.showMessageDialog(null, "Voc� est� acima do peso.");
        }
      }
        break;
      case "Selvagem":
        JOptionPane.showMessageDialog(null, "O meu tamb�m �.");
        break;
      default:
        JOptionPane.showMessageDialog(null, "Voc� informou algo errado!");
        break;
    }
  }
}