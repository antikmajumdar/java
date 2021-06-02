import java.util.*;
class Test_9{
    static void volume(int s){
        int vc = s * s * s;
        System.out.println("Volume of cube: " + vc);
    }
    static void volume(double pi, int r){
        double vs = (4 / 3) * pi * r * r * r;
        System.out.println("Volume of sphere: " + vs);
    }
    static void volume(int l, int b, int h){
        int vcd = l * b * h;
        System.out.println("Volume of cuboid: " + vcd);
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side of cube, radius of a sphere and length, breadth and height of a cuboid respectively: ");
        int s = sc.nextInt();
        int r = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        volume(s);
        volume(22 / 7, r);
        volume(l, b, h);
    }
}