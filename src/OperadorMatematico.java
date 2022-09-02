/*Realizar uma operação matemática, que deve ser passada via System.in ( opções: + - / * )
entre dois números que também devem ser solicitados via System.in*/


import java.util.Scanner;

public class OperadorMatematico {
    public static void main(String[] args) {
        float a, b;
        char operacao;

        Scanner input = new Scanner(System.in);
        System.out.println("Escolha uma operação matemática, opções: + - / * ");
        operacao = input.next().charAt(0);

        System.out.print("Digite o primeiro número: ");
        a = input.nextFloat();
        System.out.print("Digite o segundo número: ");
        b = input.nextFloat();

        switch (operacao) {
            case '+':
                System.out.printf("A soma de %.2f + %.2f resulta em %.2f", a, b, a + b);
                break;
            case '-':
                System.out.printf("A subtração de %.2f - %.2f resulta em %.2f", a, b, a - b);
                break;
            case '/':
                System.out.printf("A divisão de %.2f + %.2f resulta em %.2f", a, b, a / b);
                break;
            case '*':
                System.out.printf("A multiplicação de %.2f * %.2f resulta em %.2f", a, b, a * b);
                break;
            default:
                System.out.printf("Você digitou uma operação inválida.");
        }
    }
}

