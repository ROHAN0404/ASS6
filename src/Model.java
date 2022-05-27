import java.util.Scanner;
class Model {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		int temp=0;
		int no,i;
		no=obj.nextInt();
		for(i=2;i<no;i++) {
			if(no%i==0) {
				temp+=1 ;
				}
			}
		if(temp<0) {
			System.out.print("It is not prime");
			
		}
		else {
			System.out.print("it is prime number");
		}								
	}
}