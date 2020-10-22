
public class tester {

  public static void main(String[] args) {
    StringBTNode intTree = new StringBTNode("1");
    assert(intTree.depth("1")==0);
    assert(intTree.search("1")!=null);
    assert(intTree.height()==0);
    assert(intTree.depth("0")==-1);
    assert(intTree.search("0")==null);
    for(int i=1;i<16;i++) {
      if(i!=1) {
        assert(intTree.depth(String.valueOf(i))==-1);
        assert(intTree.search(String.valueOf(i))==null);
      }
      intTree.insert(String.valueOf(i));
      assert(intTree.search(String.valueOf(i))!=null);
      assert(intTree.height()==intTree.depth(String.valueOf(i)));
      assert(intTree.numNodes()==i);
      
    }
    intTree.print();
    
    StringBTNode charTree = new StringBTNode("a");
    assert(charTree.depth("a")==0);
    assert(charTree.search("a")!=null);
    assert(charTree.height()==0);
    assert(charTree.depth("A")==-1);
    assert(charTree.search("A")==null);
    for(char i='a';i<='o';i++) {
      if(i!='a') {
        assert(charTree.depth(String.valueOf(i))==-1);
        assert(charTree.search(String.valueOf(i))==null);
      }
      charTree.insert(String.valueOf(i));
      assert(charTree.search(String.valueOf(i))!=null);
      assert(charTree.height()==charTree.depth(String.valueOf(i)));
      assert(charTree.numNodes()== (i-(int)'a'+1) );
    }
    charTree.print();
    
    StringBTNode fakeBST = new StringBTNode("H");
    fakeBST.insert("D");
    fakeBST.insert("L");
    fakeBST.insert("B");
    fakeBST.insert("J");
    fakeBST.insert("F");
    fakeBST.insert("N");
    fakeBST.insert("A");
    fakeBST.insert("I");
    fakeBST.insert("E");
    fakeBST.insert("M");
    fakeBST.insert("C");
    fakeBST.insert("K");
    fakeBST.insert("G");
    fakeBST.insert("O");
    assert(fakeBST.height()==3);
    assert(fakeBST.depth("A")==3);
    assert(fakeBST.depth("B")==2);
    assert(fakeBST.depth("D")==1);
    fakeBST.print();
    
    System.out.println("All Assertion Tests Passed");

  }

}
