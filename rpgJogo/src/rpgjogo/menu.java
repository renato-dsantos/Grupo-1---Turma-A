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
public class menu {
    
     static void menuInicial() throws Exception{
        
        Scanner input = new Scanner(System.in);
        
        char saida = 'e';
        int menu; 
        
        do{
             System.out.print("""
                                                                                                                                
                               _____      _                     _                      _                              _         
                              |     |   _| |___ ___ ___ ___ ___| |_ ___ ___    ___ ___| |_ ___ ___    _____ _ _ ___ _| |___ ___ 
                              |  |  |  | . | -_|_ -| . | -_|  _|  _| .'|  _|  | -_|   |  _|  _| -_|  |     | | |   | . | . |_ -|
                              |_____|  |___|___|___|  _|___|_| |_| |__,|_|    |___|_|_|_| |_| |___|  |_|_|_|___|_|_|___|___|___|
                                                   |_|                                                                          
                              """);
              
            System.out.println("1 )Iniciar o jogo");
            System.out.println("2 )Instruções");
            System.out.println("3 )Sair do jogo");
            System.out.print("Escolha uma opção;;;: ");
            menu = input.nextInt();
            
            
            switch(menu){
            case 1 -> {
                System.out.println("Iniciando o jogo.");
                Historiaum.historia();
                }
                
            case 2 -> System.out.println("O jogo funciona...");
                
            case 3 -> {
                System.out.println("Saindo do jogo");
                saida = 's';
                }
            default -> System.out.println("Opção inválida");
            }//fim do switch
            
            
            
        }while(saida != 's');
        
    }//fim função menu
    
}
