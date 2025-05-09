package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        // Criando e configurando o primeiro curso
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");  // Título do curso
        curso1.setDescricao("descrição curso java");  // Descrição do curso
        curso1.setCargaHoraria(8);  // Carga horária do curso

        // Criando e configurando o segundo curso
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");  // Título do curso
        curso2.setDescricao("descrição curso js");  // Descrição do curso
        curso2.setCargaHoraria(4);  // Carga horária do curso

        // Criando e configurando uma mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");  // Título da mentoria
        mentoria.setDescricao("descrição mentoria java");  // Descrição da mentoria
        mentoria.setData(LocalDate.now());  // Data atual da mentoria

        // Comentado: Esta parte pode ser útil para depuração, mas será removida
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        // Criando e configurando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");  // Nome do bootcamp
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");  // Descrição do bootcamp
        bootcamp.getConteudos().add(curso1);  // Adicionando o curso1 ao bootcamp
        bootcamp.getConteudos().add(curso2);  // Adicionando o curso2 ao bootcamp
        bootcamp.getConteudos().add(mentoria);  // Adicionando a mentoria ao bootcamp

        // Criando o primeiro desenvolvedor (Camila) e inscrevendo no bootcamp
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");  // Definindo o nome da desenvolvedora
        devCamila.inscreverBootcamp(bootcamp);  // Inscrevendo Camila no bootcamp
        out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());  // Exibindo conteúdos inscritos por Camila
        devCamila.progredir();  // Camila avança no conteúdo
        devCamila.progredir();  // Camila avança mais um conteúdo
        out.println("-");

        // Exibindo o status de inscrição e progresso de Camila
        out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());  // Exibindo conteúdos concluídos
        out.println("XP:" + devCamila.calcularTotalXp());  // Exibindo a experiência total (XP) de Camila

        out.println("-------");

        // Criando o segundo desenvolvedor (João) e inscrevendo no bootcamp
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");  // Definindo o nome do desenvolvedor
        devJoao.inscreverBootcamp(bootcamp);  // Inscrevendo João no bootcamp
        out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());  // Exibindo conteúdos inscritos por João
        devJoao.progredir();  // João avança no conteúdo
        devJoao.progredir();  // João avança mais um conteúdo
        devJoao.progredir();  // João avança mais uma vez
        out.println("-");

        // Exibindo o status de inscrição e progresso de João
        out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        out.println("Conteúdos Concluídos João:" + devJoao.getConteudosConcluidos());  // Exibindo conteúdos concluídos por João
        out.println("XP:" + devJoao.calcularTotalXp());  // Exibindo a experiência total (XP) de João
    }
}