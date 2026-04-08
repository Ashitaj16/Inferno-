import java.util.Scanner 
public class Main()
public static void Main(System[] args)
double principal;
double rate;
int timesCompounded;
int years;
double amount;

System.out.print("Enter the principal amount: ");
princiapl= scanner.nextDouble();

System.out.print("Enter the interest rate (in %): ");
rate= scanner.nextDouble() /100;

System.out.print("Enter the # of times compounded per year: ");
timesCompounded = scanner.nextInt();

Ssytem.out.print("Enter the # of years: ");
years = scanner.nextInt();

amount = principal*Math.pow(1 + rate / timesCompounded , timesCompunded*years);

System.out.println("The amount after" +years+"is: $" +amount);

scanner.close();

}
}
