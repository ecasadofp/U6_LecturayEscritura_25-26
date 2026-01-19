/*
Realiza un programa que muestra los cien números premiados en una rifa
y los guarde en un archivo (números de 5 cifras).
 */

import com.sun.source.tree.Tree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;

public class Ejercicio2 {

    public static void main(String[] args) {

        TreeSet<Integer> premiados = new TreeSet<>();

        premiados = realizaSorteo();

        System.out.println(premiados);

        guardarSorteo(premiados);

    }

    public static TreeSet<Integer> realizaSorteo(){

        TreeSet<Integer> premiados = new TreeSet<>();
        while (premiados.size()<100)
            premiados.add(dameAleatorio());

        return premiados;
    }

    public static int dameAleatorio(){

        return (int)(Math.random()*100000);

    }

    public static void guardarSorteo(TreeSet<Integer> premiados){

        try(FileWriter fw = new FileWriter("premiados.txt", true)){

            for(int i: premiados)
                fw.write(i + "\n");

            fw.flush();
            System.out.println("El sorteo se ha guardado");

        }catch (IOException e){

            System.out.println("No se ha podido guardar el resultado del sorteo");

        }


    }

}
