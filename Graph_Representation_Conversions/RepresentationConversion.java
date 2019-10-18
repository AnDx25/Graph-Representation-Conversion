import java.util.*;
import java.io.*;
import java.lang.*; 
public class RepresentationConversion
{
	public static void main(String args[]) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		System.out.println("Enter 1 to convert Adjacency Matrix to Adjacency List\n");
		System.out.println("Enter 2 to convert Adjacency List to Adjacency Matrix\n");
		System.out.println("Enter 3 to convert Incidence Matrix to Adjacency Matrix\n");
		System.out.println("Enter 4 to convert Incidence Matrix to Adjacency List\n");
		System.out.println("Enter 5 to convert Adjacency Matrix to Incidence Matrix\n");
		System.out.println("Enter 6 to convert Adjacency List to Incidence Matrix\n");
		System.out.println("Enter 10 to exit");
		while(choice!=10)
		{
			System.out.println("Enter your choice\n");
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					

					Graph2 g2=new Graph2();
					System.out.println("Enter number of vertices\n");
					int n=sc.nextInt();
					sc.nextLine();
					int adjMat[][]=new int[n][n];
					Graph2.Graph graph=new Graph2.Graph(n);
					System.out.println("Enter your Adjacency Matrix\n");
					for(int i=0;i<n;i++)
					{
						String s=sc.nextLine();
						String []s1=s.split(" ");
						for(int j=0;j<s1.length;j++)
						{
							adjMat[i][j]=Integer.parseInt(s1[j]);
						}
					}
					for(int i=0;i<n;i++)
					{
						for(int j=0;j<n;j++)
						{
							if(adjMat[i][j]==1)
							{
								g2.addEdge(graph,i,j);
							}
						}
					}
					
					g2.printGraph(graph);
					break;
				case 2:
					
					System.out.println("Enter number of vertices");
					int p=sc.nextInt();
					Graph1 graph1=new Graph1(p);
					sc.nextLine();
					for(int i=0;i<p;i++)
					{
						System.out.println("Enter linked list of vertex "+i);
						String c1=sc.nextLine();
						String c2[]=c1.split("->");
						for(int j=0;j<c2.length;j++)
						{
							graph1.addEdge(i,Integer.parseInt(c2[j]));
							//System.out.println(c2[j]);
							
						}
					}
					System.out.println(graph1.print());
					break;
				case 3:
					int k=0;
					System.out.println("Enter number of vertices\n");
					int v=sc.nextInt();
					int load[]=new int[v];
					//Graph2.Graph graph2=new Graph2.Graph(v);
					Graph1 graph3=new Graph1(v);
					System.out.println("Enter number of edges\n");
					int e=sc.nextInt();
					System.out.println("Enter the incidence matrix\n");
					int mat[][]=new int[v][e];
					int count=0;
					sc.nextLine();
					for(int i=0;i<v;i++)
					{
						String scan=sc.nextLine();
						String []scan1=scan.split(" ");
						for(int j=0;j<scan1.length;j++)
						{
							mat[i][j]=Integer.parseInt(scan1[j]);
						}
					}
					for(int j=0;j<e;j++)
					{
						for(int i=0;i<v;i++)
						{
							if(mat[i][j]==1)
							{
								load[count]=i;
								count++;	
							}
							
							
							
						}
						for(int i=1;i<count;i++)
						{
							graph3.addEdge(load[0],load[i]);
						}
						for(int i=0;i<count;i++)
						{
							load[count]=0;
						}
						count=0;
					}
					System.out.println("Adjacency Matrix is=");
					System.out.println(graph3.print());
					break;
				case 4:
					Graph3 g4=new Graph3();
					System.out.println("Enter number of vertices\n");
					int v1=sc.nextInt();
					int load1[]=new int[v1];
					Graph3.Graph graph4=new Graph3.Graph(v1);
					System.out.println("Enter number of edges\n");
					int e1=sc.nextInt();
					System.out.println("Enter the incidence matrix\n");
					int mat1[][]=new int[v1][e1];
					int count1=0;
					sc.nextLine();
					for(int i=0;i<v1;i++)
					{
						String scan1=sc.nextLine();
						String []scan2=scan1.split(" ");
						for(int j=0;j<scan2.length;j++)
						{
							mat1[i][j]=Integer.parseInt(scan2[j]);
						}
					}
					for(int j=0;j<e1;j++)
					{
						for(int i=0;i<v1;i++)
						{
							if(mat1[i][j]==1)
							{
								load1[count1]=i;
								count1++;	
							}
							
							
							
						}
						for(int i=1;i<count1;i++)
						{
							g4.addEdge(graph4,load1[0],load1[i]);
							//graph3.addEdge(load[0],load[i]);
						}
						for(int i=0;i<count1;i++)
						{
							load1[count1]=0;
						}
						count1=0;
					}
					g4.printGraph(graph4);
					break;
				case 5:
					int count5=0;
					System.out.println("Enter the number of vertices\n");
					int v5=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the number of edges\n");
					int e5=sc.nextInt();
					Represent_Graph_Incidence_Matrix graph5=new Represent_Graph_Incidence_Matrix(v5,e5);
					System.out.println("Enter the number of adjacency matrix\n");
					int [][]adjMat5=new int[v5][v5];
					sc.nextLine();
					for(int i=0;i<v5;i++)
					{
						String s5=sc.nextLine();
						String s5_1[]=s5.split(" ");
						for(int j=0;j<s5_1.length;j++)
						{
							adjMat5[i][j]=Integer.parseInt(s5_1[j]);
						}
					}
					for(int j=0;j<v5;j++)
					{
						for(int i=j;i<v5;i++)
						{
							if(adjMat5[i][j]==1)
							{
								count5++;
								graph5.makeEdge(i, j, 1, count5);
							}
						}
					}
					System.out.println("The incidence matrix for the given graph is: ");

            				System.out.print("  ");

            				for (int i = 1; i <= e5; i++)

                				System.out.print(i + " ");

            				System.out.println();

 

            				for (int i = 1; i <= v5; i++) 

            				{

                				System.out.print(i + " ");

                				for (int j = 1; j <= e5; j++) 

                    					System.out.print(graph5.getEdge(i, j) + " ");

                				System.out.println();

            				}
				break;
				
				case 6:
					int count6=0;
					System.out.println("Enter number of vertices");
					int v6=sc.nextInt();
					int [][]adjMat6=new int[v6][v6];
					Graph1 graph6=new Graph1(v6);
					System.out.println("Enter number of edges");
					int e6 =sc.nextInt();
					Represent_Graph_Incidence_Matrix graph7=new Represent_Graph_Incidence_Matrix(v6,e6);
					sc.nextLine();
					for(int i=0;i<v6;i++)
					{
						System.out.println("Enter linked list of vertex "+i);
						String c1=sc.nextLine();
						String c2[]=c1.split("->");
						for(int j=0;j<c2.length;j++)
						{
							graph6.addEdge(i,Integer.parseInt(c2[j]));
							//System.out.println(c2[j]);
							
						}
					}
					//System.out.println(graph1.print());
					String s6=graph6.print();
					//System.out.println(s6.trim());
					String s6_1[]=s6.trim().split(" ");
					System.out.println(s6_1.length);
					for(int i=0;i<v6;i++)
					{
						for(int j=0;j<v6;j++)
						{
							adjMat6[i][j]=Integer.parseInt(s6_1[j]);
						}
						//System.out.println(s6_1[i]);
					}
					for(int i=0;i<v6;i++)
					{
						for(int j=0;j<v6;j++)
						{
							System.out.println(adjMat6[i][j]);
						}
					}
					
					for(int j=0;j<v6;j++)
					{
						for(int i=j;i<v6;i++)
						{
							if(adjMat6[i][j]==1)
							{
								count6++;
								graph7.makeEdge(i, j, 1, count6);
							}
						}
					}
					System.out.println("The incidence matrix for the given graph is: ");

            				System.out.print("  ");

            				for (int i = 1; i <= e6; i++)

                				System.out.print(i + " ");

            				System.out.println();

 

            				for (int i = 1; i <= v6; i++) 

            				{

                				System.out.print(i + " ");

                				for (int j = 1; j <= e6; j++) 

                    					System.out.print(graph7.getEdge(i, j) + " ");

                				System.out.println();

            				}
					break;
					case 10:
						System.exit(1);
			}
		}
	}
}
