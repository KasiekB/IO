/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author Kasiek
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilmAdd {
    
    
    FilmAdd() throws FileNotFoundException, IOException
    {
        //System.out.print("tytul"); 
        FileWriter zapis=new FileWriter("Lista.txt", true);
        BufferedWriter out = new BufferedWriter(zapis);
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj tytul filmu: ");
    String text = input.nextLine();
   // System.out.print("gatunrk"); 
    //Scanner input = new Scanner(System.in);
    System.out.println("Podaj gatune filmu: "); 
    String text2 = input.nextLine();
    System.out.println("Ocena filmu: ");
    int a=Integer.parseInt(input.nextLine()); 
        Film f=new Film(text,text2,a); 
    out.write(text+" "+text2+" "+a);
    out.newLine();
    out.close();
    System.exit(0); 
   //zapis.println(text+" "+text2+" "+a);
   //zapis.close();

    
    
    }
    
}
    