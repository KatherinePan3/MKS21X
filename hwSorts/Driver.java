import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
	Sorts p1 = new Sorts();
	int[] num={1,3,5,4,3,6,6,99};
	System.out.println(Arrays.toString(num));
	p1.SelectionSort(num);
	System.out.println(Arrays.toString(num));
	p1.InsertionSort(num);
	System.out.println(Arrays.toString(num));
	p1.BubbleSort(num);
	System.out.println(Arrays.toString(num));
    }
}
