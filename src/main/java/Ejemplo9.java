import javax.swing.*;
import java.io.File;

public class Ejemplo9 {

    public static void main(String[] args) {

        String fichero = JOptionPane.showInputDialog("Dame el nombre del fichero");
        String mensaje;

        File miFile = new File(fichero);

        if(miFile.exists()){

            mensaje = "El fichero " + fichero + " existe";

        }else{

            mensaje = "El fichero " + fichero + " no existe";
        }

        JOptionPane.showMessageDialog(null, mensaje);
        JOptionPane.showMessageDialog(null, "La ruta absoluta es " + miFile.getAbsolutePath());

    }


}
