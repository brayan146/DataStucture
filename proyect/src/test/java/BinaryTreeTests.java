import org.example.trees.BinaryTree;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class BinaryTreeTests {
    @Test
    public void testBinaryTree() {
     org.example.trees.BinaryTree tree = new org.example.trees.BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assert.assertEquals(7, tree.size());

    }
    @Test
    public void testBinaryTreeSearch() {
        org.example.trees.BinaryTree tree = new org.example.trees.BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assert.assertTrue(tree.search(5));
        Assert.assertTrue(tree.search(3));
        Assert.assertTrue(tree.search(7));
        Assert.assertTrue(tree.search(2));
        Assert.assertTrue(tree.search(4));
        Assert.assertTrue(tree.search(6));
        Assert.assertTrue(tree.search(8));
        Assert.assertFalse(tree.search(9));
    }

    @Test
    public void testBinaryTreeHeight() {
        org.example.trees.BinaryTree tree = new org.example.trees.BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        Assert.assertEquals(3, tree.height());
    }
    @Test
    public void testBinaryTreeInOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {2, 3, 4, 5, 6, 7, 8};
        Assert.assertEquals(expected, tree.inOrder());
    }
    @Test
    public void testBinaryTreePreOrder() {
        org.example.trees.BinaryTree tree = new org.example.trees.BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {5, 3, 2, 4, 7, 6, 8};
        Assert.assertEquals(expected, tree.preOrder());
    }
    @Test
    public void testBinaryTreePostOrder() {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);
        int[] expected = {2, 4, 3, 6, 8, 7, 5};
        Assert.assertEquals(expected, tree.postOrder());
    }


}
