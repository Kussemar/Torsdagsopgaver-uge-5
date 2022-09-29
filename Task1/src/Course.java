public class Course {
    private String courseName;

    //Constructor
public Course(String courseName){
    this.courseName = courseName;
    }

    @Override
    public String toString(){
        return courseName;
    }
}

