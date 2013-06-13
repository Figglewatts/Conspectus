package figglewatts.conspectus;

import figglewatts.conspectus.util.Util;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
			}
		});
	}

	public MainFrame() {
		initUI();
	}
	
	public final void initUI() {
		JMenuBar menuBar = new JMenuBar();
		ImageIcon newIcon = createImageIcon("/images/icons/new.png", "a new icon");
		ImageIcon openIcon = createImageIcon("/images/icons/open.png", "an open icon");
		ImageIcon saveIcon = createImageIcon("/images/icons/save.png", "a save icon");
		ImageIcon saveAsIcon = createImageIcon("/images/icons/saveAs.png", "a save as icon");
		ImageIcon exitIcon = createImageIcon("/images/icons/exit.png", "an exit icon");
		ImageIcon deleteIcon = createImageIcon("/images/icons/delete.png", "a delete icon");
		
		/* START FILE MENU */
		JMenu mainMenu = new JMenu("File");
		mainMenu.setMnemonic(KeyEvent.VK_F);
		
		/* START IMPORT SUBMENU */
		JMenu imp = new JMenu("Import");
		JMenuItem impTileSheet = new JMenuItem("Import tilesheet...");
		impTileSheet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: import a tile sheet
			}
		});
		JMenuItem impObjectList = new JMenuItem("Import Object List...");
		impObjectList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: import an object list
			}
		});
		imp.add(impTileSheet);
		imp.add(impObjectList);
		/* END IMPORT SUBMENU */
		
		/* START EXPORT SUBMENU */
		JMenu exp = new JMenu("Export");
		JMenuItem expUntitledGame = new JMenuItem("Export as Untitled Game Format...");
		expUntitledGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: export the level for Untitled Game
			}
		});
		JMenuItem expCMRoguelikeJSON = new JMenuItem("Export as CMRoguelike JSONRoom...");
		expCMRoguelikeJSON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: export the level in the JSONRoom format
			}
		});
		exp.add(expUntitledGame);
		exp.add(expCMRoguelikeJSON);
		/* END IMPORT SUBMENU */
		
		JMenuItem fileMenuNew = new JMenuItem("New", newIcon);
		fileMenuNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileMenuNew.setToolTipText("Make a new level.");
		fileMenuNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: make a new level
			}
		});
		
		
		JMenuItem fileMenuOpen = new JMenuItem("Open", openIcon);
		fileMenuOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileMenuOpen.setToolTipText("Open an existing level.");
		fileMenuOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: open a level
			}
		});
		
		JMenuItem fileMenuSave = new JMenuItem("Save", saveIcon);
		fileMenuSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileMenuSave.setToolTipText("Save this level.");
		fileMenuSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: save a level
			}
		});
		
		JMenuItem fileMenuSaveAs = new JMenuItem("Save As", saveAsIcon);
		fileMenuSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.SHIFT_MASK));
		fileMenuSaveAs.setToolTipText("Save this level as...");
		fileMenuSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: save a level as
			}
		});
		
		JMenuItem fileMenuPreferences = new JMenuItem("Preferences"); // TODO: make a preferences icon
		fileMenuPreferences.setToolTipText("Change various Conspectus settings.");
		fileMenuPreferences.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: open preferences window
			}
		});
		
		JMenuItem fileMenuExit = new JMenuItem("Exit", exitIcon);
		fileMenuExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		fileMenuExit.setToolTipText("Exits the program.");
		fileMenuExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		mainMenu.add(fileMenuNew);
		mainMenu.add(fileMenuOpen);
		mainMenu.add(fileMenuSave);
		mainMenu.add(fileMenuSaveAs);
		mainMenu.addSeparator();
		mainMenu.add(imp);
		mainMenu.add(exp);
		mainMenu.addSeparator();
		mainMenu.add(fileMenuPreferences);
		mainMenu.addSeparator();
		mainMenu.add(fileMenuExit);
		/* END FILE MENU */
		
		/* START EDIT MENU */
		JMenu edit = new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		
		JMenuItem editMenuDelete = new JMenuItem("Delete", deleteIcon);
		editMenuDelete.setAccelerator(KeyStroke.getKeyStroke((char)KeyEvent.VK_DELETE));
		editMenuDelete.setToolTipText("Delete selected tiles.");
		editMenuDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: delete the tiles selected
			}
		});
		
		JMenuItem editMenuLevelOptions = new JMenuItem("Level Options"); // TODO: make an options icon
		editMenuLevelOptions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		editMenuLevelOptions.setToolTipText("Edit various flags and properties of the level.");
		editMenuLevelOptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: open level options menu
			}
		});
		
		edit.add(editMenuDelete);
		edit.addSeparator();
		edit.add(editMenuLevelOptions);
		/* END EDIT MENU */
		
		/* START TOOLS MENU */
		JMenu tools = new JMenu("Tools");
		tools.setMnemonic(KeyEvent.VK_T);
		
		JMenu genMenu = new JMenu("Generate");
		JMenuItem genMenuDungeon = new JMenuItem("Generate Dungeon...");
		genMenuDungeon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: open dungeon generation dialog
			}
		});
		
		genMenu.add(genMenuDungeon);
		tools.add(genMenu);
		/* END TOOLS MENU */
		
		/* START HELP MENU */
		JMenu help = new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		
		JMenuItem helpMenuAbout = new JMenuItem("About"); // TODO: make an about icon
		helpMenuAbout.setToolTipText("About Conspectus.");
		helpMenuAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				// TODO: create an about popup with info about software and version number
			}
		});
		
		help.add(helpMenuAbout);
		/* END HELP MENU */
		
		menuBar.add(mainMenu);
		menuBar.add(edit);
		menuBar.add(tools);
		menuBar.add(help);
		
		setJMenuBar(menuBar);
		
		setTitle("Conspectus");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public ImageIcon createImageIcon(String path, String description) {
		return new ImageIcon(getClass().getResource(path), description);
	}
}
