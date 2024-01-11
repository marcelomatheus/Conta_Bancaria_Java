package ContaBanco;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String cliente;
    private double saldo;
    private boolean status;
    public void abrirConta(){
        this.status = true;
    }
    public void fecharConta(){
        if(this.saldo==0){
            this.status = false;
        }else{
            System.out.println("Erro ao fechar a conta");
        }
    }
    public void depositar(double deposito){
        this.saldo += deposito;
    }
    public void sacar(double saque){
        if(saque<=this.saldo){
            this.saldo -= saque;
        }else{
            System.out.println("Erro ao realizar o saque");
        }
    }
    public void pagarMensal(){
        if(this.tipoConta == "Conta Corrente"){
            this.saldo -= 12;
        }else if(this.tipoConta== "Poupança"){
            this.saldo -= 20;
        }
    }

    public Conta(int numConta, String tipoConta, String cliente) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.cliente = cliente;
        if(tipoConta.equals("Conta Corrente")){
            this.saldo = 50;
        }else if(tipoConta.equals("Poupança")){
            this.saldo = 150;
        }
        this.status = true;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void informacoes(){
        System.out.println(getCliente());
        System.out.println(getNumConta());
        System.out.println(getTipoConta());
        System.out.printf("R$%.2f %n",getSaldo());
        if(getStatus()==true){
            System.out.println("A conta está aberta");
        }else{
            System.out.println("A conta está fechada");
        }
    }
    public boolean confirmarSenha(int senha, int senhaDigitada){
        if(senha==senhaDigitada){
            return true;
        }else{
            return false;
        }
    }
}
