package com.crazysaddler.chatapp;

import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyWindow extends Canvas {

	private static final long serialVersionUID = 6220989915378545870L;

	public static void main(String[] args) {

		JFrame frame = new JFrame("Chat App");
		frame.setVisible(true);
		frame.setSize(500, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton("Login");
		panel.add(button);
		button.addActionListener(new Action1());

		JButton button2 = new JButton("Create account");
		panel.add(button2);
		button.addActionListener(new Action2());
	}

	static class Action1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame frame2 = new JFrame("Login");
			frame2.setVisible(true);
			frame2.setSize(200, 200);
			frame2.setLocationRelativeTo(null);
			JLabel label = new JLabel("User name");
			JPanel panel = new JPanel();
			frame2.add(panel);
			panel.add(label);
		}
	}

	static class Action2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame frame3 = new JFrame("Create account");
			frame3.setVisible(true);
			frame3.setSize(200, 200);
			frame3.setLocationRelativeTo(null);
			JLabel label = new JLabel("password");
			JPanel panel2 = new JPanel();
			frame3.add(panel2);
			panel2.add(label);
		}

	}
}
