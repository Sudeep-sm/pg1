class student
{
    String name;
    int age;
    String dob;

    student(String n,int a,String d)
    {
        name=n;
        age=a;
        dob=d;
    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("DOB: "+dob);
    }

}

public class Main {
    public static void main(String[] args) {
        student s= new student("nikhil",19,"04-07-2005");
        s.display();
    }
}
