package sunnyLeetCode.demo.tree;
import java.util.ArrayList;
import java.util.List;

public class FindModeInBinarySearchTree501 {
    TreeNode privNode;
    int count = 0;
    int maxCount = 0;
    List<Integer> modeList = new ArrayList();
    public int[] findMode(TreeNode root) {
        findModeHelper(root);
        return listToArray();
    }

    public int[] listToArray() {
        int[] modesArray = new int[modeList.size()];
        for(int i=0; i<modeList.size(); i++){
            modesArray[i] = modeList.get(i);
        }
        return modesArray;
    }

    public void findModeHelper(TreeNode node) {
        if (node == null) return;
        findModeHelper(node.left);
        //System.out.print(node.val);

        if (privNode == null){
            privNode = node;
            count = 1;
        } else if (node.val > privNode.val){
            privNode = node;
            count = 1;

        } else if (node.val == privNode.val){
            count++;
        }

        if (count == maxCount){
            modeList.add(node.val);
        } else if(count > maxCount){
            maxCount = count;
            modeList.clear();
            modeList.add(node.val);
        }
        findModeHelper(node.right);
    }
}
