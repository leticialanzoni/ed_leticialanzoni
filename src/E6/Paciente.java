/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package E6;

/**
 *
 * @author Aluno
 */
public class Paciente {
   private String nome;
   private String prioridade;
   
    public Paciente(String nome, String prioridade)
        {
            this.nome = nome;
            this.prioridade = prioridade;
        }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPrioridade(){
        return prioridade;
        
    }
    
     public void setPriodiade(String prioridade) {
        this.prioridade = prioridade;
    }
    
    
    
    
}
