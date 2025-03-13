package task2;

public class testarFuncionario {
    public static void main(String[] args){
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome  = "Silva";
        novoFuncionario.horastrabalhadas = 10;
        novoFuncionario.valorPorHora = 10.50;
        String nomeCompleto = novoFuncionario.nomeCompleto("Luis", "Silva");
        System.out.println(nomeCompleto);
        double valorDoSalario = novoFuncionario.calcularSalario(10,10.50);
        int incrementarHoras = novoFuncionario.incrementarHoras(8);
        double calcularSalario = novoFuncionario.calcularSalario(10,10.50);
        System.out.println(valorDoSalario);



    }
}
