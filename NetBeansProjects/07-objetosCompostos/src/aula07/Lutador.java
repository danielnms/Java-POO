package aula07;
public class Lutador implements Caracteristicas{
    //Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Métodos Especiais
    public Lutador(String no, String na, int id, float al, float pe,
                    int vi, int de, int em) {//CONSTRUTOR
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }
    
    //Métodos Getters (acessores)
    public String getNome(){
        return this.nome;
    }
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    public int getIdade(){
        return this.idade;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public int getEmpates(){
        return this.empates;
    }
    
    //Métodos Setters (modificadores)
    public void setNome(String n){
        this.nome = n;
    }
    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public void setAltura(float a){
        this.altura = a;
    }
    public void setPeso(float p){
        this.peso = p;
        setCategoria();
    }
    private void setCategoria(){
        if (this.peso < 52.2f) {
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3f){
            this.categoria = "Leve";
        } else if (this.peso <= 83.9f){
            this.categoria = "Médio";
        } else if (this.peso <= 120.2f) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(int v){
        this.vitorias = v;
    }
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    public void setEmpates(int e){
        this.empates = e;
    }
    
    //Métodos abstratos
    @Override
    public void apresentar() {
        System.out.println("---------------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("País: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "kg");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    @Override
    public void status() {
        System.out.print(this.getNome());
        System.out.println(" é um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " Vitórias: ");
        System.out.println(this.getDerrotas() + " Derrotas: ");
        System.out.println(this.getEmpates() + " Empates: ");
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    
    
}
