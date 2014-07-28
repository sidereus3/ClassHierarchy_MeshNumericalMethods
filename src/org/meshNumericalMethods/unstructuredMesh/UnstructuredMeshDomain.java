package org.meshNumericalMethods.unstructuredMesh;

import java.io.FileNotFoundException;

public interface UnstructuredMeshDomain {

	void getGridProperties() throws FileNotFoundException;
	
	void getPolygonProperties() throws FileNotFoundException;
	
	void getSideProperties() throws FileNotFoundException;
	
}
