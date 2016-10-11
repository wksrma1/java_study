package day01;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5,6,7,8,9,10};
		int findNum=4;
		int low=0;
		int high= array.length-1;
		while(high>=low){
			int middle=(low+high)/2;
			if(array[middle]==findNum){
				System.out.println("find");
				break;
			}
			if(array[middle]<findNum){
				low=middle+1;
			}
			if(array[middle]>findNum){
				high=middle-1;
			}
		}
		if(high<low){
			System.out.println("false");
		}
		
	}

}
