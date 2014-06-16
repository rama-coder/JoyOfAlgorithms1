package week1.lectures;

public class UF {

	private int [] id;
	private int ccCount;
	public UF(int N)
	{
		id = new int[N];
		ccCount = N;
		for(int i=0; i<N; i++)
			id[i] = i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UF uf = new UF(10);
	}

	public boolean connected(int x, int y)
	{
		return id[x] == id[y];
	}
	
	public void union(int x, int y)
	{
		if (id[x] == id[y])
			return;
		
		int xId = id[x];
		ccCount--;
		for(int i=0; i < id.length; i++)
		{
			if (id[i] == xId)
				id[i] = id[y];
		}
	}
}
