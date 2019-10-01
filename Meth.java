import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Meth extends JComponent implements MouseListener {

	Color[][] board;
	int turn = 0;
	public Meth() {
		// setting all the variables for our game
		board = new Color[10][10]; // y, x;
		addMouseListener(this);


	}

	public void paintComponent(Graphics g) {
	
	
			}
		

	public static void main(String[] args) {

		JFrame frame = new JFrame("Tic-Tac-Toe - Title");
		frame.setVisible(true);
		frame.setSize(1600, 830);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new Meth());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
			// check to see if someone wins, and if they win then make the entire board that color

			
			repaint();
		}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
