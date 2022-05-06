
package desingpatterns;

public class DesingPatterns {
    public static void main(String[] args) {
       Fabrica fabrica = new Fabrica();
       Transporte obj1;
       obj1=fabrica.getFabrica(1);
       
       Transporte obj2;
       obj2=fabrica.getFabrica(2);
       
       obj1.abastecer();
       obj2.abastecer();
       
       obj1.entregar();
       obj2.entregar();
    }
    
}
