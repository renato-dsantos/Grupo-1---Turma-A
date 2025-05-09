/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgjogo;

import java.util.Scanner;

/**
 *
 * @author renato.santos25
 */
public class Historiadois {
   
    
    public static void historia() throws Exception{
      Scanner input = new Scanner(System.in);
      System.out.println("");
      System.out.println("Muito bem, você parou as paredes!");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Uma parede se desfaz e revela um corredor de porta. ");
      System.out.println("Uma voz diz que para continuar precisa escolher a porta correta,"
              + " \n se escolher a porta errado, você não conseguirá mais sair desse lugar.  ");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Responda as perguntas para achar a porta certa. ");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Começando segunda rodada de perguntas");
      segundasPerguntas.segundasNivelDois();
      
      
      
    }
    
}
