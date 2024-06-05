import java.util.Scanner;

public class AVLTreeTestInteraktif {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Node");
            System.out.println("2. Hapus Node");
            System.out.println("3. Tampilkan Pohon AVL");
            System.out.println("4. Preorder Traversal");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi (1-5): ");
            
            int choice = scanner.nextInt();
            int element;

            switch (choice) {
                case 1: // Menambah node
                    System.out.print("Masukkan nilai node yang ingin ditambahkan: ");
                    element = scanner.nextInt();
                    tree.root = tree.insertNode(tree.root, element);
                    System.out.println("Node " + element + " telah ditambahkan.");
                    break;
                case 2: // Menghapus node
                    if (tree.root == null) {
                        System.out.println("Pohon kosong, tidak ada yang bisa dihapus.");
                    } else {
                        System.out.print("Masukkan nilai node yang ingin dihapus: ");
                        element = scanner.nextInt();
                        tree.root = tree.deleteNode(tree.root, element);
                        System.out.println("Node " + element + " telah dihapus.");
                    }
                    break;
                case 3: // Menampilkan pohon AVL
                    if (tree.root != null) {
                        System.out.println("Struktur Pohon AVL:");
                        tree.printTree(tree.root, "", true);
                    } else {
                        System.out.println("Pohon kosong.");
                    }
                    break;
                case 4: // Preorder traversal
                    if (tree.root != null) {
                        System.out.println("Traversal Preorder:");
                        tree.preOrder(tree.root);
                        System.out.println();
                    } else {
                        System.out.println("Pohon kosong.");
                    }
                    break;
                case 5: // Keluar
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opsi tidak valid! Silakan masukkan angka antara 1 dan 5.");
            }
        }
    }
}
