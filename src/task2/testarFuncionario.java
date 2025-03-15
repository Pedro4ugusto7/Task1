package task2;

public class testarFuncionario {
    public static void main(String[] args){
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome = "Luis";
        novoFuncionario.sobrenome  = "Silva";
        novoFuncionario.horastrabalhadas = 10;
        novoFuncionario.valorPorHora = 25.50;
        String nomeCompleto = novoFuncionario.nomeCompleto("Luis", "Silva");
        System.out.println(nomeCompleto);
        double valorDoSalario = novoFuncionario.calcularSalario(10,25.50);
        int incrementarHoras = novoFuncionario.incrementadas(8);
        double calcularSalario = novoFuncionario.calcularSalario(10,25.50);
        System.out.println(valorDoSalario);
        int incrementadas = (8);
        double calcularSalario2 = incrementadas * novoFuncionario.valorPorHora ;
        System.out.println(calcularSalario2);



    }
}
