public class Student {
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa){
        this.name =name;
        this.age=age;
        this.gpa= gpa;


    }


    public void displayInfo() {
        System.out.println("Student name is " +this.name);
        System.out.println("Student age is " +this.age);
        System.out.println("Student gpa is " +this.gpa);
    }

    public void study() {
        System.out.println("The student " +this.name + " study very hard");
    }

//    getName
    public String getName() {
        return name;
    }
//    setName
    public void setName(String name){
        this.name = name;
    }
//    getAge
    public int getAge(){
        return age;
    }
//    setAge
    public void setAge(int age){
        if(age>0 ) {
            this.age = age;
        }
        else {
            System.out.println("your age not less than zero..");
        }
    }

    //        getGPA
    public double getGPA(){
        return  gpa;
    }
//    setGPA
    public  void setGPA(double gpa){
        if(gpa>0 && gpa<=4){
            this.gpa =gpa;
        }
        else{
            System.out.println("your gpa must be between 0:4");
        }
    }
}
