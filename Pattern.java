public class Pattern {
	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			for(int j=5;j>i;j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
