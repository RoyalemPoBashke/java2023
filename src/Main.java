import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        var scan = new Scanner(System.in);
        System.out.println("Превет, напешы свое имя, быстра! ");
        System.out.println("Превет " + scan.nextLine() + "!");
        System.out.println("Тоблица синусов");
        for (double i=0; i <= 45; i+=5)
            {
                System.out.println("Синус    " + (int)i + " градусов    " + Math.sin(i));
            }
    }
}