import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        try(FileReader fr = new FileReader("/home/ecasado/datos.txt")){

            double suma = 0;
            Scanner sc = new Scanner(fr);
            while(sc.hasNextDouble())
                suma += sc.nextDouble();

            System.out.printf("La suma de todos los números del fichero es %.2f", suma);

        }catch (IOException e){
            e.printStackTrace();
        }

    }



}
