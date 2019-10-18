public class Graph1
{
	boolean adjMat[][];
	int n;
	public Graph1(int n)
	{
		this.n=n;
		adjMat=new boolean[n][n]; 
	}
	public void addEdge(int i,int j)
	{
		adjMat[i][j]=true;
		adjMat[j][i]=true;
	}
	public  String print()
	{
		String s=new String();
		for(int i=0;i<n;i++)
		{
			//s=s+i+":";
			for(int j=0;j<adjMat[i].length;j++)
			{
				s=s+((adjMat[i][j]?1:0)+" ");
			}
			s=s+"\n";
		}
		return s;
	}
	public static void main(String args[])
	{
		Graph1 g=new Graph1(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		System.out.println(g.print());
	}
}
