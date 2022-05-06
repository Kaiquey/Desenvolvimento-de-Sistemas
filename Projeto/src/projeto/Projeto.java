package projeto;
public class Projeto {

    public static void main(String[] args) {
      Endereco end = new Endereco();
      end.rua = "AV7";
      end.numero = "93";
      end.cep = "40027";
      
      /*Criando agenda */
      
      Agenda a1 = new Agenda();
      a1.setNome("Gustavo");
      a1.setTelefone("40028922");
      a1.setEmail("Marcelopala@gmail.com");
      a1.setEndereco(end);
      
      /*Aparecendo em tela */
      System.out.println(a1.getNome());
      System.out.println(a1.getTelefone());
      System.out.println(a1.getEmail());
      System.out.println(a1.pegaRua());
      System.out.println(a1.pegaNumero());
      System.out.println(a1.pegaCep());
      
      /* Alterando dados */
      
      a1.alteraRua("Brotas");
      a1.alteraNumero("67");
      a1.alteraCep("973832");
      System.out.println("\nNovos dados\n \n");
      System.out.println(a1.pegaRua());
      System.out.println(a1.pegaNumero());
      System.out.println(a1.pegaCep());
	}
}
