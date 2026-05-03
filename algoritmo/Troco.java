import java.util.Scanner;
public class Troco {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        String nome;
        int valorFinal, valorPago, troco_falta;
        int nota200=0,nota100=0,nota50=0,
        nota20=0,nota10=0,nota5=0,nota2=0,moeda1=0;

        System.out.println("Digite o nome do cliente: ");
        nome = ls.nextLine();

        System.out.println("Digite o valor total da compra: ");
        valorFinal = ls.nextInt();
        
        System.out.println("Digite o valor pago pelo cliente: ");
        valorPago = ls.nextInt();
        
        if (valorPago == valorFinal) {
            System.out.println("\nNome: " + nome + " | Compra: " + valorFinal + " | Pago: " + valorPago);
            System.out.println("Compra realizada com sucesso!!!");

        }else if (valorPago < valorFinal) {
            troco_falta = valorFinal - valorPago;
            System.out.println("\nNome: " + nome + " | Compra: " + valorFinal + " | Pago: " + valorPago + " | Faltando: " + troco_falta);
            System.out.println("Valor insuficiente para realizar suas compras!");

        }else {
            troco_falta = valorPago - valorFinal;
            System.out.println("\nNome: " + nome + " | Compra: " + valorFinal + " | Pago: " + valorPago);
            System.out.println("Troco: " + troco_falta);
            
            nota200 = troco_falta/200;
            troco_falta %= 200;

            nota100 = troco_falta/100;
            troco_falta %= 100;

            nota50 = troco_falta/50;
            troco_falta %= 50;

            nota20 = troco_falta/20;
            troco_falta %= 20;

            nota10 = troco_falta/10;
            troco_falta %= 10;

            nota5 = troco_falta/5;
            troco_falta %= 5;

            nota2 = troco_falta/2;
            troco_falta %= 2;

            moeda1 = troco_falta/1;

        System.out.println("Notas/Moedas utilizadas: " + " R$ 200: " + nota200 + " R$ 100 " + nota100 + " R$ 50 " + nota50 +
        "\nR$ 20 " + nota20 +" R$ 10 " + nota10 + " R$ 5 " + nota5 + " R$ 2 " + nota2 + " R$ 1 " + moeda1);            
        }
        
        ls.close();

    }
        

    }


