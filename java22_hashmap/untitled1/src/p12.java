public class p12 {
    // => Amount of Time for Binary Tree to Be Infected

    class lade{
        int max;
        int rtp;
        lade(){}
        lade(int max,int rtp){
            this.max = max;
            this.rtp = rtp;
        }
    }

    class Solution {
        lade op;
        TreeNode found;
        int ans(TreeNode root, int start,int num){
            if(root == null) return 0;
            if(root.val == start){
                found = root;
                op = new lade(Math.max(ans(root.right, start,1),ans(root.left, start,1)),0);
                return -1;
            }
            if(root.left == null && root.right == null) return num;
            int lft = ans(root.left, start,num+1);
            int rhs = ans(root.right, start,num+1);
            if(lft == -1 || rhs == -1){
                op.rtp++;
                if(lft == -1){
                    if(op.max <((rhs-num)+op.rtp)){
                        op.max = (rhs-num)+op.rtp;
                    }

                }else{
                    if(op.max <((lft-num)+op.rtp)){
                        op.max = (lft-num)+op.rtp;
                    }
                }
                return -1;
            }else{
                return  Math.max(lft , rhs);
            }

        }
        public int amountOfTime(TreeNode root, int start) {
            ans(root, start,0);
            return op.max;
        }
    }
}
