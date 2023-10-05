package sort;


public class bsort
{
	public static void main(String[] args)
	{
		int [] num = {1,100,70,4,33,2,78,20,51};
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=0; j<num.length; j++)
			{
				if(num[i]>num[j])
				{
					int max = num[i];
					int min = num[j];
					num[i] = min;
					num[j] = max;
				}
			}
		}
		for(int i=0; i<num.length; i++)
		{
			System.out.print(num[i] +  " ");
		}
	}
}

