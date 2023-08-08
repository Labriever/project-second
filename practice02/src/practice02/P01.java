package practice02;

public class P01 {
	public static void main(String[] args) {
		int[] i = {1,2,3,4,5,6,7,8,9,10};
		
		Pp pp = new Pp();
		
		pp.name(i);
		
	}
}

class Pp{
	void name(int[] i) {
		System.out.println("xÀÇ °ª = "+ i+ "\n");
	}
}
