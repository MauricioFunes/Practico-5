package practico5;

public class Arreglo {
    
    //Reciba por parámetro un arreglo unidimensional de
    //enteros y muestre por pantalla la suma y promedio de los mismos
    static void sumarLista(int[] arr){
        int i, suma=0;
        for(i=0; i<arr.length;i++){
            suma+=arr[i];
        }
        System.out.println("La suma de los numeros de arreglo es: " + suma);
        System.out.println("El promedio de los numeros del arreglo es: " + suma/arr.length);
    }
    
    //Reciba por parámetro un arreglo bidimensional e
    //irregular de enteros y retorne el entero más grande
    //que se encuentra en el arreglo.
    static int buscarMayor(int[][] arr){
        int fila, colum, mayor=0;
        
        for(fila=0;fila<arr.length;fila++){ //Recorre filas
            
            for(colum=0;colum<arr[fila].length;colum++){ //Recorre columnas
                
                if(mayor<arr[fila][colum]){
                    
                    mayor=arr[fila][colum];
                }
            }
        }
        return mayor;
    }
    
    //Reciba por parámetro un String y retorne la cantidad
    //de vocales que tiene la cadena
    static int cuentaVocales(String palabra){
        int contador=0, i;
        
        for(i=0; i<palabra.length();i++){
            if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') || (palabra.charAt(i)=='o') || (palabra.charAt(i)=='u')){
                contador++;
            }
        }
        return contador;
    }
    
    //Reciba por parámetro un String y un caracter, luego
    //retorne la cantidad de veces que se repite en la cadena el carácter recibido
    static int cuentaCaracter(String palabra, char letra){
        int contador=0, i;
        
        for(i=0; i<palabra.length();i++){
            if (palabra.charAt(i)==letra){
                contador++;
            }
        }
        return contador;
    }
}
