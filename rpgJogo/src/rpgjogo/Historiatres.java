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
public class Historiatres {
    
    public static void historia() throws Exception{
      Scanner input = new Scanner(System.in);
      System.out.println("");
      System.out.println("Muito bem, você achou a porta correta!");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Ao passar pela porta, aparece um grande relógio.");
      System.out.println("Uma voz diz que para, conseguir sair você precisa parar o relógio "
              + "\n e quanto mais tempo passar você vai envelhecendo. ");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Responda as perguntas para parar o relógio!");
      System.out.println("pressione qualquer enter para continuar..."); 
      input.nextLine();
      System.out.println("Começando segunda rodada de perguntas");
      terceirasPerguntas.terceirasNivelTres();
        
}
    
}
