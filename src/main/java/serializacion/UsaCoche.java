package serializacion;

import java.io.*;

public class UsaCoche {


    public static void main(String[] args) {
        Coche miCoche = new Coche("Ford", "Focus", 190);

       guardaCoche(miCoche);

        System.out.println(leeCoche());

    }

    public static void guardaCoche(Coche coche){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coches.obj"))){

            oos.writeObject(coche);


        }catch (IOException e){

            e.printStackTrace();
        }


        }


    public static Coche leeCoche(){

        Coche cocheLeido = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("coches.obj"))){

            Object objetoLeido = ois.readObject();

            cocheLeido = (Coche)objetoLeido;

        }catch(IOException e){

            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return cocheLeido;
}
}