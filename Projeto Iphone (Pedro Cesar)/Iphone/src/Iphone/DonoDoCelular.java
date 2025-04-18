package Iphone;

import Internet.ConectaraInternet;
import Internet.Internet2.ConectadorDeInternet;
import Musica.CentralDaMusica;
import Musica.ReprodutorMusical.PuxandoCentralDaMusica;
import Telefonico.Ligara;
import Telefonico.Telefonico2.LigadorTelefonico;
public class DonoDoCelular {
    public static void main(String[] args) {
        PuxandoCentralDaMusica meuiphone = new CentralDaMusica();
        ConectaraInternet Internett = new ConectadorDeInternet();
        Ligara ligacao = new LigadorTelefonico();
        Internett.conectar();
        meuiphone.tocar();  
        meuiphone.pausar();
        ligacao.ligar();
    }
}