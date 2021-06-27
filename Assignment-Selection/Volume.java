import java.util.*;
class Volume{
    // calculating and displaying the volume of cube
    void overload(int l){ 
        System.out.print("Volume of the cube: " + (l * l * l));
    }
    // calculating and displaying the volume of cuboid
    void overload(int l,int b,int h){ 
        System.out.print("Volume of the cuboid: " + (l * b * h));
    }
    // calculating and displaying the volume of sphere
    void overload(float d, float pi, int r){
        System.out.print("Volume of the sphere: " + (d * pi * r * r * r));
    }
    static void main(){
        // creating an object of the class
        Volume ob = new Volume();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'A' for volume of CUBE");        
        System.out.println("Enter 'B' for volume of CUBOID");       
        System.out.println("Enter 'C' for volume of SPHERE");
        System.out.print("Enter your choice: ");
        // converting user input into uppercase 
        String ch = (sc.next()).toUpperCase(); 
        switch(ch){
            case "A":
                System.out.print("Enter the length of the cube: ");
                ob.overload(sc.nextInt());
                break;
            case "B":
                System.out.print("Enter the length of the cuboid: ");
                int l = sc.nextInt();
                System.out.print("Enter the breadth of the cuboid: ");
                int b = sc.nextInt();
                System.out.print("Enter the height of the cuboid: ");
                int h = sc.nextInt();
                ob.overload(l, b, h);
                break;
            case "C":
                System.out.print("Enter the radius of the sphere: ");
                int r = sc.nextInt();
                float d = 4.0f / 3.0f;
                float pi = 22.0f / 7.0f;
                ob.overload(d, pi, r);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}