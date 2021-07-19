public class Main {
	private int VALUE = 1;
	private int Array[]= {1,2,3,4,5,6,7,8,9,10};
	
	public static void main(String[] args) {
		Main main=new Main();
		System.out.println(main.BinarySearch());
	}
	public boolean BinarySearch() {
		int left = 0;
		int right = Array.length-1;
		while(true) {
			int midd =(right + left) / 2;
			if(Array[midd]>VALUE)
				right = midd-1;
			else if(Array[midd]<VALUE)
				left = midd+1;
			else return true;
			
			if(left>right)
				return false;
		}
	}
	public int getVALUE() {
		return VALUE;
	}
	public void setVALUE(int vALUE) {
		VALUE = vALUE;
	}
	public int[] getArray() {
		return Array;
	}
	public void setArray(int array[]) {
		Array = array;
	}
}
