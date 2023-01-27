public class main {

    public static void main(String[] args) {
        Tree IntTree = new Tree();
	    IntTree.insert(25);
	    IntTree.insert(20);
	    IntTree.insert(15);
	    IntTree.insert(27);
	    IntTree.insert(30);
        IntTree.insert(29);
        IntTree.insert(26);
        IntTree.insert(22);
        IntTree.insert(32);

        //IntTree.traverseInOrder();

        System.out.println(IntTree.get(27));
        System.out.println(IntTree.get(30));
        System.out.println(IntTree.get(99));
        System.out.println(IntTree.max());
        System.out.println(IntTree.min());

    }
    
}
