package Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String boleto;

        System.out.println("Digite o número do boleto: ");
        boleto = sc.nextLine();

        String n = boleto.replaceAll("[^0-9]+","");

        String[] boleto1 = n.split("", (47));

        for (int i = 0; i < 9; i=i+2) {
            System.out.println(i * 2);
        }


        sc.close();
    }
}