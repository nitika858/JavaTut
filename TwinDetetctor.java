import java.util.Scanner
  public class Student{
  private String name;
  private int rollNo;
  private int age;
  public Student(String name,int rollno,int age){
    this.num=num;
    this.rollno= rollno;
    this.age= age;
}
    public String getname(){
        return name;
    }
    public int getroll(){
        return rollno;
    }
    public int getage(){
        return age;
    }
    public boolean hasSameAge(Student other){
        return this.age==other.age;
    }
    public boolean isTwin(Student other){
        boolean SameAge= this.hasSameAge(other);
        boolean Sameroll= (this.rollno == other.getroll());
        return SameAge && Sameroll;
    }

}

public class TwinDetetctor{
  public static void main(string[] args)throws Exception{
       student[] students= new Student[500];
       int count =0;
       Scanner sc = new Scanner(new file("students.txt"))
       while(sc.hasNextLine()){
         string line=sc.nextline();
         if(line.isBlank()) continue;
         String[] parts = line.split(",");
         String name=parts[0];
         int rollnum = Integer.parseInt(parts[1]);
         int age = Integer.parseInt(parts[2]);
         students[count] = new Student(name, rollno, age);
         count++;
         }
         sc.close()
       System.out.println("Total Enteries = "+count);
       System.out.println(("\n----------Pairs Found-----------"));
  }

}