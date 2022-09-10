package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------------
    //--------ATRIBUTOS----------
    //---------------------------


    //---------------------------
    //--------METODOS----------
    //---------------------------


    // Metodo Constructor (Lo que define la construcción de la ventana)
    public VentanaPrincipal()
    {
        // Caracteristicas de la ventana
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }


}

