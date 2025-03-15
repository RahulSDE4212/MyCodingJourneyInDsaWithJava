package Week_4_Method.Assignment;

public class Ques2 {
    public static double areaOfCircle(double radius){
        double area = 3.14 * radius * radius;
        return area;
    }
    public static void main(String[] args) {
        double r = 10;
        double area = areaOfCircle(r);
        System.out.println("area of circle is : " + area);

    }
}
