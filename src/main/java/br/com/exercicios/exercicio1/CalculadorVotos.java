package br.com.exercicios.exercicio1;

public class CalculadorVotos {

    private Integer totalEleitores;
    private Integer votosValidos;
    private Integer votosBrancos;
    private Integer votosNulos;

    public CalculadorVotos(Integer totalEleitores, Integer votosValidos, Integer votosBrancos, Integer votosNulos) {
        this.totalEleitores = totalEleitores;
        this.votosValidos = votosValidos;
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
    }

    public double calcularPercentualVotosValidos() {
        return (double) votosValidos / totalEleitores * 100;
    }

    public double calcularPercentualVotosBrancos() {
        return (double) votosBrancos / totalEleitores * 100;
    }

    public double calcularPercentualVotosNulos() {
        return (double) votosNulos / totalEleitores * 100;
    }


}
