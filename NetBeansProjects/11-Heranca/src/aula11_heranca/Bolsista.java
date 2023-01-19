package aula11_heranca;
public class Bolsista extends Aluno{
    //Atributos
    private float bolsa;
    
    //Métodos Públicos
    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.nome);
    }
    
    //Getters
    public float getBolsa(){
        return bolsa;
    }

    //Setters
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void pagarMens() {
        System.out.println(this.nome + " é Bolsista! Pagamento facilidado.");
    }
}
