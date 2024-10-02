/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    //recursive approach
//             public static List<Integer> traversal(TreeNode root,List<Integer> list){
//                 if(root == null){
//                     return list;
//                 }
//                 list.add(root.val);
//                 traversal(root.left,list);
//                 traversal(root.right,list);
//                 return list;
//             }
//             public List<Integer> preorderTraversal(TreeNode root) {
//                List<Integer> list = new ArrayList<>();
//                 list = traversal(root,list);

//                 return list;
//             }
    
    //iterative approach
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            root = st.pop();
            list.add(root.val);
            if(root.right!=null){ //1st right bcz stack works as LIFO 
                st.push(root.right); 
            }
            if(root.left!=null){
                st.push(root.left);
            }
            
        }
        return list;
    }
}
