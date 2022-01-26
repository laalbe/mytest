import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner vi = new Scanner(System.in);
        String str[] = vi.nextLine().split("\"");
        int s = str[1].length();
        if (s > 10) {
            throw new RuntimeException("Исключение");
        }
        char c = str[2].charAt(1);
        int l = str[2].length();
        if (l > 3) {
            String[] v = str[2].split(" ");
            int number = Integer.parseInt(v[2]);
            char z = v[1].charAt(0);
            if (number > 10 || number < 1) {
                throw new RuntimeException("Исключение");
            } else if (z == '/') {
                System.out.println("\""+str[1].substring(0, s / number)+"\"");
            } else if (z == '*') {
                String h = "";
                for (int i = 0; i < number; i++) {
                    h += str[1];
                }
                int i = h.length();
                if (i < 40) {
                    System.out.println("\""+h+"\"");
                }
                if (i > 40) {
                    System.out.println("\""+h.substring(0, 40) + "..."+"\"");
                }
            } else {
                throw new RuntimeException("Исключение");
            }
        } else if (l == 3) {
            int n = str[3].length();
            if (n > 10) {
                throw new RuntimeException("Исключение");
            }
            if (c == '+') {
                System.out.println("\""+str[1] + str[3]+"\"");
            } else if (c == '-') {
                System.out.println("\""+str[1].replace(str[3],"")+"\"");
            } else {
                throw new RuntimeException("Исключение");
            }
        }
    }
}