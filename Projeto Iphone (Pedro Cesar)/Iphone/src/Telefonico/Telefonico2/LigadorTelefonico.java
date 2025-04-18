package Telefonico.Telefonico2;
import Telefonico.Ligara;
import java.util.Scanner;
public class LigadorTelefonico implements Ligara { 

    Scanner scan = new Scanner(System.in);

    public void ligar() { 
        System.out.println("Digite o numero de quem você quer ligar");
        String numero = scan.nextLine();
        System.out.println("Ligando para " + numero);
    }
}
