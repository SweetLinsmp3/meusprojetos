import java.util.Scanner;

public class bhaskara {
    public static void calcularbhaskara(double a, double b, double c){
        double x,y,delta;
        delta = Math.pow(b,2)-4*a*c;
        if (delta < 0){
            System.out.println("A equação não possuí raízes reais\n------------------");
        }else {
            x = (-b + Math.sqrt(delta)) / (2 * a);
            y = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Valor do x1: %.2f %nValor do x2: %.2f %n------------------%n", x , y);
        }
    }
    static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c;
        System.out.println("Digite o valor de a:");
            a = entrada.nextDouble();
        System.out.println("Digite o valor de b:");
            b = entrada.nextDouble();
        System.out.println("Digite o valor de c:");
            c = entrada.nextDouble();
        calcularbhaskara(a,b,c);

            }
    }

