import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
        double a, b, c, delta, x1, x2;
        System.out.println("Escreva o valor de A:");
        a = input.nextDouble();
        System.out.println("Escreva o valor de B:");
        b = input.nextDouble();
        System.out.print("Escreva o valor de C:");
        c = input.nextDouble();
        if (a == 0 | b == 0){
            System.out.println("Numeros informados incorretamente");
        } else if ( (a != 0) & (b!= 0) & (c == 0)){
            System.out.println("Igualdade confirmada 0 = 0");
        } else if (a == 0 | b != 0){
            System.out.println("Esta é uma equação de primeiro grau");
        }
        delta = ((b * b) - (4 * a * c));
        x1 = 0;
        x2 = 0;
        if (delta > 0) {
            System.out.println("Essa equação possui duas raizes reais diferentes");
            x1 = ((-b + (Math.sqrt(delta))) / (2 * a));
            x2 = ((-b + (Math.sqrt(delta))) / (2 * a));
            System.out.printf("x1 vale: " + x1);
            System.out.println("");
            System.out.printf("x2 vale: " + x2);
            System.out.println("");
        } else if (delta < 0){
            System.out.println("Essa equação não possui raizes reais");
        } else if (delta == 0){
            System.out.println("Essa equação possui duas raizes reais iguais");
        }
        input.close();
    }
}
