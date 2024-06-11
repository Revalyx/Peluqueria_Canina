package View;

import javax.swing.*;

public class MainWindow extends JFrame{





    public MainWindow(){

        super("Tienda Peluquería Canina");
        setBounds(200,200,800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JButton btnAddPerro = new JButton("Añadir Perro");
        btnAddPerro.setBounds(200,200,200,50);

        JButton btnAddCliente = new JButton("Añadir Perro");
        btnAddCliente.setBounds(200,300,200,50);

        add(btnAddPerro);
        add(btnAddCliente);

    }



}
