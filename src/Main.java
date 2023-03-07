import java.util.Scanner;

public class Main {
     public static double[] device() {
          Scanner in = new Scanner(System.in);
          double[] itog = new double[3];
          for (int i = 0; i < 2; i++) {
               itog[i] = in.nextDouble();
          }
          return itog;
     }


     public static void main(String[] args) {
          Calculate calc1 = new Calculate(device());
          Calculate calc2 = new Calculate(device());
          Calculate calc3 = new Calculate(device());
          Calculate[] array = {calc1, calc2, calc3};
          for(Calculate i:array){
               System.out.println(i.calculate1());
               System.out.println(i.calculate2());
               System.out.println(i.calculate3());
          }
}}