import java.util.Scanner;

public class calculadoraaula {
    //funções

    public static double soma(double x, double y){
        return x+y;
    }
    public static double multiplicacao(double x, double y){
        return x*y;
    }
    public static double subtracao(double x, double y){
        return (x-y);
    }
    public static double divisao(double x, double y){
        if(y==0)return 0;
        return x/y;
    }

    static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double x,y;
        int opcao;
        do{//antes dos numero
            System.out.println("Calculadora\n------------------\nescolha uma opção\n1-Soma 2-Multiplicacao 3-Subtracao 4-Divisao 5-Sair\n");
            opcao = entrada.nextInt();
            if (opcao == 5) {
                System.out.println("Ate mais!");
                break;
            }
            if (opcao < 1 || opcao > 4){
                System.out.println("Invalido");
                continue;
            }
                System.out.println("Valor de x:");
                x = entrada.nextDouble();
                System.out.println("Valor de y");
                y = entrada.nextDouble();
            switch (opcao) {
                case 1:
                    System.out.println("------------------\nResultado: "+soma(x,y)+"\nSomando: "+x+" + "+y+"\n------------------");
                    break;
                case 2:
                    System.out.println("------------------\nResultado: "+multiplicacao(x,y)+"\nMultiplicando: "+x+" x "+y+"\n------------------");
                    break;
                case 3:
                    System.out.println("------------------\nResultado: "+subtracao(x,y)+"\nSubtraindo: "+x+" - "+y+"\n------------------");

                    break;
                case 4:
                    System.out.println("------------------\nResultado: "+divisao(x,y)+"\nDividindo: "+x+" / "+y+"\n------------------");
                    break;
            }
        }while(true);
    }
}
