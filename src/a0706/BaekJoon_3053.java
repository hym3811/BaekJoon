package a0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_3053 {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		double A = Math.pow(N, 2)*Math.PI;
		double B = Math.pow(N, 2)*2;
		System.out.printf("%.6f\n",A);
		System.out.printf("%.6f",B);

	}

}
