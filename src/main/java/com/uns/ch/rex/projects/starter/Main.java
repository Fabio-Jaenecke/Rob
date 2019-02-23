package com.uns.ch.rex.projects.starter;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Fabio Jaenecke (Unisys (Schweiz) GmbH)
 * @version 1.0
 *
 */
public class Main extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
	
	private Main() {
		super ("RobMe - Roboter Testrun Starter");
		setSize(800, 600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		initialize();
	}
	
	private void initialize() {
		
		//Menu
		
		JMenuBar bar = new JMenuBar();
		
		JMenu settings = new JMenu("Einstellungen");
		JMenuItem env = new JMenuItem("Setze Umgebungseinstellung");
		JMenuItem reset = new JMenuItem("Zurücksetzen");
		JMenuItem save = new JMenuItem("Speichern");
		JMenuItem exit = new JMenuItem("Beenden");
		
		JMenuItem testrun = new JMenu("Testrun");
		JMenuItem start = new JMenuItem("Starte Testrun");
		JMenuItem stop = new JMenuItem("Stoppe aktiven Testrun");
				
		JMenuItem[] items = { env, reset, save, exit, testrun, start, stop };
		for(JMenuItem item : items) {
			item.addActionListener(this);
		}

		setJMenuBar(bar);
		
		bar.add(settings);
		
		settings.add(env);
		settings.add(save);
		settings.addSeparator();
		settings.add(testrun);
		settings.addSeparator();
		settings.add(reset);
		settings.add(exit);
		
		testrun.add(start);
		testrun.add(stop);
		
		//buttons
		
				JButton addB = new JButton("Hinzufügen");
				addB.setActionCommand("add");
				JButton remove = new JButton("Entfernen");
				remove.setActionCommand("remove");
				JButton all = new JButton("Alle Auswählen");
				all.setActionCommand("all");
				JButton run = new JButton("Starte Testrun");
				all.setActionCommand("run");
				
				add(all, BorderLayout.EAST);
				add(addB, BorderLayout.CENTER);
				add(remove, BorderLayout.WEST);
				add(run, BorderLayout.SOUTH);
				
				JButton[] buttons = { addB, remove, all, run };
				for(JButton button : buttons) {
					button	.addActionListener(this);
				}
				
		//showtestsuites
		
		//zweizeilige Tabelle initialize list hinzufuegen entfernen liste
			
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = e.getActionCommand();
		
		if(name.equalsIgnoreCase("all")) {
			selectTestSuite();
			loadTestSuite();
		} else if (name.equalsIgnoreCase("add")) {
			addSelectedTestSuite();
		} else if(name.equalsIgnoreCase("remove")) {
			removeSelectedTestSuite();
		} else if(name.equalsIgnoreCase("run")) {
			loadAllTestSuites(); // subklasse von loadBatchfile
		} else if(name.equalsIgnoreCase("Beenden")) {
			System.exit(0);
		}
	}
	
	private void showAllTestSuites() {
		//swingOut: forLoop TestSuite.getTestrailName
	}
	
	private void selectTestSuite() {
		
	}

	private void loadTestSuite() {
		
	}
	
	private void addSelectedTestSuite() {
		TestSuite suite = new TestSuite();
		suite.setTestrailPath("SuperTest");
		System.out.println(suite.getTestrailPath());
	}
	
	private void removeSelectedTestSuite() {
		
	}
	
	private void loadAllTestSuites(){
		loadTestSuite(); //all
	}
}
