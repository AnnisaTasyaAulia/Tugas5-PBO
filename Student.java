package Tugas5;



public class Student extends Person {
    int numCourse;
    String[] courses;
    int[] grades;

    public Student(String name, String address) {
        super(name, address);
        this.numCourse = 0;
        this.courses = new String[30]; //Maksimal 30 MataKuliah
        this.grades = new int[30];
    }

     public void addCourseGrade(String course, int grade) {
        if (numCourse < 30) {
            courses[numCourse] = course;
            grades[numCourse] = grade;
            numCourse++;
        }
    }
    
    public void printGrades() {
        for (int i = 0; i< numCourse; i++){
            System.out.println("Course : " + courses[i] + ", Grade : " + grades[i]);
        }
    }
    
    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < numCourse; i++) {
            sum += grades[i];
        }
        return sum / numCourse;
    }
    
    @Override
    public String toString() {
        return "Student: " + super.name + " (" + super.address + ")";
    }
}
    
