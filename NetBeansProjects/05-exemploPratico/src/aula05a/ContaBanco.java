package aula05a;
public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //MÉTODOS ESPECIAIS
    public ContaBanco(){//CONSTRUTOR
        this.status = false;
        this.saldo = 0f;
    }
    public int getNumConta(){//Método Acessor de numConta
        return this.numConta;
    }
    public void setNumConta(int n){//Método Modificador de numConta
        this.numConta = n;
    }
    public String getTipo(){//Método Acessor de Tipo
        return this.tipo;
    }
    public void setTipo(String t){//Método Modificador de Tipo
        this.tipo = t;
    }
    public String getDono(){//Método Acessor de Dono
        return this.dono;
    }
    public void setDono(String d){//Método Modificador de Dono
        this.dono = d;
    }
    public float getSaldo(){//Método Acessor de Saldo
        return this.saldo;
    }
    public void setSaldo(float s){//Método Modificador de Saldo
        this.saldo = s;
    }
    public boolean getStatus(){//Método Acessor de Status
        return this.status;
    }
    public void setStatus(boolean s){//Método Modificador de Status
        this.status = s;
    }
    
    //MÉTODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50f);
        } else if (t == "CP"){
            this.setSaldo(150f);
        } 
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Para prosseguir com o encerramento da conta "
                    + "favor sacar o saldo disponível no valor de: R$" + this.getSaldo());
        } else if (this.getSaldo() < 0){
            System.out.println("Você possúi débitos em aberto no valor de: R$"
                               + this.getSaldo());
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()==true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito no valor de R$" + v + " realizado na conta de "
                                + this.getDono());
        } else{
            System.out.println("Impossível depositar. Motivo: conta fechada");
        }
    }
    public void sacar(float v){
        if (this.getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque no valor de R$" + v + " realizado com sucesso!");
            } else{
                System.out.println("Saldo Insuficiente para saque");
            } 
        } else{
            System.out.println("Impossível Sacar. Motivo: conta fechada");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus() == true){
            if (this.getSaldo() >= v){
                setSaldo(getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso por " + this.getDono());
            } else{
                System.out.println("Saldo Insuficiente");
            }
        } else{
            System.out.println("Impossível pagar. Conta fechada");
        }
    }
}
