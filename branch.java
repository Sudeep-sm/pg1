class course
{
    String cour;
    int marks;

   course(String c,int m)
   {
    cour=c;
    marks=m;
   }

   void display()
   {
    System.out.println("Course: "+cour);
    System.out.println("Marks: "+marks);
   }
}
public class branch {
    public static void main(String[] args) {
        course c=new course("BCA", 75);
        c.display();
    }
}
