package Tugas5;



public class Teacher extends Person {
    String[] courses;
    int numCourse;

    public Teacher(String nama, String address) {
        super(nama, address);
        this.courses = new String[30];
        this.numCourse = 0;
    }
    
     public boolean addCourse(String course) {
        if (numCourse < 30) {
            for (int i = 0; i < numCourse; i++) {
                if (courses[i].equals(course)) {
                    return false; 
                }
            }
            courses[numCourse] = course;
            numCourse++;
            return true;
        }
        return false; 
    }
     
    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourse; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourse - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourse--;
                return true;
            }
        }
        return false; // Course not found
    }
    
    @Override
    public String toString() {
        return "Teacher: " + super.name + " (" + super.address + ")";
    }
}
