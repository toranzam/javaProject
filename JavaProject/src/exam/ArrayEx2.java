package exam;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) + 1;
		}

		System.out.println("이번주의 로또 번호 : ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
