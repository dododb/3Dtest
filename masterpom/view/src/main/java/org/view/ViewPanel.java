package org.view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import org.contract.IWorld;

public class ViewPanel extends JPanel implements Observer{

	/**
	 *
	 */
	private static final long serialVersionUID = -9151828064603014155L;

	private final IWorld world;
	private final ViewFrame viewFrame;

	public ViewPanel(ViewFrame viewframe, IWorld world)
	{
		this.viewFrame = this.viewFrame;
		this.world = world;
		world.getObservable().addObserver(this);
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub

	}

}
