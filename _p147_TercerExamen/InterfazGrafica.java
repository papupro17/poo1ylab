package _p147_TercerExamen;



import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class InterfazGrafica {
    private JFrame frame;
    private JTable tabla;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private JButton btnAgregar, btnGrabar;
    private DatosLiga datos;

    public InterfazGrafica() {
        datos = new DatosLiga();
        frame = new JFrame("Liga de Futbol");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

       
        inicializarComponentes();

       
        configurarEventos();

       
        datos.cargarDatos("datos.dat");

       
        mostrarDatosEnTabla();

        frame.setVisible(true);
    }

    private void inicializarComponentes() {
        JPanel panelPrincipal = new JPanel(new BorderLayout());

       
        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        panelDatos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelDatos.add(txtNombre);
       

        JPanel panelBotones = new JPanel();
        btnAgregar = new JButton("Agregar");
        btnGrabar = new JButton("Grabar");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGrabar);

       
        tabla = new JTable();
        JScrollPane scrollPane = new JScrollPane(tabla);

        
        panelPrincipal.add(panelDatos, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

       
        frame.getContentPane().add(panelPrincipal);
        JButton btnMostrarInformacion = new JButton("Mostrar Información");
    btnMostrarInformacion.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            mostrarInformacion();
        }
    });

  
    panelBotones.add(btnMostrarInformacion);
}

private void mostrarInformacion() {
    double totalSalario = datos.calcularTotalSalario();
    int hombres = datos.contarHombres();
    int mujeres = datos.contarMujeres();
    int solteros = datos.contarSolteros();
    int casados = datos.contarCasados();

    
    JOptionPane.showMessageDialog(frame,
            "Total de Salario: " + totalSalario + "\n" +
                    "Cantidad de Hombres: " + hombres + "\n" +
                    "Cantidad de Mujeres: " + mujeres + "\n" +
                    "Cantidad de Solteros: " + solteros + "\n" +
                    "Cantidad de Casados: " + casados,
            "Información",
            JOptionPane.INFORMATION_MESSAGE);
}
    

    private void configurarEventos() {
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarJugador();
            }
        });

        btnGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grabarDatos();
            }
        });

        tabla.getSelectionModel().addListSelectionListener(e -> {
            
            mostrarDatosSeleccionados();
        });

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                datos.guardarDatos("datos.dat");
            }
        });
    }

    private void agregarJugador() {
        
        String nombre = txtNombre.getText();
        

       
        Jugador nuevoJugador = new Jugador(nombre, 0, ' ', "", "", 0.0);

        
        datos.agregarJugador(nuevoJugador);

        
        mostrarDatosEnTabla();
    }

    private void grabarDatos() {
        
    }

    private void mostrarDatosEnTabla() {
        List<Jugador> listaJugadores = datos.getListaJugadores();

       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Sexo");
        modelo.addColumn("Estado Civil");
        modelo.addColumn("Descripción");
        modelo.addColumn("Salario");

        
        for (Jugador jugador : listaJugadores) {
            Object[] fila = {
                    jugador.getNombre(),
                    jugador.getEdad(),
                    jugador.getSexo(),
                    jugador.getEstadoCivil(),
                    jugador.getDescripcion(),
                    jugador.getSalario()
            };
            modelo.addRow(fila);
        }

      
        tabla.setModel(modelo);
    }

    private void mostrarDatosSeleccionados() {
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InterfazGrafica());
    }
    
}
    

