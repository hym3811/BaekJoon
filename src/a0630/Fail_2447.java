package a0630;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fail_2447 {
	
	static char[][] arr;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		arr=new char[N][N];
		
		save(0,0,N,false);
		
		
		
	}

	static void save(int x,int y,int N,boolean check){
		
		if(check){//공백일 경우
			for(int i=x;i<x+N;i++){
				for(int j=y;j<x+N;j++){
					arr[i][j]=' ';
				}
			}return;
		}
		
		if(N==1){
			arr[x][y]='*';
			return;
		}
		
		int size=N/3;
		int count=0;
		for(int i=x;i<x+N;i+=size){
			for(int j=y;j<y+N;j+=size){
				count++;
				if(count==5){
					save(i,j,size,true);
				}else{
					save(i,j,size,false);
				}
			}
		}
		
	}
	
}