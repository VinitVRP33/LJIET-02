
import java.util.*;

public class assign1{

    public static void main(String[] args) {
        Circle  c=new Circle();
        c.setRadius();
        c.getArea();
        c.getCircumference();
    }
}
 class Circle{

    float radius;
    public void setRadius(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        radius=sc.nextFloat();
        
    }
    public void getArea(){
        float area=(float)Math.PI*radius*radius;
        System.out.println("The  area of the entered radius is : "+ area);
    }
    public void getCircumference(){
        float circum=(float)Math.PI*radius*2;
        System.out.println("The  circumference of the entered radius is : "+ circum);
    }
}
