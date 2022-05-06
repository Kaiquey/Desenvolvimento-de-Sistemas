package desingpatterns;

public class Barco implements Transporte {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void entregar() {
        System.out.println("Entrega feita de barco");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo um barco");
    }
    
}
