// 屬三退一的小程式

public class Count3quit{
	public static void main(String[] args){
		KidCircle cir = new KidCircle(500);
		
		int count3_value=0;
		Kid k = cir.first;
		while(cir.count>1){
			count3_value++;
			if(count3_value==3){
				count3_value = 0;
				cir.remove(k);
			}
			k = k.right;
		}

		System.out.println("the last life kid is "+cir.first.id);	
	}
}

class Kid{
	int id;
	Kid left,right;
	Kid(int id){
		this.id = id;
	}
	
}
class KidCircle{
	int count=0;
	Kid first,last;

	KidCircle(int num){
		for(int i=0;i<num;i++){
			add();
		}
	}

	public void add(){
		Kid kid = new Kid(count);
		//System.out.println(count);	
		if(count<=0){
			first = kid;
			last = kid;
			kid.left  = kid;
			kid.right = kid; 
		}else{	
			last.right = kid;
			kid.left = last;
			kid.right = first;
			first.left = kid;	
			last = kid; 	
		}
		count++;
	}
	
	public void remove(Kid kid){
		if(count<=0){
			return;
		}else if(count==1){
			first = null;
			last = null;
		}else{	
			kid.right.left = kid.left;
			kid.left.right = kid.right;

			if(kid==first){
				first = kid.right;
			}
			if(kid==last){
				last = kid.left;
			}
		}
		count--;
	}


	
}