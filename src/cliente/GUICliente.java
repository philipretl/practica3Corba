package cliente;


import sop_corba.*;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.rmi.*;
import javax.swing.WindowConstants;
import java.net.*;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;



/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
public class GUICliente extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getCrossPlatformLookAndFeelClassName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JPanel jpanelconexion;
	private JLabel jlabelcliente;
        private JLabel jlabelclienteChat;
        private JLabel jlabelclienteNombre;
	private JLabel jlabelservidor;
	private JTextField jtextfieldservidor;
	private JPanel jpanelchat;
	private JTextField jtextfieldpuerto;
	private JTextArea jtextareamsg;
	private JTextArea jtextareacontacto;
	private JTextArea jtextareachat;
	private JScrollPane jscrollpane1contacto;
	private JScrollPane jscrollpane1chat;
	private JScrollPane jscrollpane1msg;
	private JButton jbuttonsalir;
	private JButton jbuttonenviar;
	private JButton jbuttonconec;
	private JTextField jtextfieldcliente;
	private JLabel jlabelpuerto;
	private JButton jButton1;
	ServidorInt svrchat;        
    ClienteInt objcllbck;
	String nombre;
	int opin=0;

	/**
	 * Auto-generated main method to display this JFrame
	 */
	public static void main(String[] args) {
		GUICliente inst = new GUICliente();
		inst.setVisible(true);
	}

	public GUICliente() {
		super();
		initGUI();
	}

	private void initGUI() {
		try {
			{
				this.setEnabled(true);
			}
			{
				//jButtonHis.setVisible(false);
			}
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setVisible(false);
			{
				jpanelconexion = new JPanel();
				getContentPane().add(jpanelconexion, BorderLayout.CENTER);
				GridBagLayout PanelConexionLayout = new GridBagLayout();
				PanelConexionLayout.columnWidths = new int[] { 156, 21, 7 };
				PanelConexionLayout.rowHeights = new int[] { 59, 42, 48 };
				PanelConexionLayout.columnWeights = new double[] { 0.0, 0.0,
						0.1 };
				PanelConexionLayout.rowWeights = new double[] { 0.0, 0.0, 0.0 };
				jpanelconexion.setLayout(PanelConexionLayout);
				jpanelconexion
					.setPreferredSize(new java.awt.Dimension(392, -1));
				{
					jlabelcliente = new JLabel();
					jpanelconexion.add(jlabelcliente, new GridBagConstraints(
						0,
						0,
						1,
						1,
						0.0,
						0.0,
						GridBagConstraints.CENTER,
						GridBagConstraints.NONE,
						new Insets(0, 0, 0, 0),
						0,
						0));
					jlabelcliente.setText("Cliente");
				}
				{
					jlabelservidor = new JLabel();
					jpanelconexion.add(jlabelservidor, new GridBagConstraints(
						0,
						1,
						1,
						1,
						0.0,
						0.0,
						GridBagConstraints.CENTER,
						GridBagConstraints.NONE,
						new Insets(0, 0, 0, 0),
						0,
						0));
					jlabelservidor.setText("Servidor");
				}
				{
					jlabelpuerto = new JLabel();
					jpanelconexion.add(jlabelpuerto, new GridBagConstraints(
						0,
						2,
						1,
						1,
						0.0,
						0.0,
						GridBagConstraints.CENTER,
						GridBagConstraints.NONE,
						new Insets(0, 0, 0, 0),
						0,
						0));
					jlabelpuerto.setText("Puerto");
				}
				{
					jtextfieldcliente = new JTextField();
					jpanelconexion.add(
						jtextfieldcliente,
						new GridBagConstraints(
							2,
							0,
							1,
							1,
							0.0,
							0.0,
							GridBagConstraints.WEST,
							GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 0, 25),
							0,
							0));
				}
				{
					jtextfieldservidor = new JTextField();
					jpanelconexion.add(
						jtextfieldservidor,
						new GridBagConstraints(
							2,
							1,
							1,
							1,
							0.0,
							0.0,
							GridBagConstraints.CENTER,
							GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 0, 25),
							0,
							0));
				}
				{
					jtextfieldpuerto = new JTextField();
					jpanelconexion.add(
						jtextfieldpuerto,
						new GridBagConstraints(
							2,
							2,
							1,
							1,
							0.0,
							0.0,
							GridBagConstraints.CENTER,
							GridBagConstraints.HORIZONTAL,
							new Insets(0, 0, 0, 25),
							0,
							0));
				}
				{
					jbuttonconec = new JButton();
					jpanelconexion.add(jbuttonconec, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jbuttonconec.setText("Conectar");
					jbuttonconec
						.setBackground(new java.awt.Color(230, 230, 250));
					jbuttonconec.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButtonConecActionPerformed(evt);
						}
					});
				}
				{
					jButton1 = new JButton();
					jpanelconexion.add(jButton1, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jButton1.setText("Salir");
					jButton1.setBackground(new java.awt.Color(230,230,250));
					jButton1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jButton1ActionPerformed(evt);
						}
					});
				}
			}
			{
				jpanelchat = new JPanel();
				getContentPane().add(jpanelchat, BorderLayout.NORTH);
				GridBagLayout jPanelCalcularLayout = new GridBagLayout();
				jPanelCalcularLayout.columnWidths = new int[] {29, 161, 168, 7};
				jPanelCalcularLayout.rowHeights = new int[] {7, 62, 46, 49, 44, 38};
				jPanelCalcularLayout.columnWeights = new double[] {0.0, 0.0, 0.0, 0.1};
				jPanelCalcularLayout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
				jpanelchat.setLayout(jPanelCalcularLayout);
				jpanelchat.setPreferredSize(new java.awt.Dimension(388, 269));
				jpanelchat.setVisible(false);
				{
					jbuttonenviar = new JButton();
					jpanelchat.add(jbuttonenviar, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jbuttonenviar.setText("Enviar");
					jbuttonenviar.setBackground(new java.awt.Color(230,230,250));
					jbuttonenviar.setEnabled(false);
					jbuttonenviar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jbuttonenviarActionPerformed(evt);
						}
					});
				}
                                
				{
					jlabelclienteNombre = new JLabel();
					jpanelchat.add(jlabelclienteNombre, new GridBagConstraints(
						0,
						0,
						1,
						1,
						0.0,
						0.0,
						GridBagConstraints.FIRST_LINE_START,
						GridBagConstraints.NONE,
						new Insets(0, 0, 0, 0),
						0,
						0));
					jlabelclienteNombre.setText("Cliente");
				}
				{
					jbuttonsalir = new JButton();
					jpanelchat.add(jbuttonsalir, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					jbuttonsalir.setText("Salir");
					jbuttonsalir.setBackground(new java.awt.Color(230,230,250));
					jbuttonsalir.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jbuttonsalirActionPerformed(evt);
						}
					});
				}
				{
					jscrollpane1msg = new JScrollPane();
					jpanelchat.add(jscrollpane1msg, new GridBagConstraints(1, 4, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 5, 5), 0, 0));
					{
						jtextareamsg = new JTextArea();
						jscrollpane1msg.setViewportView(jtextareamsg);
						jtextareamsg.addKeyListener(new KeyAdapter() {
							public void keyPressed(KeyEvent evt) {
								jtextareamsgKeyPressed(evt);
							}
						});
					}
				}
				{
					jscrollpane1chat = new JScrollPane();
					jpanelchat.add(jscrollpane1chat, new GridBagConstraints(1, 1, 1, 3, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
					{
						jtextareachat = new JTextArea();
						jscrollpane1chat.setViewportView(jtextareachat);
						jtextareachat.setEnabled(false);
					}
				}
				{
					jscrollpane1contacto = new JScrollPane();
					jpanelchat.add(jscrollpane1contacto, new GridBagConstraints(2, 1, 1, 3, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
					{
						jtextareacontacto = new JTextArea();
						jscrollpane1contacto.setViewportView(jtextareacontacto);
						jtextareacontacto.setEnabled(false);
					}
				}
			
			}
			pack();
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void jButtonConecActionPerformed(ActionEvent evt) {
		
			jpanelconexion.setVisible(false);  
                        nombre = jtextfieldcliente.getText();
			javax.swing.JOptionPane.showMessageDialog(this,"Conectado: "+nombre);
                        
                        
                        try {
                            
                            String[] vector= new String[4];
                            vector[0]="–ORBInitialHost";
                            vector[1]=jtextfieldservidor.getText();
                            vector[2]="-ORBInitialPort";
                            vector[3]=jtextfieldpuerto.getText();
                            jlabelclienteNombre.setText(nombre);
							
							 // crea e inicia el ORB
                            ORB orb = ORB.init(vector, null);
							
							// obtiene la referencia del rootpoa & activa el POAManager
                            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
                            rootpoa.the_POAManager().activate();
							
							// obtiene la base del naming context
                            org.omg.CORBA.Object objRef =
                                     orb.resolve_initial_references("NameService");
									 
                            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

							// Resuelve la referencia del objeto en el N_S
                            String name = "ServidorChat";
                            svrchat = ServidorIntHelper.narrow(ncRef.resolve_str(name));

							// crea el objeto callback 
                            ClienteImpl clienteCallbackImpl = new ClienteImpl(this);
							
                            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(clienteCallbackImpl);
                            
							// obtiene la referencia del objeto callback
                            objcllbck = ClienteIntHelper.narrow(ref);
							
							//registra el objcllbck el cual representa el cliente en el servidor de chat
                            svrchat.registrarCliente(objcllbck, nombre);

                            

                        } catch(Exception e){
                            System.out.println("ERROR : " + e);
                            e.printStackTrace(System.out);
                        }
                        
                        
                        
			jpanelchat.setVisible(true);    
		
	}
	
	public void fijarTexto(String nombre,String msg) {
		System.out.println("Invocando fijarTexto()...");
		//jtextareachat.setEnabled(true);
		try { 
		  jtextareachat.append(nombre + " escribió:\n" + msg +"\n");
	    } catch(Exception ex){}    	
		//TODO add your code for jbuttonHistorial.actionPerformed
	}
	
	public void fijarContacto(String nombre) {
		System.out.println("Invocando fijarTexto()...");
		//jtextareachat.setEnabled(true);
		try {                  
		  jtextareacontacto.append(nombre + " en linea\n");
	    } catch(Exception ex){}    	   
		//TODO add your code for jbuttonHistorial.actionPerformed
	}
	
	public String obtenerNombre(){
		return nombre;
	}
	
	private void jtextareamsgKeyPressed(KeyEvent evt) {
		//System.out.println("jtextareamsg.keyPressed, event=" + evt);
		jbuttonenviar.setEnabled(true);                
		//TODO add your code for jtextareamsg.keyPressed
	}
	
	private void jbuttonenviarActionPerformed(ActionEvent evt) {
		//System.out.println("jbuttonenviar.actionPerformed, event=" + evt);
		
		svrchat.enviarMensaje(nombre,jtextareamsg.getText());
		jtextareamsg.setText("");
		//TODO add your code for jbuttonenviar.actionPerformed
		
	}
	
	private void jButton1ActionPerformed(ActionEvent evt) {
		System.exit(0);
		//TODO add your code for jButton1.actionPerformed
	}
	
	private void jbuttonsalirActionPerformed(ActionEvent evt) {		
		svrchat.desconectarCliente(objcllbck, nombre);
		System.exit(0);	
	}
        
        public void borrarLista()
        {
             jtextareacontacto.setText("");
        }
}
