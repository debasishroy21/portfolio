import java.util.Scanner;

// class fun {
//     void search(String a) {
//         int index = a.indexOf('*');
//         if (index == -1) {
//             System.out.println("not found");
//         } else {
//             String newstr = a.substring(0, index - 1);
//             System.out.println(newstr);
//         }
//     }

// }
class test {
    int a = 10;

    void ex(int a) {
        a = this.a + a;
        System.out.println(a);
    }
}

public class qs1 {
    public static void main(String[] args) {
        // fun f = new fun();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the strint");
        // String a = sc.nextLine();
        // f.search(a);
        test sc = new test();
        sc.ex(1);

    }
}