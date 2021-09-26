public class Student{
    private String name;
    private int age;
    private String address;

    //constructor needs to be public, so everyone can initialize a student object
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //getter methods;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getAddress(){
        return address;
    }

    public static void main(String[] args){
        Student obj1 = new Student("John", 25, "23 East, California");
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println(obj1.getAddress());
    }


}