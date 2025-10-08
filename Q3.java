public class Q3
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			return;
		}

		int n = Integer.parseInt(args[0]);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++)
		{
			sb.append( i );
		}
		System.out.println(sb.toString());
	}
}
