package sort;


public class ssort2
{
	public static void main(String[] args)
	{
		int[] data = {1,100,70,4,33,2,78,20,51};
		sort(data);
		for(int element : data)
		{
			System.out.print(element + " ");
		}
	}
	public static void sort(int[] data)
	{
		for(int i = 0; i < data.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < data.length; j++)
			{
				if(data[j] < data[min])
				{
					min = j;
				}
			}
			int temp = data[i];
			data[i] = data[min];
			data[min] = temp;
		}
	}
}