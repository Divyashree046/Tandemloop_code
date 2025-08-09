/*Problem-3: With a single integer as the input, generate the following until a = x [series of numbers as shown in below examples]
 
  Output: (examples)
    1) input a = 1, then output : 1
    2) input a = 2, then output : 1
    3) input a = 3, then output : 1, 3, 5
    4) input a = 4, then output : 1, 3, 5
    5) input a = 5, then output : 1, 3, 5, 7, 9
    6) input a = 6, then output : 1, 3, 5, 7, 9
    .
    .
    7) input a = x, then output : 1, 3, 5, 7, .......*/

package package1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        scanner.close();
        
        generateSeries(a);
    }
    
    public static void generateSeries(int a) {
        int maxNumber;
        if (a % 2 == 1) 
        { 
            maxNumber = 2 * a - 1;
        } else 
        {
            maxNumber = 2 * (a - 1) - 1;
        }
        
        StringBuilder series = new StringBuilder();
        for (int i = 1; i <= maxNumber; i += 2) {
            if (series.length() > 0) {
                series.append(", ");
            }
            series.append(i);
        }
        
        System.out.println(series.toString());
    }
}
