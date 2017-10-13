//feito por Camilo Cunha, c�d 555062

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class Calculos {
  public static void main (String args []) {
    String opc = JOptionPane.showInputDialog(null, "Digite o n�mero correspondente a figura que deseja calular: \n1 - C�rculo; \n2 - Tri�ngulo; \n3 - Quadrado; \n4 - Ret�ngulo.");
    switch (opc) {
      case "1":
        Double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o raio:"));
        Double area = 0.00;
        area = (Math.PI*Math.pow(raio, 2));   
        DecimalFormat df = new DecimalFormat("0.00");
        String numFormatado = df.format(area);
        JOptionPane.showMessageDialog(null, "�rea do C�rculo � "+numFormatado);
        break;
      case "2":
        Double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Tri�ngulo:"));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Tri�ngulo:"));
        area = ((base*altura)/2);
        DecimalFormat nf = new DecimalFormat("0.00");
        String numFormatad = nf.format(area);
        JOptionPane.showMessageDialog(null, "A �rea do Triangulo � "+numFormatad);
        break;
      case "3":
        Double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado do Quadrado:"));
        area = (lado*lado);
        DecimalFormat f = new DecimalFormat("0.00");
        String numFormato = f.format(area);
        JOptionPane.showMessageDialog(null, "A �rea do Quadrado � "+numFormato);
        break;
      case "4":
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a base do Ret�ngulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura do Tri�ngulo:"));
        area = (base*altura);
        DecimalFormat fo = new DecimalFormat("0.00");
        String numFormat = fo.format(area);
        JOptionPane.showMessageDialog(null, "A �rea do Ret�ngulo � "+numFormat);
        break;
      default:
        JOptionPane.showMessageDialog(null, "Desculpe, voc� n�o informou um n�mero v�lido.");
        
    }
  }
}