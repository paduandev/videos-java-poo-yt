package exercicio02;

public class Teacher {
    public  final int MAX_SUBJECTS = 5;
    private int amountSubjects;
    private String name;
    private String qualification;
    private Subject[] subjects;

    public Teacher(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
        subjects = new Subject[MAX_SUBJECTS];
        amountSubjects = 0;
    }

    public void addSubjects(Subject subject) {
        if(amountSubjects == MAX_SUBJECTS) return;
        subjects[amountSubjects] = subject;
        amountSubjects++;
    }

    public String info() {
        String out = name + ": disciplinas: ";

        for (int i = 0; i < amountSubjects; i++) {
            out += subjects[i].getTitle() + " ";
        }

        return out;
    }
    
}
