
public class QuickSort {
	
	ArrayData arr = new ArrayData();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new QuickSort();

	}
	public QuickSort(){
		
		int data[]=arr.simple_data;//{3,5,1,22,66,77,42,78};//arr.simple_data;
		arr.printArr(data);
		quicksort(data,0,data.length-1);
		arr.printArr(data);

	}
	public int partition(int []data,int left,int right){
		
		int L = left-1;
		int R = right;
		while(R>L){
			System.out.print("\nL=[ ");
			while(data[++L] < data[right]){
				//L++;
				System.out.print(L+"("+data[L]+"), ");
			}
			System.out.print("\nR=[ ");
			while(data[right] > data[R]){
				R--;
				System.out.print(R+"("+data[R]+"), ");
			}
			int tmp = data[L];
			data[L] = data[R];
			data[R] = tmp;
			arr.printArr(data);
			
		}
		System.out.println("\n----------------");
		
		return L;
	}
	public void quicksort(int data[],int left,int right){
		if (right <= left) return;
		int i = partition(data, left, right);
        quicksort(data, left, i-1);
        quicksort(data, i+1, right);
		
	}

}
