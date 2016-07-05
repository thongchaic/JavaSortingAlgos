import java.util.LinkedList;
import java.util.Queue;


public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayData arr = new ArrayData();
		int data[]=arr.simple_data;
		arr.printArr(data);
		boolean flag = true;
		int divisor = 1;
		Queue [ ] buckets = new Queue[10];
		for (int i = 0; i < 10; i++){
			buckets[i] = new LinkedList();
		}

		while (flag) {
			flag = false;
			for (int i = 0; i < data.length; i++) {
				int hashIndex = (data[i] / divisor) % 10;
				if (hashIndex > 0) flag = true;
				((LinkedList) buckets[hashIndex]).addLast(new Integer(data[i]));
			}
			divisor *= 10;
			int i = 0;
			for (int j = 0; j < 10; j++) {
				while (! buckets[j].isEmpty()) {
					Integer ival = (Integer) ((LinkedList) buckets[j]).getFirst();
					((LinkedList) buckets[j]).removeFirst();
					data[i++] = ival.intValue();
				}
			}
		}

		 arr.printArr(data);
		
		
		
	}

}
