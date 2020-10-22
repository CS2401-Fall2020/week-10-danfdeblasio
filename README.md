# Week 10
In this week's lab we will be working with a binary tree of integers (note, this will not neccesarily be a binary search tree). 
The goal is to become familiar with maniulation of this type of data structure.

## Tasks
Your goal will be to both build and search a binary tree of strings. 
Your `StringBTNode` class will have the following components: 
* private variables with the points to the left and right children, and a String value
* a constructor that takes a String as input
* `toString()` which returns the string stored in this node
* `print()` which will print the subtree rooted at a partiular node, this will be given in the template. 
* `search(String)` will search a subtree for a node with the label the same as the input, the return type is `StringBTNode`. This method returns `null` if the string is not in the subtree. This will be recursive.
* `depth(String)` will search a subtree for a node with the label the same as the input, the return its depth. This method returns -1 if the string is not in the subtree. This will be recursive.
* `height()` returns the height of a subtree as an integer
* `numNodes()` returns an integer which is the number of nodes in a subtree (including the given node). In the example below, each of the nodes has next to it in red the return value of `numNodes()` when called on that node. 
![numNodes Example](images/numNodesExample.png)
* `insert(String)` will insert the given string into the tree at the bottom somewhere, but only if the string is not already present in the tree. The location will be chosen to keep the tree as balanced as possible. If one side of a subtree has fewer nodes, the new node will be created on that side, if the tree has the same number of nodes on both sides, the node will go on the left. An example of this is shown below, where we start with a tree of 3 nodes and add 4 more. 
![Adding 4 nodes](images/Adding4Nodes.png)
