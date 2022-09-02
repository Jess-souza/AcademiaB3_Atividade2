/*Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve
observar quantos parâmetros são enviados via terminal(args).
Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1,
deve pedir outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.
No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.*/

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double soma = 0;
        if (args.length == 0) {
            System.out.println("Digite o primeiro número: ");
            num1 = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            num2 = scanner.nextDouble();
            soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } else if (args.length == 1) {
            num1 = Double.parseDouble(args[0]);
            System.out.println("Digite o segundo número: ");
            num2 = scanner.nextDouble();
            soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } else if (args.length == 2) {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
            soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } else {
            System.out.println("Quantidade de parâmetros inválida!");
        }
    }
}
