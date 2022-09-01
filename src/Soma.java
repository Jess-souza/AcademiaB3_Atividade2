/*Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve
observar quantos parâmetros são enviados via terminal(args).
Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1,
deve pedir outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.
No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.*/
public class Soma {
    public static void main(String[] args) {
        int i = Integer.valueOf(args[0]);
        System.out.println((i % 2 == 0) ? "O número " + i + " é par!" : "O número " + i + " é impar!");
    }
}
