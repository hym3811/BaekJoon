package a0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1018 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int y = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		
		boolean[][] arr = new boolean[x][y];
		
		for(int i=0;i<y;i++){
			String str=br.readLine().substring(0,x);
			for(int j=0;j<x;j++){
				arr[j][i]=str.charAt(j)==('B'); //B(검정색)칸이면 true 아니면 false
			}
		}
		boolean[][] b = new boolean[8][8]; //B시작인 8x8배열
		boolean[][] w = new boolean[8][8]; //W시작인 8x8배열
		
		for(int i=0;i<8;i+=2){
			for(int j=0;j<8;j++){
				if(j%2==0){
					b[j][i]=true;
					w[j][i]=false;
				}else{
					b[j][i]=false;
					w[j][i]=true;
				}
			}
		}
		
		for(int i=1;i<8;i+=2){
			for(int j=0;j<8;j++){
				if(j%2==0){
					b[j][i]=false;
					w[j][i]=true;
				}else{
					b[j][i]=true;
					w[j][i]=false;
				}
			}
		}
		
		int result=64;
		for(int i=0;i<=y-8;i++){// y시작점의 최대값=y-8
			for(int j=0;j<=x-8;j++){// x시작점의 최대값=x-8
				
				boolean[][] temp = new boolean[8][8];//시작지점으로부터 8x8 임시배열
				for(int k=i;k<i+8;k++){// 시작 좌표의 y범위
					for(int l=j;l<j+8;l++){// 시작 좌표의 x범위
						
						temp[l-j][k-i]=arr[l][k];
						
					}
				}

				int count=0;
				for(int k=0;k<8;k++){ //B시작 배열과 비교
					for(int l=0;l<8;l++){
						if(temp[l][k]!=b[l][k]){
							count++;
						}
					}
				}
				if(count<result)
					result=count;
				
				count=0;
				for(int k=0;k<8;k++){ //W시작 배열과 비교
					for(int l=0;l<8;l++){
						if(temp[l][k]!=w[l][k]){
							count++;
						}
					}
				}
				if(count<result)
					result=count;
			}
		}
		System.out.println(result);
	}

}
