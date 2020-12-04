public class Offer26 {
    public boolean isSubStructure(TreeNode A, TreeNode B) {

        // 如果A或B都走完了还没找到，那应该就是找不到了
        if(A == null || B == null) return false;

        //看看当前节点成不？不成就看看左边，不然看看右边？
        return s(A,B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }


    boolean s(TreeNode a, TreeNode b){
        // b这边都看完了，还没挑出不同？那就是了吧！
        if(b == null) return true;
            // b这边还没看完了，a那边就null了？
        else if(a == null) return false;

        return a.val == b.val && s(a.left, b.left) && s(a.right, b.right);
    }
}
