public class ContaBancaria {
    private int saldo;

    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public void deposita(int valor){
        this.saldo += valor;
    }
    public boolean levanta(int valor){
        return this.saldo >= valor;
    }
    public String getSaldoComoString(){
        return this.saldo + "";
    }
}
