public class Graph{
  private HashMap<String, ArrayList<String> adjList=new HashMap<>();
  public boolean addVertex(String vertex){
      if(adjList.get(vertex)== null){
        adjList.put(vertex,new ArrayList<String>());
        return true;
      }
    return false;
    
}

//Output
//{A=[]}
