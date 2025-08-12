public class Heap{
  public int insert(value){
    heap.add(value);
    int current=heap.size()-1;

    while(true){
      swap(current, parent(current));
      current=parent(current);
      
    }
  
}
  
