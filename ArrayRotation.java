
public class ArrayRotation {

	
	static int[] Rotate(int a[], int d, int n) 
    {
        for (int i = 0; i < d; i++)
           RotatebyOne(a, n);
		return a;
    }
 
    static void RotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
}
