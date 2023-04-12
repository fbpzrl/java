package _04_Estruturas_Repetitivas.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public Exercicio03() { //SENHA FIXA

        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "2002";

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        while (!senha.equals(senhaCorreta)) {

            System.out.print("Senha inválida! Tente novamente: ");
            senha = sc.nextLine();
        }

        System.out.println("Acesso permitido!");
    }
}
