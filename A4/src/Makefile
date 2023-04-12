JAVAC=/usr/bin/javac

.SUFFIXES: .java .class

.java.class:
	$(JAVAC) $<

classes: BinaryTreeNode.class BinaryTree.class \
         BinarySearchTree.class \
		 Main.class User.class \
		 Post.class SMNAIM002TikTokGUI.class

default: $(CLASSES)

clean:
	rm *.class
