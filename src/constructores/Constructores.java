
package constructores;

public class Constructores {

    public static void main(String[] args) {
                
        Caja caja1 = new Caja(10, 20, 15);
        Caja caja2 = new Caja();
        Caja caja3 = new Caja(5);
        
        System.out.println("Caja 1: ");
        caja1.mostrar();
        System.out.println("Caja 2: ");
        caja2.mostrar();
        System.out.println("Caja 3: ");
        caja3.mostrar();
    }
    
}

