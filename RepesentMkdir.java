import java.io.*;
public class RepesentMkdir{
	public static void main(String[] args){
		File  f = new File("C:/Users/username"); 
		tree(f,0);
	}

	public static void tree(File f, int lev){
		int currectlev;
		File[] chidf = f.listFiles();
		for(int i=0;i<chidf.length;i++){
			level(lev);
			if(chidf[i].isDirectory()){
				System.out.println(chidf[i].getName());
				currectlev = lev+1;
				tree(chidf[i],currectlev);
			}else{
				System.out.println(chidf[i].getName());
			}
				
		}
	}
	
	public static void level(int lev){
		for(int i=0;i<lev;i++){
			System.out.print("   ");
		}
	}

}