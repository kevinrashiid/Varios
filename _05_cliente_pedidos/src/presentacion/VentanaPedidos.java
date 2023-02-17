package presentacion;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Pedido;
import service.PedidosService;
import service.PedidosServiceFactory;

public class VentanaPedidos extends JFrame {

	private JPanel contentPane;
	private JTextField tfProducto;
	private JTextField tfUnidades;
	private JTextField tfTienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPedidos frame = new VentanaPedidos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPedidos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Producto:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(62, 34, 71, 14);
		contentPane.add(lblNewLabel);
		
		tfProducto = new JTextField();
		tfProducto.setBounds(173, 33, 86, 20);
		contentPane.add(tfProducto);
		tfProducto.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Unidades:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(62, 95, 71, 14);
		contentPane.add(lblNewLabel_1);
		
		tfUnidades = new JTextField();
		tfUnidades.setBounds(173, 94, 86, 20);
		contentPane.add(tfUnidades);
		tfUnidades.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tienda:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(62, 160, 71, 14);
		contentPane.add(lblNewLabel_2);
		
		tfTienda = new JTextField();
		tfTienda.setBounds(173, 159, 86, 20);
		contentPane.add(tfTienda);
		tfTienda.setColumns(10);
		
		JButton btEnviar = new JButton("Enviar");
		btEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//recogemos los datos de los campos de texto
				//creamos el objeto Pedido y lo mandamos
				Pedido pedido=new Pedido(0,
						tfProducto.getText(), 
						Integer.parseInt(tfUnidades.getText()), 
						LocalDate.now(),
						tfTienda.getText());
				PedidosService service=PedidosServiceFactory.getPedidosService();
				service.enviarPedido(pedido);
			}
		});
		btEnviar.setBounds(124, 227, 89, 23);
		contentPane.add(btEnviar);
	}
}
