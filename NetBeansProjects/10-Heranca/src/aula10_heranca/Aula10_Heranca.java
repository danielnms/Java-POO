package aula10_heranca;
public class Aula10_Heranca {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Ana Clara");
        p2.setNome("Daniel");
        p3.setNome("Gustavo");
        p4.setNome("Fernanda");
        
        p1.setIdade(17);
        p2.setIdade(23);
        p3.setIdade(34);
        p4.setIdade(28);
        
        p1.setSexo('M');
        p2.setSexo('H');
        p3.setSexo('H');
        p4.setSexo('M');
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
