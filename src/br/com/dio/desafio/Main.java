package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // dos conteúdos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // criando o Bootcamp e adicionando os conteúdos nele
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // criando um dev e inscrevendo no bootcamp...
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir(); // concluiu o primeiro curso
        devCamila.progredir(); //concluiu o segundo curso

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        //criando outro dev
        Dev devLeidiane = new Dev();
        devLeidiane.setNome("Leidiane");
        devLeidiane.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Leidiane:" + devLeidiane.getConteudosInscritos());

        devLeidiane.progredir(); // concluiu um curso

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Leidiane:" + devLeidiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Leidiane:" + devLeidiane.getConteudosConcluidos());
        System.out.println("XP:" + devLeidiane.calcularTotalXp());
    }
}