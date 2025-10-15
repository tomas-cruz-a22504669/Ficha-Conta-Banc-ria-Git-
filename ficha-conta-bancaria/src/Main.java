public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(100);
        conta.deposita(50);
        conta.levanta(70);
        conta.getSaldoComoString();
        System.out.println(conta.getSaldoComoString());
    }
}