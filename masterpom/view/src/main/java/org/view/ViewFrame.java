package org.view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import org.contract.IController;
import org.contract.IWorld;

public class ViewFrame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 752538956810498218L;
	/**
	 *
	 */
	private IWorld world;

	private IController controller;

	public ViewFrame(final IWorld world) throws HeadlessException{
		this.buildViewFrame(world);
	}

	public void buildViewFrame(IWorld world)
	{
		this.world = world;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new ViewPanel(this, this.world));
		this.setSize(100,100);
		this.setVisible(true);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
