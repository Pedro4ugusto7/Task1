package task2;

public class Funcionario {
    String nome;
    String sobrenome;
    int horastrabalhadas;
    double valorPorHora;

    String nomeCompleto(String nome, String sobrenome){
        String nomeCompleto = nome + " " + sobrenome;
        return nomeCompleto;
    }

    double calcularSalario(int horastrablahdas ,double valorPorHora){
        double calcularSalario = horastrabalhadas * valorPorHora;
        return calcularSalario;
        }
    int incrementadas(int horasincrementadas ){
        int incrementadas = horastrabalhadas + horasincrementadas;
        return incrementadas;
    }
}
