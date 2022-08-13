package Lista3;

import java.util.Scanner;

public class e6  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 0;
        while (i < 20){
        	i++;
        	System.out.println(i);
        }
        i = 0;
        while (i < 20) {
        	i++;
        	if (i <= 19) {
        	System.out.print(i + " | ");
        	}
        	if (i==20) {
        		System.out.println(i);
        	}
        }
	}
}
