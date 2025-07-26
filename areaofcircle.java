import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the radius of circle:");
        Double radius=input.nextDouble();
        Double Area= 3.14 * (radius*radius);
        System.out.println(Area);
    }
}
