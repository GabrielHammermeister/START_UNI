package desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        int[] divisores = {3, 6, 7};


        System.out.print("Digite um Numero: ");
        n = scanner.nextInt();

        System.out.print("Divisivel por: ");
        for(int i = 0 ; i < divisores.length ; i++) {
            
            if(n % divisores[i] == 0) { 
                System.out.printf("%d ", divisores[i]);
            }
        }
    }
}
