import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter x1: ");
    double x1 = scan.nextDouble(); 

    System.out.print("Enter y1: ");
    double y1 = scan.nextDouble(); 

    System.out.print("Enter x2: ");
    double x2 = scan.nextDouble(); 

    System.out.print("Enter y2: ");
    double y2 = scan.nextDouble(); 

    double adding = add(x1,y1,x2,y2);
    System.out.print(adding);
  }
  public static double add(double x1, double y1, double x2, double y2) {
    double a = Math.pow(x2 - x1, 2);
    double b = Math.pow(y2 - y1, 2);
    double c = Math.sqrt(a + b);
    return c;
  }
}
