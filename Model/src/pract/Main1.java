package pract;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.*;

public class Main1 {
    public static void main(String[] args) {
    	JFrame frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(400,400);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode Branch1 = new DefaultMutableTreeNode("Branch1");
        DefaultMutableTreeNode Branch2 = new DefaultMutableTreeNode("Branch2");
        Branch1.add(new DefaultMutableTreeNode("Leaf 1.1"));
        Branch1.add(new DefaultMutableTreeNode("Leaf 1.2"));
        Branch2.add(new DefaultMutableTreeNode("Leaf 2.1"));
        Branch2.add(new DefaultMutableTreeNode("Leaf 2.2"));
        root.add(Branch2);
        root.add(Branch1);
        JTree  Tree = new JTree();
        JScrollPane panel = new JScrollPane(Tree);
        frame.add(panel,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
