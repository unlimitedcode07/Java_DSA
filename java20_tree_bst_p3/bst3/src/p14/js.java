package p14;
// last solution lession
public class js {
    //note
//    One more thing:
//
//    This check is unnecessary:
//
//    int lft = Integer.MIN_VALUE;
//    int rit = Integer.MAX_VALUE;
//
//if(root.left != null){
//        lft = root.left.val;
//    }
//if(root.right != null){
//        rit = root.right.val;
//    }
//
//if(root.val <= lft || root.val >= rit ||
//    root.val >= rst.min || root.val <= lst.max)
//
//    For BST validation, these two are enough:
//
//    root.val > lst.max &&
//    root.val < rst.min
//
//    because:
//
//    lst.max already represents the maximum value in the entire left subtree.
//    rst.min already represents the minimum value in the entire right subtree.
//
//    Checking only root.left.val and root.right.val doesn't guarantee deeper nodes satisfy BST rules.
//
//    So the core BST condition can simply be:
//
//            if(root.val <= lst.max || root.val >= rst.min)
//
//    which is the standard optimized solution
}
