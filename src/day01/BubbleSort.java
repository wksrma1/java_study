package day01;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array={10,8,9,5,7,6,4,1,3,2};
		int temp=0;
		for(int i=0; i<array.length;i++){
			for(int j=0; j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		for(int i=0; i<array.length;i++){
			System.out.print(array[i]);
		}
		
	}

}
