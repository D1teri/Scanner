import java.util.Scanner;

public class MyScanner
{

    public void run() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String str1 = scanner.nextLine() + ",";
        Scanner scan = new Scanner(str1).useDelimiter(",");
        while (true) {
            if (scan.hasNext()){
                String str = scan.next();
                //int n = scanner.nextInt();
                //n = n * 3;
                System.out.println(str);
            }
            else{
                scanner = new Scanner(System.in).useDelimiter("\n");
                str1 = scanner.nextLine() + ",";
                scan = new Scanner(str1).useDelimiter(",");
            }
        }
    }

    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
}
