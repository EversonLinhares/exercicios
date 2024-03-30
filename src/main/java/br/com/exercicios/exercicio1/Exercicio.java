package br.com.exercicios.exercicio1;

public class Exercicio {

    public static void main(String[] args) {
        CalculadorVotos calculador = new CalculadorVotos(1000, 800, 150, 50);
        System.out.println("Percentual de votos válidos: " + calculador.calcularPercentualVotosValidos() + "%");
        System.out.println("Percentual de votos brancos: " + calculador.calcularPercentualVotosBrancos() + "%");
        System.out.println("Percentual de votos nulos: " + calculador.calcularPercentualVotosNulos() + "%");

    }
}
