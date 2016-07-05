
public class BuacketSort {

	public static void main(String[] args) {
		ArrayData arr = new ArrayData();
		int data[]=arr.data;
		arr.printArr(data);
		int maxVal = 0;
		for (int i=0; i<data.length; i++){
            	if(data[i]>maxVal){
            		maxVal=data[i];
            	}
        }
		int [] bucket=new int[maxVal+1];
        for (int i=0; i<bucket.length; i++){
            bucket[i]=0;
        }
        for (int i=0; i<data.length; i++){
            bucket[data[i]]++;
        }
        int outPos=0;
        for (int i=0; i<bucket.length; i++){
            for (int j=0; j<bucket[i]; j++){
                data[outPos++]=i;
            }
        }
        arr.printArr(data);
	}

}
