import java.util.Scanner;
interface University{
    public void StudentStatus();
    public void FacultyStatus();
    public String result();
}

class MUJ implements University{
    public void StudentStatus(){
       
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the student you want to see the details: ");
        int year = sc.nextInt();
        if(year==1 || year==2 || year==3){
            System.out.println("Current in intermediate sem of MUJ");
        }else if(year==4){
            System.out.println("Final Sem of MUJ");
        }else{
            System.out.println("You are not in university");
        }
    }
    public void FacultyStatus(){
        System.out.println("Teachers are good");
    }
    public String result(){
        return "Top 10 University";
    }
    MUJ(){
        System.out.println("Univ Rank "+ this.result());
    }
}

class IIT implements University{
  
    public void StudentStatus(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year of the student you want to see the details: ");
        int year = sc.nextInt();
        if(year==1 || year==2 || year==3){
            System.out.println("Current in intermediate sem of IIT");
        }else if(year==4){
            System.out.println("Final Sem of IIT");
        }else{
            System.out.println("You are not in university");
        }
    }
    public void FacultyStatus(){
        System.out.println("Teachers are good");
    }
    public String result(){
        return "Top 10 University";
    }
    IIT(){
        System.out.println("Univ Rank "+ this.result());
    }
}

class VIT implements University{
  
    
        public void StudentStatus(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the year of the student you want to see the details: ");
            int year = sc.nextInt();
            if(year==1 || year==2 || year==3){
                System.out.println("Current in intermediate sem of VIT");
            }else if(year==4){
                System.out.println("Final Sem of VIT");
            }else{
                System.out.println("You are not in university");
            }
        }
        public void FacultyStatus(){
            System.out.println("Teachers are good");
        }
    public String result(){
        return "Top 10 University";
    }
    VIT(){
        System.out.println("Univ Rank "+ this.result());
    }
}



public class prog3
{
	public static void main(String args[]) {
		MUJ muj = new MUJ();
		IIT iit = new IIT();
		VIT vit = new VIT();
		muj.StudentStatus();
		iit.StudentStatus();
		vit.StudentStatus();
		muj.FacultyStatus();
		iit.FacultyStatus();
        vit.FacultyStatus();
        muj.result();
        iit.result();
        vit.result();
	}
}