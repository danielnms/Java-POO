package aula11_heranca;
public class Aula11_Heranca {
    public static void main(String[] args) {
        Tecnico t1 = new Tecnico();
        t1.setNome("Jonas");
        t1.setIdade(29);
        t1.setSexo('H');
        t1.setRegistroProf(12345);
        t1.pagarMens();
        t1.praticar();
        System.out.println(t1.toString());
    }
    
}
