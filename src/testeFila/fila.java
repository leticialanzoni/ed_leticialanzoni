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
public class fila {
    private int maxSize; //tamanho da minha fila
    private long[] filaArray;
    private int comecofila;
    private int finalfila;
    private int nItems;
    
    public fila( int s ) //método construtor
    {
        maxSize = s;
        filaArray = new long[maxSize];
     comecofila = 0;
        finalfila = -1;
        nItems = 0;
    }
    
    // METODO INSERIR: Responsável por inserir itens no final da fila,
    //  Se tenho uma fila com 5 items sendo [0] [1] [2] [3] [4] o meu maxSize é o número 4;
    
    public void inserir(long j) 
    {
        if (finalfila == maxSize-1) // lida com o circundar (rodear)
            finalfila = -1;
        filaArray[++finalfila] = j; //incrementa no final da fila e 
        nItems ++;                  // insere mais um item.
    }
    
    //METODO REMOVER: Responsável por remover os itens no começo da fila
    //
    public long remover() 
    {
        long  temp = filaArray[comecofila]; // obtém o valor e incrementa
                                            // no comeco da fila 
        if(comecofila == maxSize)           
            comecofila = 0;
           nItems--;
        
           return temp;
    }
    
    //METODO "vercomecofila" responsável por retornar o item no começo da fila
    public long vercomecofila() 
    {
        return filaArray[comecofila];
    }
   
    //METODO "filavazia" responsável por verificar se a fila esta vazia
    public boolean filavazia() 
    {
        return (nItems ==0);
    }
    
    // METODO "filacheia" responsável por verificar se a pilha esta cheia
    public boolean filacheia() 
    {
        return (nItems==maxSize);
    }
    
    // METODO "size" responsável por retornar a número de itens na fila
    public int size() // Número de itens na fila
    {
        return nItems;
    }
}

