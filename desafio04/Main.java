package desafio04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double valor , impostoTotal = 0, x;
        String OUTPUT = "%s: %.1f \n";

        // instanciando os objetos
        ICMS icms = new ICMS();
        IPI ipi = new IPI();
        COFINS cofins = new COFINS();
        
        // recebendo o input do usuario
        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();

        // display das informacoes
        x = icms.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf(OUTPUT, icms.toString(), x);

        x = ipi.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf(OUTPUT, ipi.toString(), x);

        x = cofins.calculaImposto(valor);
        impostoTotal += x;
        System.out.printf(OUTPUT, cofins.toString(), x);

        // resultado final
        System.out.printf("Valor Final: %.1f", impostoTotal + valor);



    }
}
