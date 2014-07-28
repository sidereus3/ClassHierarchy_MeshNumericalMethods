package org.meshNumericalMethods.unstructuredMesh.adjacencyMatrixBased;

import java.io.FileNotFoundException;

import org.meshNumericalMethods.unstructuredMesh.UnstructuredMeshDomain;

public interface AdjacencyMatrixBased extends UnstructuredMeshDomain {

	public void getAdjacencyMatrix() throws FileNotFoundException;
	
	public void getGridProperties() throws FileNotFoundException;
	
	public void getPolygonProperties() throws FileNotFoundException;
	
	public void getSideProperties() throws FileNotFoundException;
	
}
