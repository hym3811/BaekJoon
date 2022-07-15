package a0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_14889 {
	
	static int N;
	static boolean[] team;
	static int[][] status;
	static int[] start;
	static int[] link;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		team = new boolean[N];
		status = new int[N][N];
		start = new int[N/2];
		link = new int[N/2];
		
		for(int i=0;i<N;i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<N;j++){
				status[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		team(0,0);
		System.out.println(min);
		
	}

	static void team(int temp,int idx){
		
		if(idx==N/2){
			int j=0;
			for(int i=0;i<N;i++){
				if(team[i]==false){
					link[j]=i;
					j++;
				}
			}
			//System.out.print("start: "+Arrays.toString(start));
			//System.out.println(" / link: "+Arrays.toString(link));
			result();
			//System.out.println("min: "+min);
			link = new int[N/2];
			return;
		}
		
		for(int i=temp;i<N;i++){
			if(team[i]==false){
				team[i]=true;
				start[idx]=i;
				team(i+1,idx+1);
				team[i]=false;
			}
		}
		
	}
	
	static void result(){
		int result=0;
		int[] sum = new int[2];
		
		for(int i=0;i<N/2;i++){
			for(int j=0;j<N/2;j++){
				sum[0]+=status[start[i]][start[j]];
				sum[1]+=status[link[i]][link[j]];
			}
		}
		//System.out.println("start: "+sum[0]);
		//System.out.println("link: "+sum[1]);
		result=Math.abs(sum[0]-sum[1]);
		//System.out.println("result: "+result);
		if(result<min){
			min=result;
		}
	}
	
}
