class Student{​​
    static int count; String name; int age;
    Student(){​​
    count++;
    System.out.println("The number of times the Student class has been called is "+ count);
    }​​
    public void setAge(int a){​​
    this.age = a;
    }​​
    public void setName(String nm){​​
    this.name = nm;
    }​​
    public String getName(){​​
    return this.name;
    }​​
    public int getAge(){​​
    return this.age;
    }​​
    }​​
    
    
    
    public class Student{​​
    public static void main(String[] args) {​​
    Student ob = new Student();
    ob.setName("Rachit");
    ob.setAge(21);
    Student ob2 = new Student();
    ob2.setAge(20);
    ob2.setName("Khushi");
    System.out.println("The names are "+ ob.getName()+ " and "+ob2.getName());
    //System.out.println("Hello World");
    }​​
    }​​