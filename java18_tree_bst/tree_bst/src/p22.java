import javax.print.attribute.standard.PrinterResolution;
import java.util.LinkedList;
import java.util.Queue;
//958. Check Completeness of a Binary Tree

class object{
    int lvl;
    TreeNode node;
    public object(TreeNode node,int lvl){
        this.node = node;
        this.lvl = lvl;
    }
}
public class p22 {
    static class solution{
        boolean bfs(Queue<object> q, TreeNode root){
            q.add(new object(root,0));
            int lock_lvl ;
            boolean active = false;

            while(q.size()>0){
                TreeNode f = q.peek().node;
                if(f.left!= null){
                    if(active == true)  return false;
                    q.add(new object(f.left,q.peek().lvl+1));
                }else{
                    lock_lvl = q.peek().lvl+1;
                    active= true;
                    if(f.right!= null) return false;
                }
                if(f.right!= null){
                    if(active == true)  return false;
                    q.add(new object(f.right,q.peek().lvl+1));
                }else{
                    lock_lvl = q.peek().lvl+1;
                    active= true;
                }
                q.remove();
            }
            return true;
        }

    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);

        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);

        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);

        a.right = c; a.left = b;
        b.right = e; b.left = d;
        c.right = g; //c.left = f;


        //         1
        //       /   \
        //      2     3
        //    /  \   /  \
        //   4    5 6    7
        solution kp = new solution();
        Queue<object> q = new LinkedList<>();
        System.out.println(kp.bfs(q, a));
    }
}


///////////////////////////////////////////////////////////////////////////////
//958. Check Completeness of a Binary Tree
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given the root of a binary tree, determine if it is a complete binary tree.
//
//In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
//
//
//
//Example 1:
//
//
//Input: root = [1,2,3,4,5,6]
//Output: true
//Explanation: Every level before the last is full (ie. levels with node-values {1} and {2, 3}), and all nodes in the last level ({4, 5, 6}) are as far left as possible.
//Example 2:
//
//
//Input: root = [1,2,3,4,5,null,7]
//Output: false
//Explanation: The node with value 7 isn't as far left as possible.
//
//
//Constraints:
//
//The number of nodes in the tree is in the range [1, 100].
//        1 <= Node.val <= 1000