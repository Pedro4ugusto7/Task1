package task2;

public class testarCC {
    public static void main(String[] args){
        ContaCorrente novaConta = new ContaCorrente();
        novaConta.definirsaldoInicial(1000);
        System.out.println(novaConta.saldo);
        novaConta.sacar(500);
        novaConta.depositar(50);
        System.out.println(novaConta.saldo);
        novaConta.sacar(600);
        System.out.println(novaConta.saldo);
    }
}
