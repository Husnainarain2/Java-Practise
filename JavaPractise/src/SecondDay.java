import javax.xml.transform.Source;
import java.util.Scanner;

public class SecondDay {
    private String Car;
    private int car_Model;
    int car_Speed;

    public SecondDay(int car_Speed){
        System.out.println("Your Car is on The Way ");
        this.car_Speed=car_Speed;
    }
   public String setCarName(String car){
        this.Car=car;
        return Car;
   }
   public int carModel(int model){
        this.car_Model=model;
        return car_Model;
   }
   public void Display(){
       System.out.println("Your Car Name is:"+ Car);
       System.out.println("Your Car model is :"+ car_Model);
       System.out.println("Max speed of your car is :"+ car_Speed);
   }
public  static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
      String carName=sc.nextLine();
      String carModel=sc.nextLine();
      int speed=sc.nextInt();
      SecondDay Car=new SecondDay(speed);
    System.out.println(Car);
    }
}
