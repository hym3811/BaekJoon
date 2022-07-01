package a0629;
import java.io.*;

public class BaekJoon_11653 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		if(N!=1){
			
			while(true){
				int check=0;
				
				for(int i=2;i<N;i++){
					if(N%i==0){
						System.out.println(i);
						N=N/i;
						check++;
						break;
					}
				}
				
				if(check==0){
					break;
				}
			}
			System.out.println(N);
			
		}
	}
}
