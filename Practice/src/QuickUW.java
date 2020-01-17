
public class QuickUW 
{
	public static void main(String[] args)
	{
		int N = Integer.parseInt(args[0]);
		int id[] = new int[N], sz[] = new int[N];
		for (int i = 0; i < N; i++)
		{
			id[i] = i; sz[i] = 1; 
		}
		
		for (In.init(); !In.empty();)
		{
			int i, j, p = In.getInt(), q = In.getInt();
			for (i = p; i != id[i]; i = id[i]);
			for (j = q; j != id[j]; j = id[j]);
			if (i == j) {continue;}
			else if (sz[i] < sz)) [j])
			{
				id[i] = j; sz[j] += sz[i];
			}
			else
			{
				id[j] =i; sz[i] += sz[j];
			}
			System.out.println(" " + p + " " + q);
		}
	}
	
}
