import java.util.Scanner;

/*Uma empresa possui um plano de gratifica��o para seus
funcion�rios.
? Para quem ganha menos de R$ 800,00 de sal�rio as regras s�o as
seguintes:
? Quem tiver 4 ou mais anos de servi�o, ter� acr�scimo de 7% ao
seu sal�rio;
? Quem tiver menos de 4 anos de servi�o ter� seu sal�rio acrescido
somente de 3%.
? Para quem ganha R$ 800,00 ou mais, seu sal�rio ter� acr�scimo de
2% independente do tempo de servi�o.
? Atrav�s de um programa obter dados como:
? Nome do Funcion�rio,
? Sal�rio
? Tempo de Servi�o (em anos)
? Calcular o sal�rio l�quido do funcion�rio (-INSS e IRRF).
*/

public class Exercicio_1 {
  public static void main (String[] args){
    //Declara��o de Vari�veis
    String nome = " ";
    double salario = 0.0;
    int tempo_s = 0;
    double salario_liq = 0.0;
    
    String inss = " ";
    double desconto = 0.0f;
    String irrf = " ";
    double desc = 0.0f;
      
    //Cria o Scanner
    Scanner ler = new Scanner(System.in);
    
    //Leituras
    System.out.println("Digite o nome do funcion�rio: ");
    nome = ler.nextLine();
    System.out.println("Digite o sal�rio do funcion�rio: ");
    salario = ler.nextDouble();
    System.out.println("Digite o tempo de servi�o do funcion�rio: ");
    tempo_s = ler.nextInt();
    
    //Sal�rio Bruto
    if (tempo_s<0) {
      System.out.println("ERRO: Tempo de trabalho negativo?");
    } else if (tempo_s<4 && tempo_s>0) {
      salario += (salario*0.03);
    } else if (tempo_s>=4) {
      salario += (salario*0.07);
    }
    
    //C�lculo INSS
    if (salario <= 1638.38) {
      inss = "8%";
      desconto += (salario*0.08);
    } else if (salario < 1638.38 && salario >= 2765.66) {
      inss = "9%";
      desconto += (salario*0.09);
    } else if (salario > 2765.66 && salario <= 4663.75) {
      inss = "11%";
      desconto += (salario*0.11);
    } else if (salario > 4663.75) {
      inss = "Teto";
      desconto += 513.01;
    } else if (salario > 937.0) {
      System.out.println("ERR0: Sal�rio n�o pode ser menor que o Min�mo Nacional!" );
    }
    
    //IRRF
    if (salario>0 && salario<=1862.22) {
      irrf = "ISENTO";
      desc = 0;
    } else if (salario>=1868.23 && salario<=2799.86) {
      irrf = "7,5%";
      desc += salario*0.075;
    } else if (salario>=2799.87 && salario<=3733.19) {
      irrf = "15%";
      desc = salario*0.15;
    } else if (salario>=3733.20 && salario<=4664.68) {
      irrf = "22,5%";
      desc = salario*0.225;
    } else if (salario>=4664.68) {
      irrf = "27,5%";
      desc = salario*0.275;
    }
    
    //Print na Tela
    System.out.println("====== C�LCULO CONTRACHEQUE ====== \nNome: "+nome);
    System.out.println("Sal�rio Bruto: "+salario);
    System.out.println("Desconto INSS: "+inss+" Valor: "+desconto);
    System.out.println("Desconto IRRF: "+irrf+" Valor: "+desc);
    System.out.println("L�quido: "+(salario-(desconto+desc)));
  }
}