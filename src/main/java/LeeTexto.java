import java.io.*;

public class LeeTexto {

    public static void main(String[] args) {

//        System.out.println(leeFicheroTradicionalmente("/home/ecasado/texto.txt"));
//
//        System.out.println(leeFicheroConRecursos("/home/ecasado/texto2.txt"));
//
//        String texto = "Con cien cañones por banda\nviento en popa a toda vela\nno corta el mar sino vuela\n...";
//
//        escribeFichero("/home/ecasado/poesia.txt", texto);

        // "/home/ecasado/poesia.txt"
if(args.length > 0)
        System.out.println(leeConBuffer(args[0]));
else
    System.out.println("Introduce el nombre del fichero en la ejecución para ver su contenido");

    }

    public static String leeFicheroTradicionalmente(String rutaFichero) {

        String salida = "";
        FileReader fr = null;

        try {
            int leido;
            fr = new FileReader(rutaFichero);

            leido = fr.read();
            while (leido != -1) {

                salida += (char) leido;
                leido = fr.read();
            }

        } catch (FileNotFoundException e) {
            salida = "No se ha podido abrir el fichero";
        } catch (IOException e) {
            salida = "No se ha podido leer el fichero";
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("No se ha podido cerrar el reader");
                ;
            }

        }

        return salida;

    }

    public static String leeFicheroConRecursos(String fichero) {

        String salida = "";

        try (FileReader fr = new FileReader(fichero)) {

            int leido = fr.read();
            while (leido != -1) {

                salida += (char) leido;
                leido = fr.read();
            }

        } catch (FileNotFoundException e) {
            salida = "No se ha podido abrir el fichero";
        } catch (IOException e) {
            salida = "No se ha podido leer el fichero";
        }

        return salida;
    }

    public static String leeConBuffer(String fichero) {

        String salida;
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

            salida = "";
            String leido = br.readLine();
            while (leido != null) {
                salida += leido + "\n";
                leido = br.readLine();
            }
        } catch (FileNotFoundException e) {
            salida = "No se ha podido abrir el fichero";
        } catch (IOException e) {
            salida = "No se ha podido leer el fichero";
        }
        return salida;

    }

    public static void escribeFichero(String fichero, String texto) {

        try (FileWriter fw = new FileWriter(fichero)) {

            fw.write(texto);
            fw.flush();

        } catch (IOException e) {
            System.out.println("No se ha podido escribir el fichero");
        }

    }

}