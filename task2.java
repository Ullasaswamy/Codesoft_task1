import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks obtained in MATHEMATICS out of 100 : ");
        int mat=sc.nextInt();
        System.out.println("Enter Marks obtained in ENGLISH out of 100     : ");
        int eng=sc.nextInt();
        System.out.println("Enter Marks obtained in KANNADA out of 100     : ");
        int kan=sc.nextInt();
        System.out.println("Enter Marks obtained in SCIENCE out of 100     : ");
        int sci=sc.nextInt();
        System.out.println("Enter Marks obtained in SOCIAL out of 100      : ");
        int soc=sc.nextInt();
        System.out.println("Enter Marks obtained in HINDI out of 100       : ");
        int hin=sc.nextInt();
        int totalMark=mat+eng+kan+sci+soc+hin;
        double Average=totalMark/6;
        String Grade=" ";
        if(Average>90. && Average<=100){
           Grade="O";
        }
        else if(Average>80 && Average<=90){
            Grade="E";
        }
       
        else if(Average>70 && Average<=80){
            Grade="A";
        }
     
        else if(Average>60 && Average<=70){
            Grade="B";
        }
        
        else if(Average>50 && Average<=60){
            Grade="C";
        }
        
        else if(Average>40 && Average<=50){
            Grade="D";
        }
        else if(Average<=40){
            Grade="F";
        }
        System.out.println("Your totalmarks = "+totalMark);
        System.out.println("Your Average = "+Average);
        System.out.println("Your Grade = "+Grade);
    }
}
