package Activities.A12;

public class Main {
    public static void main(String[] args){
        Classes student1 = new Classes();
        System.out.printf("Name: %s%n", student1.name);
        System.out.printf("ID: %s%n", student1.id);
        System.out.printf("Major: %s%n", student1.major);
        System.out.printf("GPA: %s%n", student1.gpa);
        student1.getStudentInfo();
    }
}
