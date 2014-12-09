/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Kasiek
 */
public class User 
{
    String login; 
    String haslo; 
    String []tab; 
    int rozm=30;
    
     public void Loguj(String a, String b) throws IOException
    { 
        int wartosc = 0;
        FileReader fr= null;

    //OTWIERANIE PLIKU:
    try {
        fr = new FileReader("User.txt");
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
  

      
     /* for(int k=0; k<rozm; k++)
      {
          System.out.println(tab[k]);
      }
      */ 
      for(int k=0; k<rozm; k++)
      {
          if(tab[k].equals(a))
          {
              if(tab[k+1].equals(b))
              {
                  System.out.print("Zalogowano pomyslnie!!!!"); System.exit(0); 
              }
              else
              {
                  System.out.print("Bledny login lub haslo!!!"); 
              }
          }
         
      }
      

    }
    
    void Register(String log,String hasl) throws FileNotFoundException, IOException
    {
        int wartosc = 0;
        FileReader fr= null;

    //OTWIERANIE PLIKU:
    try {
        fr = new FileReader("User.txt");
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
  
      FileWriter zapis = new FileWriter("User.txt",true);
      BufferedWriter out=new BufferedWriter(zapis);
      
      for(int k=0;k<rozm; k++)
      {
          if(tab[k].equals(log))
          {
              System.out.print("Podaj inny login, ten jest zajety!");
              out.close();  System.exit(0); 
          }
      out.write(log+ " "+hasl); 
      out.newLine(); 
      out.close(); 
      System.out.println("Udalo sie zarejestrowac"); 
      }

      
      //zapis.println(a+ " "+ b);
      //zapis.close(); 
    }
     
    User() throws IOException
    {
       
        int a; 
        System.out.println("Co chcesz zrobic??"); System.out.println("1.zalogowac sie");System.out.println("Zarejestrowac"); 
        Scanner wpisz=new Scanner(System.in); 
        a=Integer.parseInt(wpisz.nextLine());
        switch(a)
        {
            case 1:
            {
                System.out.println("Podaj login: "); login=wpisz.nextLine(); 
                System.out.println("Podaj haslo: "); haslo=wpisz.nextLine(); 
                Loguj(login,haslo); //System.exit(0); 
            }
            case 2: 
            {
                System.out.println("Podaj login: "); login=wpisz.nextLine(); 
                System.out.println("Podaj haslo: "); haslo=wpisz.nextLine();
                Register(login,haslo); 
            }
        }
        
       
    }
    

} 

