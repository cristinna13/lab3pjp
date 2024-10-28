package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pb1
{
    public static void main(String[] args)throws FileNotFoundException
    {
        List<parabola>lista=new ArrayList<parabola>();
        int a,b,c;
        Scanner scanner=new Scanner(new File("src/lab3/in.txt"));
        while(scanner.hasNextLine())
        {
            a=scanner.nextInt();
            b=scanner.nextInt();
            c=scanner.nextInt();
            lista.add(new parabola(a,b,c));
        }
        scanner.close();

        for(parabola parab:lista)
        {
            System.out.println((parab));
            System.out.println(parab.varfparabola());
        }

        System.out.println("mijloc: "+lista.get(0).mijlocparametru(lista.get(1)));
        System.out.println("distanta varfuri: "+parabola.lungimedoiparametri(lista.get(0),lista.get(1)));

    }
}
