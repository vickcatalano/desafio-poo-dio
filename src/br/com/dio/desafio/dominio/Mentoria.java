package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

// A classe Mentoria é um tipo específico de Conteúdo, representando uma mentoria
public class Mentoria extends Conteudo {

    // A data da mentoria, armazenada como um objeto LocalDate
    private LocalDate data;

    // Método para calcular a pontuação (XP) obtida com a mentoria
    @Override
    public double calcularXp() {
        // Retorna a soma do XP padrão com um bônus de 20 pontos para a mentoria
        return XP_PADRAO + 20d;
    }

    // Construtor vazio da classe Mentoria
    public Mentoria() {
    }

    // Getter para a data da mentoria
    public LocalDate getData() {
        return data;
    }

    // Setter para a data da mentoria, permitindo definir a data
    public void setData(LocalDate data) {
        this.data = data;
    }

    // Método toString sobrecarregado para exibir as informações da mentoria de forma legível
    @Override
    public String toString() {
        // Retorna uma representação em string das informações da mentoria, incluindo título, descrição e data
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' + // Pega o título da classe pai (Conteudo)
                ", descricao='" + getDescricao() + '\'' + // Pega a descrição da classe pai (Conteudo)
                ", data=" + data + // Inclui a data da mentoria
                '}';
    }
}

