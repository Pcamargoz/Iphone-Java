public class Iphone implements Interface {

  protected  String[] listadeWifi = {"Familia", "Cachorro", "vip2"};
  
  @Override
  public void conectaraInternet() {
      // Estrutura de controle de fluxo para exibir todos os nomes de Wi-Fi
      for (String wifi : listadeWifi) {
          System.out.println("Rede Wi-Fi encontrada: " + wifi);
      }
  }

  @Override
  public void escolherMusica() {
      String[] musicas = {"333", "Samba canção", "Tipo rolex"};
      for (String musica : musicas) {
          System.out.println("Tocando música: " + musica);
      }
  }

  @Override
  public void digitarNumeroDeTelefone() {
      System.out.println("Digite aqui seu número de telefone");
  }

  @Override
  public void ListaTelefonica() { 
    
  }
  
  @Override
  public void Playlist() {

  }

}
