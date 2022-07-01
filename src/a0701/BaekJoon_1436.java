package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1436 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rs = Integer.parseInt(br.readLine());
		
		/*int i=665;  ---------첫번째 시도 ( 280 ms )
		while(rs>0){
			i++;
			if(Integer.toString(i).contains("666")){ //666이 포함되었는가
				rs--;
			}
		}
		System.out.println(i);*/
		
		/*int i=665; ---------두번째 시도 ( 352 ms )
		while(rs>0){
			i++;
			
			String temp=Integer.toString(i);
			int count=0;
			for(int j=0;j<temp.length();j++){ //temp 사이즈만큼 반복
				if(temp.charAt(j)=='6'){ //temp의 char 인덱스가 6이면 count++ 아니면 count 초기화
					count++;
				}else{
					count=0;
				}
			
				if(count==3){
					rs--;
					break;
				}
			}
			
		}
		System.out.println(i);*/
	}

}
