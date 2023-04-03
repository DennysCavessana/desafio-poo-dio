package br.com.dio.desafio;

import java.time.LocalDate;

public class main {
        public static void main(String[] args) {
            Curso curso1 = new Curso();
            curso1.setTitulo("curso java");
            curso1.setDescricao("descrição curso java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("curso js");
            curso2.setDescricao("descrição curso js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("mentoria de java");
            mentoria.setDescricao("descrição mentoria java");
            mentoria.setData(LocalDate.now());


            System.out.println(curso1);
            System.out.println(curso2);
            System.out.println(mentoria);

            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome(("Bootcamp Java Developer"));
            bootcamp.setDescricao("Descrição Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            Dev devDennys = new Dev();
            devDennys.setNome("Dennys Lima");
            devDennys.inscreverBottcamp(bootcamp);
            System.out.println("Conteúdos Inscritos Dennys:" + devDennys.getConteudosIncritos());
            devDennys.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos Dennys:" + devDennys.getConteudosIncritos());
            System.out.println("Conteúdos Concluidos Dennys:" + devDennys.getConteydosConcluidos());

            System.out.println("XP:" + devDennys.calcularTotalXp());

            System.out.println("-------");

            Dev devJoao = new Dev();
            devJoao.setNome("João");
            devJoao.inscreverBottcamp(bootcamp);
            System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosIncritos());
            devJoao.progredir();
            System.out.println("-");
            System.out.println("Conteúdos Inscritos João:" +devJoao.getConteudosIncritos());
            System.out.println("Conteúdos Concluidos João:" + devJoao.getConteydosConcluidos());
            System.out.println("XP:" + devJoao.calcularTotalXp());

                                }

        }