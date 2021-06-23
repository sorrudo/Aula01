import java.util.Scanner;

public class LendoDados {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Alguma Coisa!");
        String nome = leitor.nextLine();
        System.out.println("Legal, você escreveu:" + nome);
        leitor.close();
    }
}
