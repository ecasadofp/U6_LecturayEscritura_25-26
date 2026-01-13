import java.io.*;

public class SalidaBytes {

    public static void main(String[] args) {



        try {
            FileInputStream fis = new FileInputStream("/home/ecasado/foto.jpg");
            FileOutputStream fos = new FileOutputStream("/home/ecasado/fotoModificada.jpg");


            int leido = fis.read();

            while (leido != -1) {

                fos.write(++leido);
                leido = fis.read();
            }

        }catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero para leer");
        }catch(IOException e){

            System.out.println("No se ha podido leer el fichero");
        }
    }


}
