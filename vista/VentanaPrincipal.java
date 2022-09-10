package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------------
    //--------ATRIBUTOS----------
    //---------------------------
    private PanelEntradaDatos miPanelEntradaDatos;


    //---------------------------
    //--------METODOS----------
    //---------------------------


    // Metodo Constructor (Lo que define la construcción de la ventana)
    public VentanaPrincipal()
    {
        // Definición contenedor de la ventana
        this.setLayout(null);
        
        // Creación y adición de un panel tipo PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200);
        this.add(miPanelEntradaDatos);

        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }


}

