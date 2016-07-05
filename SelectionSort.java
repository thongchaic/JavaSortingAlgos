
public class SelectionSort {

	public static void main(String[] args) throws Exception{
		ArrayData arr = new ArrayData();
		int data[]={5,9,10,4,1,6};
		
		for(int i=0;i<data.length-1;i++){
			int smallest_index = i;
			for (int j = i+1; j < data.length; j++) {
				if(data[j]<data[smallest_index]){
					smallest_index=j;
				}
			}
			int temp = data[smallest_index];
			data[smallest_index] = data[i];
			data[i] = temp;
		}
		
		
		arr.printArr(data);
	}
}
