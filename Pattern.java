public class Pattern {

	public static void main(String args[]) {
		String a=args[0];
		int b=Integer.parseInt(a);
		
		for(int i=0;i<=b;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
