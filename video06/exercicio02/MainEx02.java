package exercicio02;

public class MainEx02 {
    public static void main(String[] args) {
        Subject subject1 = new Subject("Matemática", 80);
        Subject subject2 = new Subject("Calculo", 60);

        Teacher teacher = new Teacher("Marcos", "Doutor");
        teacher.addSubjects(subject1);
        teacher.addSubjects(subject2);

        System.out.println(teacher.info());
    }
}
