package desafio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int a, b;

        
        do {

            System.out.print("Intervalo inicial (A): ");
            a = scanner.nextInt();
            System.out.print("Intervalo final (B): ");
            b = scanner.nextInt();
            if( (b-a) > 15){
                System.out.println("Intervalo maximo atingido (15) ...");
                break;
            }
            
            for( int i = a ; i <= b ; i++) {
                System.out.printf("Cubo de %d: %.0f \n", i, Math.pow(i, 3));
            }

        }while((b-a) <= 15);

    }

}
