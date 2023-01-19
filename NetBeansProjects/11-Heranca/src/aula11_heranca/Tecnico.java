package aula11_heranca;
public class Tecnico extends Aluno{
    //Atributos
    private int registroProf;
    
    //Métodos Públicos
    public void praticar(){
        System.out.println("O aluno " + this.nome + " de registro " + this.registroProf + " está praticando!");
    }
    
    //Gettes e Setters
    public int getRegistroProf() {
        return registroProf;
    }

    public void setRegistroProf(int registroProf) {
        this.registroProf = registroProf;
    }
    
}
