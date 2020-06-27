package miscelanea3;

public class Miscelanea3 {

    public static void main(String[] args) {
        int suma = 0;
        //se emplea el ciclo for para recorrer los 100 primeros números naturales desde el 1 hasta el 100 
        for (int i = 1; i <=100; i++){
            //se eleva al cuadrado cada número y se suma a la variable acumuladora "suma"
            suma+=Math.pow(i, 2);
        }
        System.out.println("la suma de los primeros 100 números naturales es "+suma);
    }
    
}
