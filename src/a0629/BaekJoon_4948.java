package a0629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon_4948 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		while(true){ //정수 입력받아 리스트에 add,0이 입력되면 종료
			int num=Integer.parseInt(br.readLine());
			if(num==0)
				break;
			else
				arr.add(num);
		}
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<arr.size();i++){ //리스트 크기만큼 반복
			
			int num=arr.get(i);
			boolean[] chk=new boolean[num*2+1];
			chk[0]=true;chk[1]=true;
			
			for(int j=2;j<=Math.sqrt(num*2);j++){
				
				if(chk[j]==true) // chk[j]=true일 경우 다음 반복으로 넘어감
					continue;
				
				for(int k=j*j;k<chk.length;k+=j){
					chk[k]=true;
				}
				
			}
			
			int count=0;
			for(int j=num+1;j<chk.length;j++){
				if(chk[j]==false)
					count++;
			}
			
			sb.append(count).append("\n");
			
		}
		sb.setLength(sb.length()-1);
		System.out.println(sb);
		
	}

}
