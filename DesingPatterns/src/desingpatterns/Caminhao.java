package desingpatterns;
public class Caminhao implements Transporte{
    private int chassi;
    public int getChassi(){
        return chassi;
    }
    public void setChassi(int chassi){
        this.chassi = chassi;
    }

    @Override
    public void entregar() {
       System.out.println("Entrega feita via caminhão");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo um caminhão");
    }
    
   
}
