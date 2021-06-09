import java.util.ArrayList;

public class Basics {
	public void printAll(Integer num) {
		for(int i = 0; i < num; i++) 
			System.out.println(i);
	}
	public void printOdd(Integer num) {
		for(int i = 0; i < num; i++) {
			if (i % 2 == 1 ) 
			System.out.println(i);
		}	
	}
	public void sum(Integer num ) {
		Integer total = 0;
		for(Integer i=0; i < num; i++) { 
			System.out.println("New Num:" + i + "Sum:" + (total + i));
			total = i + total;
		}
		System.out.println(total);
	}
	public void itterateArray() { 
		Integer[] arr = {1,2, 3, 4, 5, 5, 7, 8, 9, 10}; 
		for (Integer i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}		
	}

    	public void arrayOdd(Integer num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (Integer i=0; i<num; i++) {
			if (i % 2 == 1) {
				arr.add(i);
			}
		}
			System.out.println(arr);
	}

	public void findMax() {
		Integer[] arr = {100, 2, 4, 1, 1000, 9};
		Integer max = arr[0];
		for(Integer i=0; i<arr.length; i++) {	
			if(arr[i]> max) {
				max = arr[i];
			}
		}
			System.out.println(max);
	}

    
	public void greaterThan() {
		Integer[] arr = {1,3,5,7};
		Integer y = 3;
		Integer total = 0;
		for (Integer i=0; i<arr.length; i++) {
			if(y < arr[i]) {
				total = total + 1;
			}
		}
		System.out.println(total);
	}


	public void average() {
		Integer[] arr = {1,3,5,7};
		Integer temp = 0;
		for(Integer i=0; i<arr.length; i++) {
			temp = temp + arr[i];
		}
		temp = temp / arr.length;
		System.out.println(temp);
	}


	public void square() {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Integer[] arr = {10,12,3,-1};
		for (Integer i=0; i<arr.length; i++) {
			arr2.add(arr[i] * arr[i]);
		}
		System.out.println(arr2);
	}
	public void noNegs() {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Integer[] arr = {1,5,10,-2,-5,8};
		for (Integer i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				arr2.add(arr[i]);
			}else {
				arr2.add(0);
			}
		}
		System.out.println(arr2);
	}
	public void maxMinAvg() {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		Integer[] arr = {100,5,12,-2};
		Integer min = 0;
		Integer max = 0;
		Integer avg = 0;
		for (Integer i=0; i<arr.length; i++) {
			avg = avg + arr[i];
			if(arr[i] < min) {
				min = arr[i];
			}else if(arr[i] > max){
				max = arr[i];
			}
		}
		arr2.add(max);
		arr2.add(min);
		arr2.add(avg/arr.length);
		System.out.println(arr2);
 	}
	public void shiftingVals(){
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		Integer[] arr = {341,6,21,-4};
		for (Integer i = 1; i<arr.length; i++ ) {
			newArr.add(arr[i]);
		}
		newArr.add(0);
		System.out.println(newArr);

	}
}