public class Student {
    String name;
    String course;


    public Student (String name, String course) {
        this.name = name;
        this.course = course;

    }

    @Override
    public String toString(){
        return "{"+name + ", " + course+"}";
    }
}

