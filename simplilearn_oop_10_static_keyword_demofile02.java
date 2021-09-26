public class StaticDemo {
    public static void main(String[] args){
        Student obj1 = new Student("John", 25, "25 East, California");

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getAddress());
        //the static Student.college should be access in a static way
        //System.out.println(obj1.college);
        //System.out.println(Student.college)
        Student.studentCount();

    }
    
}
