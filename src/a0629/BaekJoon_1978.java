package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class BaekJoon_1978 {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int count=0;
		
		for(int i=0;i<num;i++){
			int number=Integer.parseInt(st.nextToken());
			int chk=0;
			
			if(number==1){
				chk++;
			}else{
				for(int j=2;j<number;j++){
					
					if(number%j==0){
						chk++;
						break;
					}
				}
			}
			if(chk==0){
				count++;
			}
		}
		System.out.println(count);
	}
}