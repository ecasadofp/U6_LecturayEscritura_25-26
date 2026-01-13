import java.io.FileWriter;
import java.io.IOException;

public class EjEscribeCaract {

    public static void main(String[] args) {


        try {
            FileWriter fw = new FileWriter("/home/ecasado/enero26.txt", true);
            fw.write("Esto es muy divertido\n");
            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
