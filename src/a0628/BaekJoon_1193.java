package a0628;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1193 {

	public static void main(String[] args) throws IOException {

		int a=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int b=1;
		int c=1;
		//b: a번쨰칸이 있는 대각선 라인까지의 누적
		//c: a번째칸이 있는 n번째 라인
			while(a>b){
				c++;
				b+=c;
			}
			int d=a-(b-c);
		
		if(c%2==0)
			System.out.println(d+"/"+(c-(d-1)));
		else
			System.out.println((c-(d-1))+"/"+d);
		
	}
}
