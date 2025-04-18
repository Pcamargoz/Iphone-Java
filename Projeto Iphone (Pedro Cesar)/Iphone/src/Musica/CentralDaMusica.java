package Musica;

import java.util.Scanner;

import Musica.ReprodutorMusical.PuxandoCentralDaMusica;
public class CentralDaMusica implements PuxandoCentralDaMusica {

    Scanner scan = new Scanner(System.in);
    

    @Override
    public void tocar() {
        System.out.println("Escolha sua musica");
        String musicaAtual = scan.nextLine();
        if ("MATUE".equals(musicaAtual)) {
            System.out.println("Tocando: " + musicaAtual);
        } else {
            System.out.println("A sua musica e" + musicaAtual);
        }
    }

    @Override
    public void pausar() {
        System.out.println("Você quer para a musica ? ");
        String parar = scan.nextLine();
        if ("SIM".equals(parar)) {
            System.out.println("Música pausada:");
        } else {
            System.out.println("Musica ainda esta tocando.");
        }
    }
}