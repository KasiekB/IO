/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kasiek
 */
public class Manager {





    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      int a; 
      System.out.println("Co chcesz zrobic???");
      System.out.println("1.Wlaczyc panel uzytkownika");
      System.out.println("2.Wyswietlic liste filmow"); System.out.println("3.Dodac film");
      System.out.println("4.Znalezc film"); System.out.println("5.Zakonczyc");
      Scanner wpisz=new Scanner(System.in); 
      a=Integer.parseInt(wpisz.nextLine()); 
      
      switch(a)
        {
                case 1:
                {
                  User u=new User(); 
                }
                case 2:
                {
                   FilmList f=new FilmList();  
                }
                case 3:
                {
                    FilmAdd f=new FilmAdd();
                }
                case 4:
                {
                    System.out.println("Podaj tytul filmu, ktory mam znazlezc"); 
                    String b=wpisz.nextLine(); 
                    FilmSearch f=new FilmSearch(b); 
                }
                case 5:
                {
                    System.exit(0); 
                }
        // TODO code application logic here
    }
    
}}
