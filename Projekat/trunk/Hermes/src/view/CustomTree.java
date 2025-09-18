package view;

import javax.swing.JTree;

import parser.XMLTreeModel;
/**
 * Klasa za definisanje stabla aplikacije.
 * @see JTree
 * @author Aleksej Mutić
 * @version 1.0
 */
public class CustomTree extends JTree {

	public CustomTree(XMLTreeModel model) {
		super(model);
	    setRootVisible(false);  // Sakrivanje root-a
        setShowsRootHandles(true);  
        setRowHeight(30); 
        setCellRenderer(new TreeCellRenderer());

	}

	@Override
	public boolean getScrollableTracksViewportWidth() {
		if (getPreferredSize().width < getParent().getWidth()) {
	        return true;  // stretch only if smaller than viewport
	    } else {
	        return false; // allow scrolling if content wider
	    }
	}

}
