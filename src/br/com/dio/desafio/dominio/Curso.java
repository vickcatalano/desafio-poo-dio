package br.com.dio.desafio.dominio;

// A classe Curso estende a classe Conteudo, o que significa que ela herda propriedades e comportamentos de Conteudo.
public class Curso extends Conteudo {

    // Atributo específico da classe Curso, que armazena a carga horária do curso.
    private int cargaHoraria;

    // Método que calcula a quantidade de XP (experiência) que o curso proporciona.
    // Neste caso, ele retorna a soma do XP padrão com a carga horária do curso.
    @Override
    public double calcularXp() {
        return XP_PADRAO + cargaHoraria;  // XP_PADRAO é um valor constante definido na classe pai (Conteudo).
    }

    // Construtor da classe Curso. Está vazio, mas pode ser expandido se necessário.
    public Curso() {
        // O construtor não faz nada por enquanto, mas pode ser utilizado para inicializações específicas.
    }

    // Getter (acessador) para o atributo cargaHoraria.
    public int getCargaHoraria() {
        return cargaHoraria;  // Retorna o valor da carga horária do curso.
    }

    // Setter (modificador) para o atributo cargaHoraria.
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;  // Atribui o valor passado como argumento ao atributo cargaHoraria.
    }

    // Método toString que fornece uma representação em String do objeto Curso.
    @Override
    public String toString() {
        // Retorna uma string que inclui os atributos título, descrição e carga horária do curso.
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +  // Chama o getter da classe pai para obter o título.
                ", descricao='" + getDescricao() + '\'' +  // Chama o getter da classe pai para obter a descrição.
                ", cargaHoraria=" + cargaHoraria +  // Inclui a carga horária do curso na string.
                '}';
    }
}

