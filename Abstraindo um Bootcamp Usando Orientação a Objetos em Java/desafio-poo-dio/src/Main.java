import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição curso java");
		curso.setCargahoraria(8);

		Curso curso2 = new Curso();
		curso.setTitulo("Curso Js");
		curso.setDescricao("Descrição curso js");
		curso.setCargahoraria(6);

		System.out.println(curso);
		System.out.println(curso2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de java");
		mentoria.setDescricao("Descrição de mentoria em java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
		Conteudo conteudoCurso = new Curso();
		conteudoCurso.setTitulo("Curso C#");
		conteudoCurso.setDescricao("Descrição do curso de C#");
//		conteudoCurso.setCargahoraria(10);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp JAVA Developer");
		bootcamp.setDescricao("Descrição do Bootcamp JAVA Developer");
		bootcamp.getConteudo().add(curso);
		bootcamp.getConteudo().add(curso2);
		bootcamp.getConteudo().add(mentoria);
		
		Dev dev = new Dev();
		dev.setNome("João");
		dev.iscricaoBootcamp(bootcamp);
		dev.progredir();
		System.out.println("Conteudo Inscritos: " + dev.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev.getConteudoConcluido());
		System.err.println("XP: " + dev.calcularXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Camila");
		dev2.iscricaoBootcamp(bootcamp);
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudo Inscritos: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudoConcluido());
		System.err.println("XP: " + dev2.calcularXp());
	}

}
