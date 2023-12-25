package kz.dulatibrayev.solidbankapp.app;

public class test {
	public static void main(String[] args) {
		int p=10; 
		int c = p++ *5;
		
		System.out.println(c);
		
		 print("TruE");
         print("false");
	}
	
	
	public static void print (String str) {
        System.out.println(Boolean.valueOf(str) ? "true" : "false");
}
}
