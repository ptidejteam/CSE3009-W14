/*******************************************************************************
 * Copyright (c) 2014 Yann-Gaël Guéhéneuc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Yann-Gaël Guéhéneuc - Initial API and implementation for CSE3009 W14
 ******************************************************************************/
package kr.ac.yonsei.it.cse3009.scrollpane.example;

import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Example {
	public static void main(final String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				final JFrame frame = new JFrame("Example of JScrollPane");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocation(50, 50);
				frame.setSize(800, 600);
				frame.setVisible(true);

				try {
					final Image image = ImageIO.read(new File("rsc/Slide.png"));
					final JLabel imageLabel = new JLabel(new ImageIcon(image));
					final JScrollPane scrollPane = new JScrollPane(imageLabel);
					frame.getContentPane().add(scrollPane);
				}
				catch (final IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
