import Entities.Bootcamp;
import Entities.Curso;
import Entities.Dev;
import Entities.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição curso Python");
        cursoPython.setCargaHoraria(10);

        Curso cursoHTML = new Curso();
        cursoHTML.setTitulo("Curso HTML");
        cursoHTML.setDescricao("Descrição curso HTML");
        cursoHTML.setCargaHoraria(6);

        Curso cursoCSS = new Curso();
        cursoCSS.setTitulo("Curso CSS");
        cursoCSS.setDescricao("Descrição curso CSS");
        cursoCSS.setCargaHoraria(4);

        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Mentoria de Python");
        mentoriaPython.setDescricao("Descrição mentoria Python");
        mentoriaPython.setData(LocalDate.now());

        Mentoria mentoriaWeb = new Mentoria();
        mentoriaWeb.setTitulo("Mentoria de Desenvolvimento Web");
        mentoriaWeb.setDescricao("Descrição mentoria Web");
        mentoriaWeb.setData(LocalDate.now().plusDays(2));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Full Stack Developer");
        bootcamp.setDescricao("Descrição Bootcamp Full Stack Developer");
        bootcamp.getConteudos().add(cursoPython);
        bootcamp.getConteudos().add(cursoHTML);
        bootcamp.getConteudos().add(cursoCSS);
        bootcamp.getConteudos().add(mentoriaPython);
        bootcamp.getConteudos().add(mentoriaWeb);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());

        System.out.println("###################################################################################");

        Dev devBruno = new Dev();
        devBruno.setNome("Bruno");
        devBruno.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        devBruno.progredir();
        devBruno.progredir();
        devBruno.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruno: " + devBruno.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruno: " + devBruno.getConteudosConcluidos());
        System.out.println("XP: " + devBruno.calcularTotalXp());

        System.out.println("###################################################################################");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());
    }
}
