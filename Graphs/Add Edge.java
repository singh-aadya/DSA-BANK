public boolean addEdge(String vertex1,String vertex2){
  if(adjList.get(vertex1)!=null && adjList.get(vertex2)!=null){
    adj.List.get(vertex1).add(vertex2);
    adj.List.get(vertex2).add(vertex1);
    return true;
  } 
  return false;
}

//Output
//{A=[B],B=[A]}
