package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_1929 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine()," ");
		int M = Integer.parseInt(st.nextToken()); //최소값
		int N = Integer.parseInt(st.nextToken()); //최대값
		
		boolean[] arr=new boolean[N+1]; //소수 출력을 위한 배열, false일 때 소수
		arr[0]=true;arr[1]=true;
		
		for(int i=2;i<=Math.sqrt(N);i++){ //M~√N 범위에서 반복
			
			if(arr[i]==true)
				continue;
			
			for(int j=i*i;j<arr.length;j+=i){ //
				arr[j]=true;
			}
			
		}
		
		StringBuilder sb=new StringBuilder(); 
		for(int i=M;i<=N;i++){
			if(arr[i]==false){
				sb.append(i).append("\n");
			}
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
	}

}
