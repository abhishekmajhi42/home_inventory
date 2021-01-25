package homeinventory;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JToolBar;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.geom.Rectangle2D;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class HomeInventory {

	private JFrame frame;
	private JTextField itemtextField;
	private JTextField serialtextField;
	private JTextField pricetextField;
	private JTextField storetextField;
	private JTextField notetextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeInventory window = new HomeInventory();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeInventory() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 526, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JToolBar inventorytoolBar = new JToolBar();
		inventorytoolBar.setOrientation(SwingConstants.VERTICAL);
		GridBagConstraints gbc_inventorytoolBar = new GridBagConstraints();
		gbc_inventorytoolBar.insets = new Insets(0, 0, 0, 5);
		gbc_inventorytoolBar.gridx = 0;
		gbc_inventorytoolBar.gridy = 0;
		gbc_inventorytoolBar.gridheight=9;
		inventorytoolBar.setFloatable(false);
		/*inventorytoolBar.setBackground(Color:bg);*/
		frame.getContentPane().add(inventorytoolBar, gbc_inventorytoolBar);
		inventorytoolBar.addSeparator();
		
		JButton newbutton = new JButton("New");
		newbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		newbutton.setIcon(null);
		inventorytoolBar.add(newbutton);
		
		JButton deletebutton = new JButton("Delete");
		deletebutton.setVerticalAlignment(SwingConstants.BOTTOM);
		deletebutton.setIcon(null);
		inventorytoolBar.add(deletebutton);
		
		JButton savebutton = new JButton("Save");
		savebutton.setVerticalAlignment(SwingConstants.BOTTOM);
		savebutton.setIcon(null);
		inventorytoolBar.add(savebutton);
		inventorytoolBar.addSeparator();
		
		JButton previousbutton = new JButton("Previous");
		previousbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		previousbutton.setIcon(null);
		inventorytoolBar.add(previousbutton);
		
		JButton nextbutton = new JButton("Next");
		nextbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		nextbutton.setIcon(null);
		inventorytoolBar.add(nextbutton);
		inventorytoolBar.addSeparator();
		
		JButton printbutton = new JButton("Print");
		printbutton.setVerticalAlignment(SwingConstants.BOTTOM);
		printbutton.setIcon(null);
		inventorytoolBar.add(printbutton);
		
		JButton exitbutton = new JButton("Exit");
		inventorytoolBar.add(exitbutton);
		
		
		
		
		
		JLabel itemLabel = new JLabel("Inventory Item");
		GridBagConstraints gbc_itemLabel = new GridBagConstraints();
		gbc_itemLabel.anchor = GridBagConstraints.EAST;
		gbc_itemLabel.insets = new Insets(10, 10, 5, 10);
		gbc_itemLabel.gridx = 1;
		gbc_itemLabel.gridy = 0;
		frame.getContentPane().add(itemLabel, gbc_itemLabel);
		
		itemtextField = new JTextField();
		GridBagConstraints gbc_itemtextField = new GridBagConstraints();
		gbc_itemtextField.insets = new Insets(10, 0, 5, 10);
		gbc_itemtextField.anchor = GridBagConstraints.WEST;
		gbc_itemtextField.gridx = 2;
		gbc_itemtextField.gridy = 0;
		gbc_itemtextField.gridwidth=5;
		frame.getContentPane().add(itemtextField, gbc_itemtextField);
		itemtextField.setColumns(10);
		
		JLabel locationLabel = new JLabel("Location");
		GridBagConstraints gbc_locationLabel = new GridBagConstraints();
		gbc_locationLabel.anchor = GridBagConstraints.EAST;
		gbc_locationLabel.insets = new Insets(10, 10, 5, 10);
		gbc_locationLabel.gridx = 1;
		gbc_locationLabel.gridy = 1;
		frame.getContentPane().add(locationLabel, gbc_locationLabel);
		
		JComboBox locationcomboBox = new JComboBox();
		GridBagConstraints gbc_locationcomboBox = new GridBagConstraints();
		gbc_locationcomboBox.insets = new Insets(0, 0, 5, 5);
		gbc_locationcomboBox.anchor = GridBagConstraints.WEST;
		gbc_locationcomboBox.gridx = 2;
		gbc_locationcomboBox.gridy = 1;
		gbc_locationcomboBox.gridwidth=3;
		locationcomboBox.setEditable(true); 
		frame.getContentPane().add(locationcomboBox, gbc_locationcomboBox);
		
		JLabel serialLabel = new JLabel("Serial Number");
		GridBagConstraints gbc_serialLabel = new GridBagConstraints();
		gbc_serialLabel.anchor = GridBagConstraints.EAST;
		gbc_serialLabel.insets = new Insets(10, 10, 5, 10);
		gbc_serialLabel.gridx = 1;
		gbc_serialLabel.gridy = 2;
		frame.getContentPane().add(serialLabel, gbc_serialLabel);
		
		JCheckBox markedCheckBox = new JCheckBox("Marked?");
		GridBagConstraints gbc_markedCheckBox = new GridBagConstraints();
		gbc_markedCheckBox.insets = new Insets(10, 10, 5, 5);
		gbc_markedCheckBox.gridx = 5;
		gbc_markedCheckBox.gridy = 1;
		gbc_markedCheckBox.anchor = GridBagConstraints.WEST;
		frame.getContentPane().add(markedCheckBox, gbc_markedCheckBox);
		
		JLabel priceLabel = new JLabel("Purchase Price");
		GridBagConstraints gbc_priceLabel = new GridBagConstraints();
		gbc_priceLabel.anchor = GridBagConstraints.EAST;
		gbc_priceLabel.insets = new Insets(10,10,0,10);
		gbc_priceLabel.gridx = 1;
		gbc_priceLabel.gridy = 3;
		frame.getContentPane().add(priceLabel, gbc_priceLabel);
		
		JLabel dateLabel = new JLabel("Date Purchased");
		GridBagConstraints gbc_dateLabel = new GridBagConstraints();
		gbc_dateLabel.insets = new Insets(10,10,0,0);
		gbc_dateLabel.anchor = GridBagConstraints.WEST;
		gbc_dateLabel.gridx = 4;
		gbc_dateLabel.gridy = 3;
		frame.getContentPane().add(dateLabel, gbc_dateLabel);
		
		JLabel storeLabel = new JLabel("Store/Website");
		GridBagConstraints gbc_storeLabel = new GridBagConstraints();
		gbc_storeLabel.insets = new Insets(10,10,0,10);
		gbc_storeLabel.anchor = GridBagConstraints.EAST;
		gbc_storeLabel.gridx = 1;
		gbc_storeLabel.gridy = 4;
		frame.getContentPane().add(storeLabel, gbc_storeLabel);
		
		JLabel noteLabel = new JLabel("Note");
		GridBagConstraints gbc_noteLabel = new GridBagConstraints();
		gbc_noteLabel.anchor = GridBagConstraints.EAST;
		gbc_noteLabel.insets = new Insets(10,10,0,10);
		gbc_noteLabel.gridx = 1;
		gbc_noteLabel.gridy = 5;
		frame.getContentPane().add(noteLabel, gbc_noteLabel);
		
		serialtextField = new JTextField();
		GridBagConstraints gbc_serialtextField = new GridBagConstraints();
		gbc_serialtextField.insets = new Insets(10, 0, 5, 10);
		gbc_serialtextField.anchor = GridBagConstraints.WEST;
		gbc_serialtextField.gridx = 2;
		gbc_serialtextField.gridy = 2;
		frame.getContentPane().add(serialtextField, gbc_serialtextField);
		serialtextField.setColumns(10);
		
		notetextField = new JTextField();
		GridBagConstraints gbc_notetextField = new GridBagConstraints();
		gbc_notetextField.insets = new Insets(0, 0, 5, 5);
		gbc_notetextField.anchor = GridBagConstraints.WEST;
		gbc_notetextField.gridx = 2;
		gbc_notetextField.gridy = 5;
		gbc_notetextField.gridwidth=5;
		frame.getContentPane().add(notetextField, gbc_notetextField);
		notetextField.setColumns(10);
		
		pricetextField = new JTextField();
		pricetextField.setText("Purchase Price");
		GridBagConstraints gbc_pricetextField = new GridBagConstraints();
		gbc_pricetextField.insets = new Insets(10,0,0,10);
		gbc_pricetextField.anchor = GridBagConstraints.WEST;
		gbc_pricetextField.gridx = 2;
		gbc_pricetextField.gridy = 3;
		gbc_pricetextField.gridwidth=2;
		frame.getContentPane().add(pricetextField, gbc_pricetextField);
		pricetextField.setColumns(10);
		
		JLabel photoLabel = new JLabel("Photo");
		GridBagConstraints gbc_photoLabel = new GridBagConstraints();
		gbc_photoLabel.anchor = GridBagConstraints.EAST;
		gbc_photoLabel.insets = new Insets(10,10,0,10);
		gbc_photoLabel.gridx = 1;
		gbc_photoLabel.gridy = 6;
		frame.getContentPane().add(photoLabel, gbc_photoLabel);
		
		storetextField = new JTextField();
		GridBagConstraints gbc_storetextField = new GridBagConstraints();
		gbc_storetextField.insets = new Insets(10,0,0,10);
		gbc_storetextField.anchor = GridBagConstraints.WEST;
		gbc_storetextField.gridx = 2;
		gbc_storetextField.gridy = 4;
		gbc_storetextField.gridwidth=5;
		frame.getContentPane().add(storetextField, gbc_storetextField);
		storetextField.setColumns(10);
		
		JButton photoButton = new JButton("...");
		GridBagConstraints gbc_photoButton = new GridBagConstraints();
		gbc_photoButton.insets = new Insets(10,0,0,10);
		gbc_photoButton.gridx = 6;
		gbc_photoButton.gridy = 6;
		gbc_photoButton.anchor = GridBagConstraints.WEST;
		frame.getContentPane().add(photoButton, gbc_photoButton);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0,0,0,5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 8;
		frame.getContentPane().add(panel, gbc_panel);
		
		JPanel photoPanel = new JPanel();
		GridBagConstraints gbc_photoPanel = new GridBagConstraints();
		gbc_photoPanel.insets = new Insets(10,0,10,10);
		gbc_photoPanel.anchor = GridBagConstraints.CENTER;
		gbc_photoPanel.gridx = 4;
		gbc_photoPanel.gridy = 7;
		gbc_photoPanel.gridwidth=3;
		frame.getContentPane().add(photoPanel, gbc_photoPanel);
		
		JTextArea phototextArea = new JTextArea();
		GridBagConstraints gbc_phototextArea = new GridBagConstraints();
		gbc_phototextArea.insets = new Insets(10,0,0,10);
		gbc_phototextArea.anchor = GridBagConstraints.WEST;
		gbc_phototextArea.gridx = 2;
		gbc_phototextArea.gridy = 6;
		frame.getContentPane().add(phototextArea, gbc_phototextArea);
		
		final int maximumEntries=300;
		int numberEntries;
		InventoryItem[] myInventory=new InventoryItem[maximumEntries];
		int n;
		try {
			BufferedReader inputFile = new BufferedReader(new FileReader("inventory.txt")); 
			numberEntries = Integer.valueOf(inputFile.readLine()).intValue(); 
			if (numberEntries != 0)
			{
				for (int i = 0; i < numberEntries; i++) 
				{
					myInventory[i] = new InventoryItem();
					myInventory[i].description = inputFile.readLine(); 
					myInventory[i].location = inputFile.readLine();
					myInventory[i].serialNumber = inputFile.readLine();
					myInventory[i].marked = Boolean.valueOf(inputFile.readLine()).booleanValue(); 
					myInventory[i].purchasePrice = inputFile.readLine(); 
					myInventory[i].purchaseDate = inputFile.readLine(); 
					myInventory[i].purchaseLocation = inputFile.readLine(); 
					myInventory[i].note = inputFile.readLine();
					myInventory[i].photoFile = inputFile.readLine();

				}
			}
			n = Integer.valueOf(inputFile.readLine()).intValue();
			if (n != 0)
			{
				for (int i = 0; i < n; i++)
				{
					locationcomboBox.addItem(inputFile.readLine());

				}
			}
			inputFile.close();

		}
		catch (Exception ex) 
		{
			numberEntries = 0;

		}
		
		if (numberEntries == 0) 
		{
			newbutton.setEnabled(false);
			deletebutton.setEnabled(false); 
			nextbutton.setEnabled(false); 
			previousbutton.setEnabled(false);
			printbutton.setEnabled(false);

		}
		
		private void showEntry(int j) 
		{
			itemTextField.setText(myInventory[j - 1].description);
		}
	}
	
	class PhotoPanel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			Graphics2D g2D=(Graphics2D) g;
			super.paintComponent(g2D);
			g2D.setPaint(Color.BLACK); 
			g2D.draw(new Rectangle2D.Double(0, 0, getWidth() - 1, getHeight() - 1));
			g2D.dispose();
		}
		
		
		PhotoPanel photoPanel=new PhotoPanel();
		
		
		
	}

}
