
public class StringBTNode {
  private String value;
  private StringBTNode left;
  private StringBTNode right; 
  
  StringBTNode(String inValue){
    value = inValue;
  }
  
  public String toString() {
    return value;
  }
  
  public StringBTNode search(String inValue) {
    if(inValue.equals(value)) return this;
    if(left != null) {
      StringBTNode leftResult = left.search(inValue);
      if(leftResult != null) return leftResult;
    }
    if(right != null) {
      // since we know its not on the left, 
      // we don't need to verify this is not null
      return right.search(inValue);
    }
    return null;
  }
  
  public int depth(String inValue) {
    if(inValue.equals(value)) return 0;
    if(left != null) {
      int leftResult = left.depth(inValue);
      if(leftResult != -1) return leftResult+1;
    }
    if(right != null) {
      // since we need to modify the result if it is found
      // we *do* need to capture it unlike in search
      int righResult = right.depth(inValue);
      if(righResult != -1) return righResult+1;
    }
    return -1;
  }
  
  public int height() {
    int leftHeight = -1;
    int rightHeight = -1;
    if(left!=null) leftHeight = left.height();
    if(right!=null) rightHeight = right.height();
    
    // note that if both left and right are null, 
    // both of these values will be -1 still, so we need to return
    // otherwise one will be non-negative so we add one extra link on the count of the path to the root. 
    if(leftHeight>rightHeight) return leftHeight+1;
    return rightHeight+1;
  }
  
  public int numNodes() {
    int rtn = 1;
    if(left != null) rtn += left.numNodes();
    if(right != null) rtn += right.numNodes();
    return rtn;
  }
  
  public void insert(String inVal) {
    // first check to see if its already in the tree, 
    // if so do nothing.
    if(search(inVal) != null) return;
    
    // if left is null it goes there
    if(left==null) {
      left = new StringBTNode(inVal);
      return;
    }
    // otherwise if right is null, it goes there
    if(right==null) {
      right = new StringBTNode(inVal);
      return;
    }
    //if both exist, then make a recursive call on the smaller one (favoring left if they are equal)
    if(left.numNodes() <= right.numNodes()) {
      left.insert(inVal);
      return;
    }
    // right is smaller, so this is the default case. 
    right.insert(inVal);
  }
  
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + toString());
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    else if(right != null) System.out.println(prefix + "\u251C " + "\u2400");
    if(right != null) right.print(prefix + "\u2514 ");
    else if(left != null) System.out.println(prefix + "\u2514 " + "\u2400");
  }
}
