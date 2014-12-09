/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 *
 * @author Kasiek
 */
public class FilmList 
{
    String[]tab;
    int rozm=30;
    FilmList()
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
    
     for(int k=0; k<rozm; k+=3)
      {
          if(tab[k]!=null)
          {
          System.out.println(tab[k]);
          }
          else
          {
              System.exit(0); 
          }}
      
    }
    
}
