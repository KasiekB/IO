/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Kasiek
 */
public class FilmSearch 
{
  int rozm=15;
String[]tab;


 
  FilmSearch(String a) throws FileNotFoundException
  {
      
      int wartosc = 0;
    FileReader fr= null;

    //OTWIERANIE PLIKU:
    try {
        fr = new FileReader("Lista.txt");
     } catch (FileNotFoundException e) {
           System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
           System.exit(1);
     }

     StreamTokenizer st = new StreamTokenizer(fr);
     tab=new String[rozm];
     int i=0; 
     //ODCZYT KOLEJNYCH "TOKENÓW" Z PLIKU:
     try {
        while( (wartosc = st.nextToken()) != StreamTokenizer.TT_EOF )
        {
             
              if(wartosc == StreamTokenizer.TT_WORD)
              { tab[i]=(st.sval);
              i++; }
                    //System.out.println("Wczytano słowo: "+ st.sval);
              else if(wartosc == StreamTokenizer.TT_NUMBER)  
              {
                  int d=(int)st.nval;
                  tab[i]=Integer.toString(d); i++; }
                    //System.out.println("Wczytano liczbę: "+ st.nval);
         }
      } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
      }

      //ZAMYKANIE PLIKU:
      try {
         fr.close();
      } 
      catch (IOException e) {
           System.out.println("BŁĄD PRZY ZAMYKANIU PLIKU!");
           System.exit(3);
      }
  

      
      /*for(int k=0; k<rozm; k++)
      {
          System.out.println(tab[k]);
      }
      */
      
      for(int k=0;k<rozm;k++)
      {
          if(tab[k]!=null)
              if(tab[k].equals(a))
              {
                  System.out.print("ZNALEZIONO!!!");System.exit(0); 
              }
              else
              {
                  k++; 
              }
          else
                  {
                    System.out.println("Nie znalezion!!");System.exit(0);   
                  }
        }System.out.println("Nie znaleziono");System.exit(0); 
          
     
  }
  
  
 /* public static void main(String[] args) throws FileNotFoundException 
  {
        // TODO code application logic here
      //FilmSearch t=new FilmSearch(); 
    }*/
}
