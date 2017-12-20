package bookings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JYearChooser;
import com.toedter.calendar.JMonthChooser;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;

public class bookingsUI {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_5;
	private JTextField hourTxt;
	private JLabel lblNewLabel_6;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JLabel lblNewLabel_7;
	private JComboBox comboBox;
	private JPanel panel;
	private JButton subButton;
	private JButton clrButton;
	private JPanel panel_1;
	private JLabel lblNewLabel_4;
	private JPanel panel_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
    
   charity n = new charity();
   ind i = new ind();
   privateOrg p = new privateOrg();
   private JTextField timeStart;
   private JTextField dateField;
   private JTextField timeEnd;
   private JLabel lblTotal;
   private JTextField totLab;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bookingsUI window = new bookingsUI();
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
	public bookingsUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, "7, 2, 5, 1, fill, fill");
		
		lblNewLabel_4 = new JLabel("Booking Service");
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("Name");
		frame.getContentPane().add(lblNewLabel, "4, 6");
		
		textField = new JTextField();
		frame.getContentPane().add(textField, "6, 6, fill, default");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Event Date");
		frame.getContentPane().add(lblNewLabel_1, "10, 6, left, default");
		
		dateField = new JTextField();
		dateField.setText("--/--/----");
		frame.getContentPane().add(dateField, "12, 6, fill, default");
		dateField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Start Time");
		frame.getContentPane().add(lblNewLabel_2, "4, 8, left, default");
		
		timeStart = new JTextField();
		frame.getContentPane().add(timeStart, "6, 8, fill, default");
		timeStart.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("End Time");
		frame.getContentPane().add(lblNewLabel_3, "10, 8, left, default");
		
		timeEnd = new JTextField();
		frame.getContentPane().add(timeEnd, "12, 8, fill, default");
		timeEnd.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Hour");
		frame.getContentPane().add(lblNewLabel_5, "4, 10");
		
		hourTxt = new JTextField();
		hourTxt.addMouseListener(new MouseAdapter() {
		
		
			@Override
			public void mouseClicked(MouseEvent arg0) {
				 try{
			         
					    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm", Locale.ENGLISH);

					    Date firstDate = sdf.parse(timeStart.getText());
					    Date secondDate = sdf.parse(timeEnd.getText());
					 
					    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
					    int hour = (int) ((diffInMillies / 1000) / 3600);
					    hourTxt.setText(String.valueOf(hour));
					    
					     
					      }
					        
					        catch(Exception ex){
					            System.out.println(ex);
					        }
			}
		});
		
		
		frame.getContentPane().add(hourTxt, "6, 10, fill, default");
		hourTxt.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Organisation");
		frame.getContentPane().add(lblNewLabel_7, "4, 12, left, default");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Charity", "Individual", "Private"}));
		frame.getContentPane().add(comboBox, "6, 12, fill, default");
		
		lblNewLabel_6 = new JLabel("Room Type");
		frame.getContentPane().add(lblNewLabel_6, "4, 14, left, center");
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "6, 14, 4, 1, center, top");
		
		rdbtnNewRadioButton = new JRadioButton("Hall");
		rdbtnNewRadioButton.setActionCommand("Hall");
		buttonGroup.add(rdbtnNewRadioButton);
		panel_2.add(rdbtnNewRadioButton);
		

			rdbtnNewRadioButton_1 = new JRadioButton("Room 1");
			rdbtnNewRadioButton_1.setActionCommand("Room 1");
			buttonGroup.add(rdbtnNewRadioButton_1);
			panel_2.add(rdbtnNewRadioButton_1);
			
			rdbtnNewRadioButton_2 = new JRadioButton("Room 2");
			rdbtnNewRadioButton_2.setActionCommand("Room 2");
			buttonGroup.add(rdbtnNewRadioButton_2);
			panel_2.add(rdbtnNewRadioButton_2);
		
		lblTotal = new JLabel("Total Cost");
		frame.getContentPane().add(lblTotal, "4, 18");
		
		totLab = new JTextField();
		frame.getContentPane().add(totLab, "6, 18, fill, default");
		totLab.setColumns(10);
		
		panel = new JPanel();
		frame.getContentPane().add(panel, "4, 24, 15, 1, fill, fill");
		
		subButton = new JButton("Submit");
		subButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String org = comboBox.getSelectedItem().toString();
		        String option = buttonGroup.getSelection().getActionCommand();
		        
		        
		        if (org.equalsIgnoreCase("Charity")) {
		            if (option.equalsIgnoreCase("Hall")) {
		                n.setHall();
		            } else {
		                n.setRoom();
		            }
		            
		            n.setHour(Integer.parseInt(hourTxt.getText()));
		            n.setChar();
		            totLab.setText("£ " +Double.toString(n.getChar() + n.depo()));
		            
		        } else if (org.equalsIgnoreCase("Individual")) {
		            if (option.equalsIgnoreCase("Hall")) {
		                i.setHall();
		            } else {
		                i.setRoom();
		            }
		    
		            i.setHour(Integer.parseInt(hourTxt.getText()));
		            i.setInd();
		            totLab.setText("£ " +Double.toString(i.getInd() + i.depo()));
		        } else {

		            if (option.equalsIgnoreCase("Hall")) {
		                p.setHall();
		            } else {
		                p.setRoom();
		            }

		            p.setHour(Integer.parseInt(hourTxt.getText()));
		            p.setPri();

		            totLab.setText("£ " + Double.toString( p.getPri() + p.depo()));
		        }
		        
		        
		       
				
			}
		});
		panel.add(subButton);
		
		clrButton = new JButton("Clear");
		clrButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hourTxt.setText(null);
		        textField.setText(null);
		        dateField.setText(null);
		        totLab.setText(null);
		        timeStart.setText(null);
		        timeEnd.setText(null);
		        buttonGroup.clearSelection();
		        
			}
		});
		panel.add(clrButton);
	}

}
