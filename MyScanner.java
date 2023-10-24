import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s*,\\s*");
        while (true) {
            if (scanner.hasNext()){
                String str = scanner.next();
                //int n = scanner.nextInt();
                //n = n * 3;
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
