import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a;
        int b;
        int h;
        int d;
        System.out.println("На скільки футів підіймається равлик: ");
        a = p.nextInt();
        System.out.println("На скільки футів сповзає равлик: ");
        b = p.nextInt();
        System.out.println("Яка висота дерева: ");
        h = p.nextInt();
        if (a < h) {
            if (a > b) {
                d = h / (a - b);
                System.out.print("Заповзе за " + d + " днів");
            } else {
                System.out.print("Impossible");
            }
        }else{
            System.out.print("Заповзе за один день");
        }
    }
}