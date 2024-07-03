//Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class execicio_I {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida em metros para converter para centimetros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println("A medida de " + metros + " metros em centimetros é " + centimetros + " cm");
        scanner.close();
    }
}
