JAVAC=/usr/bin/javac

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

classes: BinaryTreeNode.class BinaryTree.class \
         BinarySearchTree.class \
		 Main.class

default: $(CLASSES)

clean:
	rm *.class
