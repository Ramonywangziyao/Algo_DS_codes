public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public TreeNode helper(int[] inorder, int[] postorder, int instart, int inend, int poststart, int postend) {
        if(instart > inend) return null;
        TreeNode node = new TreeNode(postorder[postend]);
        int inIndex = 0;
        for(int i = instart; i <= inend; i++) {
            if(inorder[i] == postorder[postend]) {
                inIndex = i;
                break;
            }
        }
        node.left = helper(inorder, postorder, instart, inIndex - 1, poststart, poststart + inIndex - instart - 1);
        node.right = helper(inorder, postorder, inIndex + 1, inend, poststart + inIndex - instart, postend - 1);
        return node;
    }
