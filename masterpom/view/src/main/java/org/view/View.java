package org.view;

import javax.swing.SwingUtilities;

import org.contract.IWorld;

public class View implements Runnable{

	private final ViewFrame viewFrame;
	public View(final IWorld world)
	{
		this.viewFrame = new ViewFrame(world);
		SwingUtilities.invokeLater(this);
	}
	public void run() {
		this.viewFrame.setVisible(true);
	}

}
