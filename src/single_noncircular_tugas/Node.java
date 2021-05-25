
package single_noncircular_tugas;

public class Node {
    protected int data ;
    protected Node link;
    
    /*constructor */
    public Node()
    {
    link = null;
    data = 0;
    }
    
    /*constructur */
    public Node(int d, Node n)
    {
    data = d;
    link = n;
    }
    
    /*function to set link to next Node */
    public void setLink(Node n)
    {
    link = n;
    }
    
     /*function to set data to current Node */
    public void setData(int d)
    {
    data = d;
    }
     /*function to get link to next Node */
    public Node getLink()
    {
    return link;
    }
    
    /*function to set data to current Node */
    public int getData()
    {
    return data;
    }
}
