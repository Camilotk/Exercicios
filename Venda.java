//feito por Camilo Cunha, c�d 555062

import javax.swing.JOptionPane;

class Venda {
  public static void main (String args [])  {
    String opc = JOptionPane.showInputDialog(null, "Digite o c�digo: \n\nC�digo   Aumento \n1             10% \n3             25% \n4             30% \n8             50%\n ");
    Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do Produto:"));
    
    Double aumento = 0.00;
    
    switch (opc) {
      case "1":
        aumento = (valor*0.10);
        JOptionPane.showMessageDialog(null, "O valor total ap�s o acr�scimo de 10% � "+(valor+aumento));
        break;
      case "3":
        aumento = (valor*0.25);
        JOptionPane.showMessageDialog(null, "O valor total ap�s o acr�scimo de 25% � "+(valor+aumento));
        break;
      case "4":
        aumento = (valor*0.30);
        JOptionPane.showMessageDialog(null, "O valor total ap�s o acr�scimo de 30% � "+(valor+aumento));
        break;
      case "8":
        aumento = (valor*0.50);
        JOptionPane.showMessageDialog(null, "O valor total ap�s o acr�scimo de 50% � "+(valor+aumento));
        break;
      default:
        JOptionPane.showMessageDialog(null, "C�digo n�o encontrado.");
                                      
  }
 }
}