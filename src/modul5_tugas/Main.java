/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5_tugas;

/**
 *
 * @author ASUS
 */
public class Main {

     public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.print("\npre order: ");
        pohon.preOrder(pohon.root);
        System.out.print("\nin order: ");
        pohon.inOrder(pohon.root);
        System.out.print("\npost order: ");
        pohon.postOrder(pohon.root);

    }

}
