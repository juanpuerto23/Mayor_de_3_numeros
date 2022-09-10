package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------------------
    //--------ATRIBUTOS----------
    //---------------------------
    private JLabel lbTitulo;


    //---------------------------
    //--------METODOS----------
    //---------------------------


    // Metodo Constructor
    public PanelEntradaDatos()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        // Crear y agregar etiqueta para titulo
        lbTitulo = new JLabel("MAYOR DE 3 ENTEROS", JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lbTitulo.setForeground(Color.BLUE);
        lbTitulo.setBounds(10,10,480,20);
        this.add(lbTitulo);

        // Borde y Titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    } 
}
