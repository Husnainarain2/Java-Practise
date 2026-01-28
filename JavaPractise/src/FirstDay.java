import java.util.Scanner;

public class FirstDay {
   private int salary=20000;
    String name;

    public int getSalary(){
       return this.salary;
    }
    public String getName(){
        return  this.name;
    }
    public String setName(String name){
        this.name=name;
        return this.name;
    }


    static void main(String[] args) {
       FirstDay firstClasss=new FirstDay();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String Name=input.nextLine();
        firstClasss.setName(Name);
        System.out.println(firstClasss.getName());
        System.out.println(firstClasss.getSalary());

    }
}
