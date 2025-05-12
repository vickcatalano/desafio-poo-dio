package br.com.dio.desafio.dominio;

// Classe abstrata que representa um conteúdo que pode ser estudado
public abstract class Conteudo {

    // Constante que define o valor de XP padrão para conteúdos
    protected static final double XP_PADRAO = 10d;

    // Atributos que armazenam o título e a descrição do conteúdo
    private String titulo;
    private String descricao;

    // Método abstrato para calcular o XP (pontuação de experiência) de um conteúdo.
    // Este método deve ser implementado pelas classes filhas.
    public abstract double calcularXp();

    // Método que retorna a descrição do conteúdo
    public String getDescricao() {
        return descricao;
    }

    // Método que permite configurar a descrição do conteúdo
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método que retorna o título do conteúdo
    public String getTitulo() {
        return titulo;
    }

    // Método que permite configurar o título do conteúdo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}