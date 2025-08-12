public boolean removeEdge(String vertex1,String vertex2){
  if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
    
    adjList.get(vertex1).remove(vertex2);
    adjList.get(vertex1).remove(vertex2);
    return true;
  }
  return false;
}

