package a0701;

public class test1 {

	static String rs="";
	
	public static void main(String[] args) {

		reverse("hello");

	}

	static void reverse(String s){
		if(s.length()==0){
			System.out.println(rs);
		}else{
			rs+=Character.toString(s.charAt(s.length()-1));
			s=s.substring(0,s.length()-1);
			reverse(s);
		}
		
	}
	
}
