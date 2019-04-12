package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenuPanel extends JPanel {

	JLabel title;

	private String options[] = { "START", "HELP", "EXIT" };

	private int[] currfontloc = { 0, 1, 2 };
	private int currChoice = 0;

	KeyListener keyListener = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_UP:
				for (int i : currfontloc) {
					i += 1;
					i %= 3;
				}
				currChoice--;
				if(currChoice<0) {
					currChoice=2;
				}
				repaint();
				break;

			default:
				break;
			}
		}
	};

	Thread background = new Thread(new Runnable() {

		@Override
		public void run() {

		}
	});

	public MainMenuPanel() {
		setLayout(null);
		setBackground(Color.black);
		setFocusable(true);

		title = new JLabel("SUTING SUTING AWW AWW", JLabel.CENTER);
		title.setBounds(220, 20, 460, 50);
		title.setFont(new Font("Prestige Elite Std", Font.BOLD, 35));
		title.setForeground(Color.WHITE);
		add(title);
//
//		start = new JLabel("START", JLabel.CENTER);
//		start.setBounds(220, 200 + (currfontloc[0] * 50), 460, 50);
////		start.setBounds(220, 200, 460, 50);
//		start.setFont(new Font("Prestige Elite Std", Font.BOLD, 30));
//		start.setForeground(Color.WHITE);
//		add(start);
//
//		help = new JLabel("HELP", JLabel.CENTER);
//		help.setBounds(220, 200 + currfontloc[1] * 50, 460, 50);
//		help.setBounds(220, 250, 460, 50);
//		help.setFont(new Font("Prestige Elite Std", Font.BOLD, 70));
//		help.setForeground(Color.WHITE);
//		add(help);
//
//		exit = new JLabel("EXIT", JLabel.CENTER);
//		exit.setBounds(220, 200 + currfontloc[2] * 50, 460, 50);
//		exit.setBounds(220, 300, 460, 50);
//		exit.setFont(new Font("Prestige Elite Std", Font.BOLD, 30));
//		exit.setForeground(Color.WHITE);
//		add(exit);

		addKeyListener(keyListener);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		
		for (int i = 0; i < 3; i++) {
			if (i == currChoice) {
				g.setColor(Color.RED);
				g.setFont(new Font("Kemasyuran Jawa", Font.BOLD, 70));
				g.drawString(options[currfontloc[i]], 30, 200 + currfontloc[i] * 50);

			} else {
				g.setColor(Color.WHITE);
				g.setFont(new Font("Kemasyuran Jawa", Font.BOLD, 30));
				g.drawString(options[currfontloc[i]], 30, 200 + currfontloc[i] * 50);
			}
		}

	}
}
