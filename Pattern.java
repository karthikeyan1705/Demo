
public class Pattern {

	public static void main(String args[]) {
		int b=Integer.parseInt(args[0]);
		
		for(int i=0;i<=b;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
