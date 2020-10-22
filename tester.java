
public class tester {

  public static void main(String[] args) {
    StringBTNode root1 = new StringBTNode("1");
    assert(root1.depth("1")==0);
    assert(root1.search("1")!=null);
    assert(root1.height()==0);
    assert(root1.depth("0")==-1);
    assert(root1.search("0")==null);
    //root1.print();
    for(int i=1;i<16;i++) {
      if(i!=1) {
        assert(root1.depth(String.valueOf(i))==-1);
        assert(root1.search(String.valueOf(i))==null);
      }
      root1.insert(String.valueOf(i));
      //assert(root1.depth(String.valueOf(i))==0);
      assert(root1.search(String.valueOf(i))!=null);
      assert(root1.height()==root1.depth(String.valueOf(i)));
      //root1.print();
    }
    
    StringBTNode root2 = new StringBTNode("a");
    assert(root2.depth("a")==0);
    assert(root2.search("a")!=null);
    assert(root2.height()==0);
    assert(root2.depth("A")==-1);
    assert(root2.search("A")==null);
    for(char i='a';i<'o';i++) {
      if(i!='a') {
        assert(root2.depth(String.valueOf(i))==-1);
        assert(root2.search(String.valueOf(i))==null);
      }
      root2.insert(String.valueOf(i));
      assert(root2.search(String.valueOf(i))!=null);
      assert(root2.height()==root2.depth(String.valueOf(i)));
    }
    System.out.println("All Assertion Tests Passed");

  }

}
