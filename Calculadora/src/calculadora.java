import java.util.Scanner;
public class calculadora {
    static void main(String[] args) {
        //entrada de dados
        Scanner leitor = new Scanner(System.in);

        //definição de variáveis
        int opcao;
        double A,B;

        //tela para usuário
        System.out.println("------------------");
        System.out.println("CALCULADORA");
        System.out.println("------------------");
        System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
        opcao = leitor.nextInt();

        //processamento
        System.out.println("Digite A: ");
        A = leitor.nextDouble();
        System.out.println("Digite B: ");
        B = leitor.nextDouble();

            switch(opcao){
                case 1:
                    System.out.println("Soma: "+A+B);
                    break;

                case 2:
                    System.out.println("Subtração: "+ (A-B));
                    break;

                case 3:
                    System.out.println("Multiplicação: "+A*B);
                    break;

                case 4:
                    if (B == 0){
                        System.out.println("Não é possível dividir por zero.");
                    }else {
                        System.out.println("Divisão " + A / B);
                    }
                    break;
                case 5:
                    

                default:
                    System.out.println("Opção inválida.");
                    break;
            }


    }
}
