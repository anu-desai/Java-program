class trial
{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		int c[]={a[(a.length-1)/2],a[a.length/2],a[(a.length-2)]};//For middle three
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}