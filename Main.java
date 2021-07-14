class Student{
    String Name;
    int age;
     int count;

    Student(){
        count++;
        System.out.println("No of times Student called: "+count);
    }
    public void setAge(int ag){
        this.age=ag;
    }
    public void setName(String nam){
        this.Name = nam;
        }
        public String getName(){
            return this.Name;
            }
            public int getAge(){
            return this.age;
            }
        }
        
        
public class Main{
    public static void main(String args[]){
    Student ob1 = new Student();
    ob1.setName("Alankrit");
    ob1.setAge(19);
    Student ob2 = new Student();
    ob2.setAge(18);
    ob2.setName("Alan");
    Student ob3 = new Student();
    ob3.setAge(20);
    ob3.setName("AV");
    System.out.println("The names are "+ ob1.getName()+ " , "+ob2.getName()+" , "+ob3.getName());
    System.out.println("The age are "+ ob1.getAge()+ " , "+ob2.getAge()+" , "+ob3.getAge());
    }
    }
