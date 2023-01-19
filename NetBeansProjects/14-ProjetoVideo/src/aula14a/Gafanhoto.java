package aula14a;
public class Gafanhoto extends Pessoa{
    // Atributos
    private String login;
    private int totAssistido;
    
    // Método Construtor
    public Gafanhoto(String n, int i, char s, String l){
        super(n, i, s);
        this.setLogin(l);
        this.setTotAssistido(0);
    } 
    
    // Métodos Getters (Acessores)
    public String getLogin(){
        return this.login;
    }
    public int getTotAssistido(){
        return this.totAssistido;
    }
    
    // Métodos Setters (Modificadores)
    public void setLogin(String l){
        this.login = l;
    }
    public void setTotAssistido(int t){
        this.totAssistido = t;
    }
    
    // Métodos Públicos
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido()+1);
    }
    
    // Método toString
    @Override
    public String toString(){
        return super.toString() + " [Login: " + login + ']'
                + "\n ----------------------------------------------------"
                + "----------------------------------------";
    }
}
