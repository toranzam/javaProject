package exam;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		int num;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		
		for(int i=0; i<arr.length; i++) {
			num = arr[i];
			System.out.print(num);
			arr2[num] += 1;
		}
		
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d의 개수 :%d \n", i, arr2[i]);
		}
		

	}

}
