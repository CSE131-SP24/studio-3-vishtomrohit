package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("How many number");
		int num = in.nextInt();



		num = num - 1;
		boolean[] totalNum = new boolean[num];
		for(int i = 2; i < totalNum.length + 1; i++) {

			for(int i2 = i+i; i2 < totalNum.length; i2 += i) {


				totalNum[i2] = true;

			}
		}
		for(int i3 = 2; i3 < totalNum.length; i3++) {

			if(totalNum[i3] == false) {

				System.out.println("Prime numbers are: " + i3);

			}}




	}

}
