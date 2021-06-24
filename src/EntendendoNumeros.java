import java.util.Scanner;

public class EntendendoNumeros {
    //  Criar um programa onde o usuario degita dois valores e retorna uma soma deles

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int valor1;
        int valor2;
        int soma;
        double divisao;
        System.out.println("Digite o primeiro valor");
        valor1 = leitor.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = leitor.nextInt();
        soma = valor1 + valor2;
        divisao = valor1 / (double) valor2;
        System.out.println("------------");
        System.out.println("O Resultado da Soma Foi: " + soma);
        System.out.println("O resultado da divisao foi " + divisao);
        leitor.close();

    }
}
