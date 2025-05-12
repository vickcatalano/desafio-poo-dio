package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

// Classe que representa um Bootcamp
public class Bootcamp {

    // Nome do Bootcamp
    private String nome;

    // Descrição do Bootcamp
    private String descricao;

    // Data inicial do Bootcamp, sempre será a data atual
    private final LocalDate dataInicial = LocalDate.now();

    // Data final do Bootcamp, 45 dias após a data inicial
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    // Conjunto de desenvolvedores inscritos no Bootcamp
    private Set<Dev> devsInscritos = new HashSet<>();

    // Conjunto de conteúdos do Bootcamp (por exemplo, cursos, palestras)
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // Método para obter o nome do Bootcamp
    public String getNome() {
        return nome;
    }

    // Método para definir o nome do Bootcamp
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter a descrição do Bootcamp
    public String getDescricao() {
        return descricao;
    }

    // Método para definir a descrição do Bootcamp
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Método para obter a data inicial do Bootcamp
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    // Método para obter a data final do Bootcamp
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    // Método para obter o conjunto de desenvolvedores inscritos no Bootcamp
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    // Método para definir os desenvolvedores inscritos no Bootcamp
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    // Método para obter o conjunto de conteúdos do Bootcamp
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // Método para definir os conteúdos do Bootcamp
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    // Método equals para comparar dois objetos Bootcamp
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Se os objetos forem iguais em referência, retorna true
        if (o == null || getClass() != o.getClass()) return false; // Verifica se o objeto é do mesmo tipo
        Bootcamp bootcamp = (Bootcamp) o; // Cast para o tipo Bootcamp
        return Objects.equals(nome, bootcamp.nome) &&
                Objects.equals(descricao, bootcamp.descricao) &&
                Objects.equals(dataInicial, bootcamp.dataInicial) &&
                Objects.equals(dataFinal, bootcamp.dataFinal) &&
                Objects.equals(devsInscritos, bootcamp.devsInscritos) &&
                Objects.equals(conteudos, bootcamp.conteudos);
    }

    // Método hashCode para gerar o código hash para o objeto Bootcamp
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}