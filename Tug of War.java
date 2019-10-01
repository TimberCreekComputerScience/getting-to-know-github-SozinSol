import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Meth extends JFrame implements KeyListener {

	private mainDraw draw;
	
	public static void main(String[] args) {

		new Meth().setVisible(true);
	}

	private Meth() {

		super("Tug Of War");
		setSize(600, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("keyPressed");

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			((mainDraw) draw).moveRight();
		else if (e.getKeyCode() == KeyEvent.VK_LEFT)
			draw.moveLeft();
		else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			draw.moveDown();
		else if (e.getKeyCode() == KeyEvent.VK_UP)
			draw.moveUp();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped");

	}

}
