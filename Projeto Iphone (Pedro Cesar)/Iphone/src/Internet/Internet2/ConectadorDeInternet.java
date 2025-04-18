package Internet.Internet2;

import java.util.Scanner;
import Internet.ConectaraInternet;

public class ConectadorDeInternet implements ConectaraInternet {
    Scanner scann = new Scanner(System.in);
    String[] internetes = {"FAMILIA", "vip2", "CACHORRO"};
    public void conectar(){
        System.out.println("Você quer conectar a internet ? ");
        String con = scann.nextLine();
        if("SIM".equals(con)){
            System.out.println("Qual internet quer conectar ?");
            for (int i = 0; i < internetes.length; i++){
                System.out.println(internetes[i]);
            }
        System.out.println("Qual Dessas ? ");
        String net = scann.nextLine();
        if( "FAMILIA".equals(net)){
            System.out.println("Você esta conectando na internet FAMILIA");
        }else if ("vip2".equals(net)) {
            System.out.println("Você esta conectando na internet vip2");
            
        }else if("CACHORRO".equals(net)){
            System.out.println("Você esta conectando na internet CACHORRO");
            
        }
        
    }
}
}
