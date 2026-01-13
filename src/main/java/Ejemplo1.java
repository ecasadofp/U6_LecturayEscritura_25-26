import java.io.*;
public class Ejemplo1 {
    public static void main(String[] args) {
        //Cuenta caracteres introducidos por la entrada estándar (teclado)
        int contador = 0;
        try {
            while(System.in.read()!='\n')
                contador++;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Tecleados " + contador + " caracteres.");
    }
}
