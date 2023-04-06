package _04_Estruturas_Repetitivas;

import java.util.Scanner;
public class Loop {

    public static void whileLoop() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número maior que zero: ");
        int numero = sc.nextInt();

        while (numero != 0) { //usado quando não se sabe previamente a quantidade de repetições

            System.out.println("O número digitado foi: " + numero);
            System.out.println();
            System.out.print("Informe outro número: ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Você digitou 0. FIM DO PROGRAMA !");
            }
        }
    }
}
