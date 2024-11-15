public class Student {
    //Variable fun
    public String name;
    public static int id = 0;
    public double gpa = 0;
    public int gradeIn = 0;
    public double grades = 0;
    public Teacher favorite;
    public static int studentCount = 0;

    //Making a constructor
    public Student(String name){
        this.name = name;
        id = studentCount;
        studentCount++;;
    }

    //adds students and updates the ids
    public static void addStudents(int number){
        studentCount+=number;
        id+=number;
    }

    //returns student count
    public static int getStudentCount(){
        return studentCount;
    }

    //gets a students name
    public String getName(){
        return this.name;
    }

    //gets a students id
    public int getID(){
        return id;
    }

    //gets a student gpa by calculating their total scor over number of assignments
    public void addGrade(double grade){
        gradeIn++;
        grades = (grades+grade);
        gpa = grades/gradeIn;
    }

    //returns gpa
    public double getGPA(){
        return this.gpa;
    }

    //returns favorite Teacher object
    public Teacher getFavoriteTeacher(){
        return favorite;
    }

    //sets favorite to a new Teacher object
    public void setFavoriteTeacher(Teacher teacher){
        favorite = teacher;
    }
}
