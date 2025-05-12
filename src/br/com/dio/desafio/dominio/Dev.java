package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    // Nome do desenvolvedor
    private String nome;

    // Conjunto de conteúdos em que o dev está inscrito
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    // Conjunto de conteúdos que o dev concluiu
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    /**
     * Método para inscrever o desenvolvedor em um Bootcamp.
     * Adiciona todos os conteúdos do Bootcamp à lista de inscritos do dev.
     * Além disso, o desenvolvedor é adicionado à lista de inscritos do Bootcamp.
     *
     * @param bootcamp O bootcamp ao qual o dev será inscrito.
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        // Adiciona todos os conteúdos do bootcamp ao dev
        this.conteudosInscritos.addAll(bootcamp.getConteudos());

        // Adiciona o dev à lista de inscritos do bootcamp
        bootcamp.getDevsInscritos().add(this);
    }

    /**
     * Método para o dev progredir em seu aprendizado.
     * O método encontra o primeiro conteúdo da lista de inscritos,
     * marca como concluído e o remove da lista de conteúdos inscritos.
     */
    public void progredir() {
        // Procura o primeiro conteúdo que o dev está inscrito
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        // Se o dev está inscrito em pelo menos um conteúdo, ele pode progredir
        if (conteudo.isPresent()) {
            // Adiciona o conteúdo à lista de conteúdos concluídos
            this.conteudosConcluidos.add(conteudo.get());

            // Remove o conteúdo da lista de conteúdos inscritos
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            // Se não há conteúdos para o dev progredir
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Método para calcular o total de XP do desenvolvedor.
     * Soma os XP de todos os conteúdos concluídos.
     *
     * @return O total de XP conquistado pelo dev.
     */
    public double calcularTotalXp() {
        // Usando um iterador para percorrer os conteúdos concluídos
        Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
        double soma = 0;

        // Percorre todos os conteúdos concluídos e soma os XP
        while(iterator.hasNext()){
            double next = iterator.next().calcularXp(); // Calcula o XP de cada conteúdo
            soma += next; // Soma o XP ao total
        }

        return soma;

        // Alternativa utilizando stream (comentado por não ser usado no código atual)
        /*return this.conteudosConcluidos
                .stream()  // Cria um fluxo dos conteúdos concluídos
                .mapToDouble(Conteudo::calcularXp)  // Mapeia o cálculo do XP
                .sum(); // Soma todos os XP*/
    }

    // Métodos getter e setter para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getter e setter para os conteúdos inscritos
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    // Métodos getter e setter para os conteúdos concluídos
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    /**
     * Método sobrescrito para comparar dois objetos Dev.
     * Dois objetos Dev são considerados iguais se tiverem o mesmo nome
     * e os mesmos conteúdos inscritos e concluídos.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Verifica se os dois objetos são o mesmo
        if (o == null || getClass() != o.getClass()) return false; // Verifica se o objeto é do mesmo tipo
        Dev dev = (Dev) o; // Converte o objeto para o tipo Dev
        return Objects.equals(nome, dev.nome) &&
                Objects.equals(conteudosInscritos, dev.conteudosInscritos) &&
                Objects.equals(conteudosConcluidos, dev.conteudosConcluidos); // Compara os campos relevantes
    }

    /**
     * Método sobrescrito para gerar um código hash único para o objeto Dev.
     * Usado para otimizar o desempenho de coleções baseadas em hash.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos); // Cria o código hash com base nos campos
    }
}