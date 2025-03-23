public class AppTurma {
    public static void main(String[] args) {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        turma1.setCurso("Ciencia da computacao");
        turma1.setDisciplina("Programacao orientada a objetos I");
        turma1.exibeDados();

        System.out.println("Curso: " + turma1.getCurso());
        System.out.println("Disciplina: " + turma1.getDisciplina());

        turma2.setCurso("Medicina");
        turma2.setDisciplina("Fisiologia");
        turma2.exibeDados();

        System.out.println("Curso: " + turma2.getCurso());
        System.out.println("Disciplina: " + turma2.getDisciplina());
    }
}