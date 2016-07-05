
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayData arr = new ArrayData();
		int data[]=arr.data;
		arr.printArr(data);
		
		for (int i = data.length; i > 0 ; i--) {
			for (int j = 0; j < i-1; j++) {
				if(data[j]>data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1]=temp;
				}
			}
		}
		arr.printArr(data);
		
	}

}
