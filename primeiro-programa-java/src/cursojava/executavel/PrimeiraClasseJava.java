package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	/*Main é um metódo auto executável em Java*/
	public static void main(String[] args) {
		
		/*new aluno() é uma instância (criação do objeto)*/
		/*aluno1 é uma referência para o objeto Aluno*/
		
	/*String nome = JOptionPane.showInputDialog("Qual é o nome do aluno: ");
	String idade = JOptionPane.showInputDialog("Qual é a idade do aluno: ");
	String dataNascimento = JOptionPane.showInputDialog("Qual é a data de nascimento do aluno: ");
	String RegistroGeral = JOptionPane.showInputDialog("Qual é o RG do aluno: ");
	String NumeroCpf = JOptionPane.showInputDialog("Qual é o CPF do aluno: ");
	String nomeMae = JOptionPane.showInputDialog("Qual é o nome da Mãe do aluno: ");
	String nomePai = JOptionPane.showInputDialog("Qual é o nome da Pai do aluno: ");
	String DataMatricula = JOptionPane.showInputDialog("Qual é a data de matricúla do aluno: ");
	String SerieMatriculado = JOptionPane.showInputDialog("Qual é a série de matricúla do aluno: ");
	String nota1 = JOptionPane.showInputDialog("Qual é a primeira nota do aluno: ");
	String nota2 = JOptionPane.showInputDialog("Qual é a segunda nota do aluno: ");
	String nota3 = JOptionPane.showInputDialog("Qual é a terceira nota do aluno: ");
	String nota4 = JOptionPane.showInputDialog("Qual é a quarta nota do aluno: ");

		
	Aluno aluno1 = new Aluno();
		
	aluno1.setNome(nome);
	aluno1.setIdade(Integer.valueOf(idade));
	aluno1.setDataNascimento(dataNascimento);
	aluno1.setRegistroGeral(RegistroGeral);
	aluno1.setNumeroCpf(NumeroCpf);
	aluno1.setNomeMae(nomeMae);
	aluno1.setNomePai(nomePai);
	aluno1.setDataMatricula(DataMatricula);
	aluno1.setSerieMatriculado(SerieMatriculado);
	aluno1.setNota1(Double.parseDouble(nota1));
	aluno1.setNota2(Double.parseDouble(nota2));
	aluno1.setNota3(Double.parseDouble(nota3));
	aluno1.setNota4(Double.parseDouble(nota4));
	
	System.out.println("Nome do aluno: " + aluno1.getNome());
	System.out.println("Idade do aluno: " + aluno1.getIdade());
	System.out.println("Nascimento: " + aluno1.getDataNascimento());
	System.out.println("RG: " + aluno1.getRegistroGeral());
	System.out.println("CPF: " + aluno1.getNumeroCpf());
	System.out.println("Nome Mãe: " + aluno1.getNomeMae());
	System.out.println("Nome Pai: " + aluno1.getNomePai());
	System.out.println("Data de matricula: " + aluno1.getDataMatricula());
	System.out.println("Série de matricúla: " + aluno1.getSerieMatriculado());
	System.out.println("Primeira nota: " + aluno1.getNota1());
	System.out.println("Segunda nota: " + aluno1.getNota2());
	System.out.println("Terceira nota: " + aluno1.getNota3());
	System.out.println("Quarta nota: " + aluno1.getNota4());
	System.out.println("");*/
		
		
		//System.out.println(aluno1.toString());/*Descrição do Objeto na memória, com o toString.*/
		//System.out.println("Média do Aluno: " + aluno1.getMediaNota());
		//System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? " Aprovado " : " Reprovado "));
		
		/*Equals e HashCode( Diferenciar e comparar Objetos)*/
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		aluno1.setNumeroCpf("123");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		aluno2.setNumeroCpf("1234");
		
		if (aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		} else {
			System.out.println("Alunos não são iguais");
		}
		
		
		
		
		

			
	}
}
