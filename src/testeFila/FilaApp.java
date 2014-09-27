/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testeFila;

/**
 *
 * @author Aluno
 */
public class FilaApp {
    
    public static void main(String[] args)
    {
        fila afila = new fila (5); // fila para manter 5 itens
        
            //Inserindo 4 itens na fila
                afila.inserir(10);
                afila.inserir(20);
                afila.inserir(30);
                afila.inserir(40);
           
          //Removendo 3 itens (10, 20, 30) 
                afila.remover();
                afila.remover();
                afila.remover();
                
         //Inserindo mais 4 itens na fila e circundar (rodear)
                afila.inserir(50);
                afila.inserir(60);
                afila.inserir(70);
                afila.inserir(80);
                
         while ( !afila.filavazia()) // Enquanto a fila NÃO estiver vazia 
         {                           //remover e exibir todos os itens
            long n = afila.remover(); 
            System.out.print(n);
            System.out.print(" ");
         }
           System.out.print(" ");
 }
    
}
