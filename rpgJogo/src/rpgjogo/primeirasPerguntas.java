/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgjogo;

/**
 *
 * @author renato.santos25
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class primeirasPerguntas {
    
    public static int perguntasNivelUm()throws Exception{
        
       int acertos = 0; 
        //buscando o arquivo e criando as entrado do Scanner 
        
        File questoes = new File("primeiras_perguntas.txt");
        Scanner perguntas = new Scanner(questoes);
        Scanner respostajogador = new Scanner(System.in);
        Scanner voltarmenu = new Scanner(System.in);
        
        //Criando o ArrayLista da questões com somente 7 resposta
         ArrayList<List<String>> listaquestoes = new ArrayList<>();
        
         ///lendo o arquivo e criando a lista
         
        while(perguntas.hasNextLine()){
            List<String> listaperguntas = new ArrayList<>();
         ///for para jogar as lista mp array   
            for(int i = 0; i < 7; i++){
                if(perguntas.hasNextLine()){
                  
                    listaperguntas.add(perguntas.nextLine());
                }//fim if                 
            }//fim for
            
            //if para gerar só 7 resposta
            if(listaperguntas.size() == 7){
                
                listaquestoes.add(listaperguntas);
            
            }//fim if
                                                
   }//fimwhile
        
        //embaralha as perguntas
        Collections.shuffle(listaquestoes);
        
        // lista para aparecer 3 peguntas por rodada
        List<List<String>> perguntasSelecionadas = listaquestoes.subList(0, 3);
     
        //int acertos = 0;
        
        ///for para exibir as peguntas e depois pegar a resposta certa
        for(List<String> listaperguntas : perguntasSelecionadas){
        
            String pergunta = listaperguntas.get(0);
            String a = listaperguntas.get(1);
            String b = listaperguntas.get(2);
            String c = listaperguntas.get(3);
            String d = listaperguntas.get(4);
            String e = listaperguntas.get(5);
            String respostacorreta = listaperguntas.get(6);
        
             System.out.println("\n" + pergunta);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(respostacorreta);

            System.out.print("Sua resposta (a/b/c/d/e): ");
            String respostaUsuario = respostajogador.nextLine().trim().toLowerCase();
        //if para pegar os acertos, mas será mudado para pegar o tempo
             if (respostaUsuario.equals(respostacorreta)) {

                acertos++;
            } 
                  
        }//fim for perguntas
        

        //exibi os acerto e se deseja continuar
        System.out.println("Você acertou " + acertos + " perguntas.");
        System.out.println("Gostaria de continuar a história?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int opcao = voltarmenu.nextInt();
        
        if(opcao == 1){
        System.out.print("Voltando para a história");
        Historiadois.historia();
        }else{
        System.out.println("Voltando para menu");
            menu.menuInicial(); 
        }//fim if
        
        int resultado = acertos;
        
        return resultado;
        
        
    }
    


    
}//fim class
