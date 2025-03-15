package task2;

public class ContaCorrente {
    double saldo;

    void definirsaldoInicial(double saldo){
        this.saldo = saldo;
    }
    void depositar(double valor){
        saldo = saldo + valor;
    }
    void sacar(double valor){
        saldo = saldo - valor;
    }


}
