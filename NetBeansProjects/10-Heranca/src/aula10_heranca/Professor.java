package aula10_heranca;
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos Públicos
    public void receberAum(float val){
        this.setSalario(this.getSalario()+val);
    }
    
    //Métodos Getters(Acessores)
    public String getEspecialidade() {
        return this.especialidade;
    }
    public float getSalario() {
        return this.salario;
    }
    
    //Métodos Setters(Modificadores)
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
        System.out.println(this.salario);
    }
    
}
