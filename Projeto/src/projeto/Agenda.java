package projeto;

public class Agenda {
     private String nome;
     private String telefone;
     private String email;
     private Endereco endereco;
     
     public void alteraRua(String rua){
         this.endereco.rua = rua;
     }
     public String pegaRua(){
         return endereco.rua;
     }
     public void alteraNumero(String numero){
         this.endereco.numero = numero;
     }
     public String pegaNumero(){
         return endereco.numero;
     }
     public void alteraCep(String cep){
         this.endereco.cep = cep;
     }
     public String pegaCep(){
         return endereco.cep;
     }
     
     public String getNome(){
         return nome;
     }
     public void setNome(String nome){
         this.nome = nome;
     }
     public String getTelefone(){
         return telefone;
     }
     public void setTelefone(String telefone){
         this.telefone = telefone;
     }
     public String getEmail(){
         return email;
     }
     public void setEmail(String email){
         this.email = email;
     }
    
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

}
