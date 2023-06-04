import java.util.Scanner; //Підключаємо клас сканер

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String window = in.nextLine();
        
        in.close();
        System.out.println(window.toUpperCase());
        System.out.println(window.toLowerCase());
        System.out.println(window.charAt(0));
        System.out.println(window.charAt(window.length() - 1));
    }
}