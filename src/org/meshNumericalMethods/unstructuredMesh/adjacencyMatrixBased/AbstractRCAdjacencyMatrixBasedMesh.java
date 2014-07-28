package org.meshNumericalMethods.unstructuredMesh.adjacencyMatrixBased;

public abstract class AbstractRCAdjacencyMatrixBasedMesh implements AdjacencyMatrixBased{

	public int[] Mp;
	public int[] Mi;
	public double[] Ml;
	
	public double[] lengthSides;
	public double[] euclideanDistance;
	public double[] planArea;
	
	
	public abstract void getAdjacencyMatrix();
	
	public abstract void getGridProperties();
	
	public abstract void getPolygonProperties();
	
	public abstract void getSideProperties();
	
}
