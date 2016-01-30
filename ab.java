 public class ab{
	public static void main (String[] argv){
		int a=10;
		int[] x = new int[]{1,1};
		int[] y ;
		System.out.println("1");
		System.out.println("1,1");
		
		for(int i=2;i<=a;i++){
			y = new int[i+1];
			y[0]=1;
			y[i]=1;
			for(int j=1;j<i;j++){
				y[j]= x[j]+x[j-1];
			}
			for(int c=0;c<y.length;c++){
				System.out.print(y[c]+",");
			}
		x = new int[i+1];
		x=y;
		System.out.println(); 
		}
	}








}