public class Pattern {

	public static void main(int args[]) {
		
		for(int i=0;i<=args[0];i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}

