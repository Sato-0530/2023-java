package sort;


public class ssort
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
		for(int i = 1; i < data.length; i++)
		{
			int tmp = data[i];
			int j = i;
			while(j > 0 && tmp < data[j - 1])
			{
				data[j] = data[j - 1];
				j--;
			}
			data[j] = tmp;
		}
	}
}