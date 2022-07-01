package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2581 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Cal cal=new Cal();
		cal.method(br.readLine(),br.readLine());
		
	}

}
class Cal{
	void method(String s1,String s2){
		int N=Integer.parseInt(s1);
		int M=Integer.parseInt(s2);
		int sum=0;
		int min=10000;
		
		for(int i=N;i<=M;i++){
			int chk=0;
			
			if(i==1){
				chk++;
			}else{
				for(int j=2;j<i;j++){
					if(i%j==0){
						chk++;
						break;
					}
				}
			}
			
			if(chk==0){
				//System.out.print(i+", ");
				sum+=i;
				if(i<min){
					min=i;
				}
			}
			
		}
		if(sum==0){
			System.out.println("-1");
		}else{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
