package constructores;

public class Caja {
    
    private double alto;
    private double ancho;
    private double largo;
    
    Caja (double a, double b, double c){
        alto = a;
        ancho = b;
        largo = c;
    }
    Caja(){
        alto = 1;
        ancho = 1;
        largo = 1;
    }
    Caja(double longitud){
        alto = ancho = largo = longitud;
    }
    
    public void mostrar(){
        System.out.println("Alto: " + alto + "\nAncho: " + ancho + "\nLargo: " + largo);
    }
}

