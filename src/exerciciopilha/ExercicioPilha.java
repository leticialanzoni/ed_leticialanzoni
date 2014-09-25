/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciopilha;

/**
 *
 * @author Letícia
 */
public class ExercicioPilha {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names = {  
            "João", "Maria", "José", "Luis", "Letícia", "Junior",  
            "Mary", "Karl", "Fred", "Hall", "Troy", "Joan"  
        };  
        SimpleStack stack = new SimpleStack(10);  
          
        System.out.println(  
            "Pilha de " + stack.getCapacity() + " posições criada: " + stack  
        );  
        System.out.println();  
          
        System.out.println("Preenchendo a pilha:");  
        for(int i = 0; i < names.length; i++) {  
            System.out.print("\tInserindo o nome \"" + names[i] + "\":\t");  
            if(stack.push(names[i]) == null)  
                System.out.println("PILHA CHEIA!!! impossível inserir...");  
            else  
                System.out.println(  
                    stack + ". " + (stack.getCapacity() - stack.getSize()) +   
                    " posições restantes."  
                );  
        }  
        System.out.println();  
          
        System.out.println("Removendo 5 elementos da pilha:");  
        for(int i = 1; i <= 5; i++) {  
            System.out.print("\t" + i + "a. remoção: \"" + stack.pop() + "\".");  
            System.out.println(" A pilha agora esta assim: " + stack);  
        }  
        System.out.println();  
          
        System.out.println(  
            "O atual nome no topo da pilha é \"" + stack.peek() + "\"."  
        );  
        System.out.println(  
            "O que? Não acredita??? Veja então: " + stack  
        );  
        System.out.println("Ora essa...");  
        System.out.println();  
          
        stack.clear();  
        System.out.println("Limpando a pilha: " + stack);  
        System.out.println();  
          
        System.out.print("Consigo tirar mais algo da pilha? ");  
        System.out.println(  
            stack.pop() == null ? "Não consigo..." : "Consigo sim!"  
        );  
    }  
}  
