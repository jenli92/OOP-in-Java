public class Student{

    //static block
    static{
        System.out.println("Initialzer")
    }

    String name;
    int age;
    String address;
    static String college = "XYZ";
    static int count = 0;

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

    static void studentCount(){
        count = count + 1;
    }

    int getCount(){
        return count;
    }

}