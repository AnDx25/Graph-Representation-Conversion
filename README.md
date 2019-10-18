# Graph-Representation-Conversion
Contains the implementation of interconversion between graph representation 
I have implemented this for undirected graphs

To run : javac RepresentationConversion.java
         java RepresentationConversion

Give Adjacency Matrix in the format as:	1 0 0 1
					                              0 1 0 1
					                              0 0 1 0

Give Adjacency List in the format as:  Linked list of vertex 0
						                            1->2->3
				                             	Linked List of vertex 1
						                            0->2->4


TestCases:

1.) Adjacency List :  Adjacency list of vertex 0
 			                head -> 1-> 4
                     Adjacency list of vertex 1
 			                head -> 0-> 2-> 3-> 4
                     Adjacency list of vertex 2
 			                head -> 1-> 3
                     Adjacency list of vertex 3
			                head -> 1-> 2-> 4
                     Adjacency list of vertex 4
 			                head -> 0-> 1-> 3

2.) Adjacency Matrix : 
i.)	0 1 1 1
  	1 0 1 1
	  1 1 0 1
	  1 1 1 0  

ii.) 	0 1 0 0 1
	    1 0 1 1 1
	    0 1 0 1 0
	    0 1 1 0 1
	    1 1 0 1 0

3.) Incidence Matrix
	1 1 1 0 0 0
	1 0 0 1 1 0
	0 1 0 1 0 1
  0 0 1 0 1 1             
