package homework;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int array[] = new int[]{7, 5, 7, 2, 7, 5, 6, 7, 8, 7};
        System.out.println(Arrays.toString(array));
        fun(array);    }
    public static void fun(int[] z) {
        boolean ch = true;
        System.out.print("Введіть число: ");
        int n;
        Scanner in=new Scanner(System.in);
        n= in.nextInt();
            for (int i = 0; i <z.length-1; i++)            {
                if (z[i] == n) {
                   int t =z[i];
                   z[i]=z[i+1];
                   z[i+1]=t;}
                for (int j = 0; j <z.length-1; j++)            {
                    if (z[j] == n) {
                        int w =z[j];
                        z[j]=z[j+1];
                        z[j+1]=w;
                         }            }}
            for (int j: z)
                System.out.print(j + " ");
        }
    }