

public class Main {
    public static void main(String[] args) {
          Student student1 = new Student("Hamza",20,3.4);
        Student student2 = new Student("Ali",25,2.9);
        Student student3 = new Student("Ahmed",21,3);
        Student student4 = new Student("Mohamed",22,2.5);

        student1.displayInfo();
        student2.study();

        student3.setGPA(2.4);
        student3.displayInfo();

        double gpa = student4.getGPA();
        System.out.println(student4.name +"'s gpa = " +gpa);
    }

}