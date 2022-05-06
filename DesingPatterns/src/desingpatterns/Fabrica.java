package desingpatterns;
public class Fabrica {
    public Transporte getFabrica(int modal){
        if(modal==1){//transporte de barco
            return new Barco();
        }
        else if(modal==2){//transporte de caminhao
            return new Caminhao();
        }
        else{
            System.out.println("Tipo de modal inexistente");
            return null;
        }
    }
}
