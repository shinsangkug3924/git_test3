package git_test3;

public class Sort {
	public static void sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			 int value = a[i];
			 int j;
			 for(j = i-1; j>=0; --j) {
				 if(a[j] > value) {
					 a[j+1] = a[j];
				 }else {
					 break;
				 }
			 }//안쪽 for
			 a[j + 1] = value;
		}//바깥쪽 for
	}//sort메소드 
}//Sort클래스 
