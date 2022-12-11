import java.util.concurrent.ConcurrentHashMap;

public class App {



    public static void main(String[] args) throws Exception {
       //10% garçom
       //20% couvert
       //pedro $80
       //Andre $50
       //Montanha $30
       //Amanda $100
     
        calculaImprimeConta(80, "Pedro");
        calculaImprimeConta(50, "Andre");
        calculaImprimeConta(30, "Montanha");
        calculaImprimeConta(100, "Amanda");
    } 

    public static void calculaImprimeConta(double conta, String Nome ) {
        
        double gorjeta = conta * 0.1;
        double couvert = conta * 0.2;
        double total = conta + gorjeta + couvert;
        System.out.println("Disccriminação conta");
        System.out.println("Total consumido em R$: " +total);
        System.out.println("Gorjeta: "+gorjeta);    
        System.out.println("Couvert: "+couvert);
        System.out.println("Total Geral do : " + Nome + " R$ " + total);
        System.out.println("");

    }
}
