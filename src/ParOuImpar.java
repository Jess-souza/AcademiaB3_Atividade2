/*Enunciado
Criar uma classe com uma função main que vai receber um número via args e dizer se esse número é par ou impar.
O método main deve ter a menor quantidade de linhas possíveis.*/

public class ParOuImpar {
    public static void main(String[] args) {
        int i = Integer.valueOf(args[0]);
        System.out.println((i % 2 == 0) ? "O número " + i + " é par!" : "O número " + i + " é impar!");
    }
}