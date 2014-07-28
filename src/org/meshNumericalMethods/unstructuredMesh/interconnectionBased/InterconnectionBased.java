package org.meshNumericalMethods.unstructuredMesh.interconnectionBased;

import java.io.FileNotFoundException;

import org.meshNumericalMethods.unstructuredMesh.UnstructuredMeshDomain;

public interface InterconnectionBased extends UnstructuredMeshDomain {

	public void getInterconnections() throws FileNotFoundException;

	public void getGridProperties() throws FileNotFoundException;

	public void getPolygonProperties() throws FileNotFoundException;

	public void getSideProperties() throws FileNotFoundException;

}
