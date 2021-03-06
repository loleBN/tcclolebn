package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JDesktopPane jdpPrincipal;
	JIFRelatorioPorTag obj;
	JIFRelData objData;
	JIFRelSemana objSemana;
	JIFRelMes objMes;
	
	final JIFRelatorioGeral frameRG; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 980, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnRelatorio = new JMenu("relatorio");
		menuBar.add(mnRelatorio);
		
		JMenu mnOutros = new JMenu("outros");
		menuBar.add(mnOutros);
		
		JMenuItem mntmGer = new JMenuItem("Gerenciar Tags");
		mntmGer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frameRG.setIcon(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				//if(obj!=null)
				//	obj.dispose();
				JIFAdminLog objAdmin = new JIFAdminLog();
				jdpPrincipal.add(objAdmin);
				objAdmin.setVisible(true);
			}
		});
		mnOutros.add(mntmGer);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frameRG.setIcon(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				//if(obj!=null)
				//	obj.dispose();
				JIFSobre objSobre = new JIFSobre();
				jdpPrincipal.add(objSobre);
				objSobre.setVisible(true);
			}
		});
		mnOutros.add(mntmSobre);
		
		JMenuItem mntmHoje = new JMenuItem("Por Data");
		mntmHoje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frameRG.setIcon(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				//if(obj!=null)
					//obj.dispose();
				objData = new JIFRelData();
				jdpPrincipal.add(objData);
				objData.setVisible(true);
			}
		});
		mnRelatorio.add(mntmHoje);
		
		JMenuItem mntmSemanal = new JMenuItem("Por Semana");
		mntmSemanal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frameRG.setIcon(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				//if(obj!=null)
					//obj.dispose();
				objSemana = new JIFRelSemana();
				jdpPrincipal.add(objSemana);
				objSemana.setVisible(true);
			}
		});
		mnRelatorio.add(mntmSemanal);
		
		JMenuItem mntmMensal = new JMenuItem("Por Mês");
		mntmMensal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					frameRG.setIcon(true);
				} catch (PropertyVetoException e1) {
					e1.printStackTrace();
				}
				//if(obj!=null)
					//obj.dispose();
				objMes = new JIFRelMes();
				jdpPrincipal.add(objMes);
				objMes.setVisible(true);
			}
		});
		mnRelatorio.add(mntmMensal);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		jdpPrincipal = new JDesktopPane();
		jdpPrincipal.setSize(new Dimension(975, 590));
		jdpPrincipal.setMinimumSize(new Dimension(400, 400));
		jdpPrincipal.setBackground(Color.LIGHT_GRAY);
		jdpPrincipal.setBounds(0, 0, 980, 572);
		contentPane.add(jdpPrincipal);
		jdpPrincipal.setLayout(null);
		
		frameRG = new JIFRelatorioGeral();
		jdpPrincipal.add(frameRG);
		
		JLabel lblBack = new JLabel("");
		lblBack.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/drawables/6.jpg")));
		lblBack.setBounds(0, 0, 980, 572);
		jdpPrincipal.add(lblBack);
		frameRG.setVisible(true);
		
		
	}
}
