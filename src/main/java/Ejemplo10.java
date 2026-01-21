import java.io.File;
import java.util.Scanner;

public class Ejemplo10 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String strFicheroOriginal;
    String strNombreFinal;

        System.out.println("Introduce el fichero a renombrar");

        strFicheroOriginal = sc.nextLine();

        System.out.println("Cuál es el nuevo nombre?");

        strNombreFinal = sc.nextLine();

        cambiaNombre(strFicheroOriginal, strNombreFinal);


    }

    public static void cambiaTodo(String strFicheroOriginal, String strNombreFinal){

        File fileOriginal = new File(strFicheroOriginal);

        File fileFinal = new File(strNombreFinal);

        if(fileOriginal.renameTo(fileFinal)){
            System.out.println("Nombre cambiado");

        }else{
            System.out.println("Nombre no cambiado");

        }

    }

    public static void cambiaNombre(String strFicheroOriginal, String strNombreFinal){

        File fileOriginal = new File(strFicheroOriginal);


        File fileFinal = new File(fileOriginal.getParent()+File.separator + strNombreFinal);

        if(fileOriginal.renameTo(fileFinal)){
            System.out.println("Nombre cambiado");

        }else{
            System.out.println("Nombre no cambiado");

        }

    }

}



