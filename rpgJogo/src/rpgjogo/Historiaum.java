/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgjogo;

/**
 *
 * @author renato.santos25
 */
import java.util.Scanner;

public class Historiaum {
    
    static void historia() throws Exception{
    Scanner input = new Scanner(System.in);
    System.out.println("Para começar informe o nome da sua personagem: ");
    String nome;
        nome = input.nextLine();
    System.out.println("Começando nossa história...");
    System.out.println("pressione qualquer enter para continuar..."); 
    input.nextLine();
    System.out.println("Em uma noite chuvosa,"+ nome + "estava prestes a pegar no sono, \nsem imaginar que aquela seria uma longa e estranha noite.");
    System.out.println("pressione qualquer enter para continuar..."); 
    System.out.println("Ao adormecer " + nome + ", se vê parado no ar, sem saber o que está acontecendo, "
            + "\n começa aparecer paredes, e percebe que as paredes estão chegando mais próxima." 
            + "\nUma voz diz que para sair desse lugar precisa, parar as paredes.");
     System.out.println("pressione qualquer enter para continuar..."); 
    input.nextLine();
    System.out.println("Responda as perguntas para parar as paredes." ); 
    System.out.println("pressione qualquer enter para continuar..."); 
    input.nextLine();
    System.out.println("Começando as perguntas.");
    System.out.println("pressione qualquer enter para continuar..."); 
    primeirasPerguntas.perguntasNivelUm();
    
    
}//fim void
}