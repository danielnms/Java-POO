package aula07;

import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Getters
    private Lutador getDesafiado(){
        return this.desafiado;
    }
    private Lutador getDesafiante(){
        return this.desafiante;
    }   
    private int getRounds(){
        return this.rounds;
    }
    private boolean getAprovada(){
        return this.aprovada;
    }
    
    //Métodos Setters
    private void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    private void setDesafiante(Lutador dd){
        this.desafiante = dd;
    }
    private void setRounds(int r){
        this.rounds = r;
    }
    private void setAprovada(boolean a){
        this.aprovada = a;
    }

    //Métodos Especiais
    
    //Métodos Abstratos
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria())
                && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            System.out.println("Luta marcada com sucesso!");
            System.out.println(" ");
        } else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Impossível marcar luta!");
            System.out.println(" ");
        }
    }
    
    public void lutar(){
        if (aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            System.out.println("-----RESULTADO DA LUTA-----");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor){
                case 0: //Empate
                    System.out.println("Empate");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou desafiado
                    System.out.println("Vencedor: " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //gahou desafiante
                    System.out.println("Vencedor: " + this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();       
            }
            System.out.println("---------------------------");
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
}
