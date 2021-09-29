package practico5;

public class Practico5 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 6, 8, 4};
        
        int[][] arrMulti = {{5, 7, 6, 8, 4}, {3, 5, 12, 7}};
        
        Arreglo.sumarLista(arr);
        
        System.out.println("\nResultado que retorna la funcion buscarMayor es: " + Arreglo.buscarMayor(arrMulti));
        
        System.out.println("\nResultado de la funcion CuentaVocales es: " + Arreglo.cuentaVocales("Murcielago"));
        
        System.out.println("\nResultado de la funcion cuentaCaracter es: " + Arreglo.cuentaCaracter("anana", 'a'));
    }
    
}
