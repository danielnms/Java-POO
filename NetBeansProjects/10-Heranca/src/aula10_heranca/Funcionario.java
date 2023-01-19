package aula10_heranca;
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos Públicos
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    //Métodos Getters(Acessores)
    public String getSetor() {
        return this.setor;
    }
    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    
    //Métodos Setters(Modificadores)
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
