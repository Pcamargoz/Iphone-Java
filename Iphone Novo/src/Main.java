import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Iphone apple = new Iphone();
        apple.digitarNumeroDeTelefone(); // Mensagem solicitando o número
        String numeroDeTelefone = scan.nextLine(); // Correção: tipo String e nome da variável
        System.out.println("Ligando para " + numeroDeTelefone); // Exibe o número digitado

        scan.close(); // Boa prática: fechar o scanner
    }
}
