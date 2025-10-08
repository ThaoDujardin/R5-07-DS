public class Q4
{
	public static void main(String[] args)
	{
		if (args.length < 1)
		{
			return;
		}

		int n = Integer.parseInt(args[0]);
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++)
		{
			sb.setLength(0);
			for (int j = 0; j < i; j++)
			{
				sb.append( j + 1 );
				sb.append(' ');
			}
			System.out.println(sb.toString());
		}
	}
}
