
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayData arr = new ArrayData();	
//arr.printArr(data);
		int data[]={9,3,7,1,5};

		for (int i = 0; i < data.length; i++) {
			int j=i;
				while((j>0) && (data[j]<data[j-1])){
					int tmp = data[j-1];
					data[j-1]=data[j];
					data[j]=tmp;
					j=j-1;
				}
		
		
		//arr.printArr(data);

	}
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
}
