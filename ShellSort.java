
public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayData arr = new ArrayData();
		int data[]=arr.simple_data;
		arr.printArr(data);

		for(int gap = data.length/2; gap > 0; gap /= 2){
			for (int i = gap; i < data.length; i++) {
				for (int j = i-gap; j >= 0; j-=gap) {
					if(data[j]>data[j+gap]){
						int tmp = data[j];
						data[j] = data[j+gap];
						data[j+gap] = tmp;
					}
				}
			}
		}
		System.out.println();
		arr.printArr(data);
		
		

	}

}
