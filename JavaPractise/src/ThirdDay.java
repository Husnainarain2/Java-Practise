import java.sql.SQLOutput;
import java.util.Scanner;

public class ThirdDay {
   private double radius;
   private double height;
   private double volume;
   public double setRadius(double volume,double height){
       this.volume=volume;
       this.height=height;
      this.radius= Math.sqrt(volume/(Math.PI*height));
       return radius;
   }
   public double setHeight(double volume,double radius){
       this.radius=radius;
       this.volume=volume;
       this.height=(volume/(Math.PI*radius*radius));
       return height;
   }
   public void displayRadius(){
       System.out.println("Radius of Your Cylinder is :"+ radius);

   }
   public void displayHeight(){
       System.out.println("Height of Your Cylinder is :"+ height);
   }
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ThirdDay Cylinder =new ThirdDay();
        int choice;
        int V;
        int h;
        int r;
        do {
            System.out.println("Choice 1 to find Radius");
            System.out.println("Choice 2 to find the height");
            System.out.println("Choice 3 to Exits");
            choice=input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the Volume and height of Cylinder to find the radius:");
                     V=input.nextInt();
                     h=input.nextInt();
                    Cylinder.setRadius(V,h);
                    Cylinder.displayRadius();
                    break;
                case 2:
                    System.out.println("Enter the Volume and radius of Cylinder to find the height:");
                    V =input.nextInt();
                    r=input.nextInt();
                    Cylinder.setHeight(V,r);
                    Cylinder.displayHeight();
                    break;

                default:
                    System.out.println("invalid Choice");
            }
        }while (choice<=2);
    }
}
