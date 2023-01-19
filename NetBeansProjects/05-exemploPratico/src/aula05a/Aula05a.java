package aula05a;
public class Aula05a {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta("CP");
        p1.setNumConta(12345);
        p1.setDono("Daniel");
        p1.depositar(50f);
        p1.sacar(10);
        
        p1.estadoAtual();
    }
    
}
