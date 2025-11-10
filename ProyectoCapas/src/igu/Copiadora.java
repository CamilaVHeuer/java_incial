package igu;

import javax.swing.*;
import java.awt.*;

public class Copiadora extends JFrame {

    // Componentes
    private JTextField campoEntrada;
    private JTextField campoSalida;
    private JButton botonCopiar;
    private JButton botonLimpiar;

    public Copiadora() {
        // Configuración básica de la ventana
        setTitle("Copiadora");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Crear el título
        JLabel titulo = new JLabel("COPIADORA", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));

        // Panel central para el contenido principal
        JPanel panelCentral = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10);

        // Etiqueta de entrada
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel etiquetaEntrada = new JLabel("Ingresá un texto:");
        panelCentral.add(etiquetaEntrada, gbc);

        // Campo de entrada
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        campoEntrada = new JTextField();
        campoEntrada.setPreferredSize(new Dimension(250, 30));
        panelCentral.add(campoEntrada, gbc);

        // Botón Copiar (alineado a la derecha)
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        botonCopiar = new JButton("Copiar");
        botonCopiar.setPreferredSize(new Dimension(80, 30));
        panelCentral.add(botonCopiar, gbc); // Etiqueta de salida
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(15, 10, 5, 10);
        JLabel etiquetaSalida = new JLabel("El texto que ingresaste es:");
        panelCentral.add(etiquetaSalida, gbc);

        // Campo de salida
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.insets = new Insets(5, 10, 5, 10);
        campoSalida = new JTextField();
        campoSalida.setPreferredSize(new Dimension(250, 30));
        campoSalida.setEditable(false);
        campoSalida.setBackground(Color.LIGHT_GRAY);
        panelCentral.add(campoSalida, gbc);

        // Botón Limpiar (alineado a la derecha debajo del campo de salida)
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        gbc.insets = new Insets(10, 10, 5, 10);
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setPreferredSize(new Dimension(80, 30));
        panelCentral.add(botonLimpiar, gbc);

        // Agregar componentes al JFrame
        add(titulo, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);

        // Agregar márgenes
        JPanel panelMargen = new JPanel();
        panelMargen.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        panelMargen.setLayout(new BorderLayout());
        panelMargen.add(panelCentral, BorderLayout.CENTER);

        // Reemplazar el panel central
        remove(panelCentral);
        add(panelMargen, BorderLayout.CENTER);

        // Acciones de los botones
        botonCopiar.addActionListener(e -> {
            String texto = campoEntrada.getText();
            campoSalida.setText(texto);
        });

        botonLimpiar.addActionListener(e -> {
            campoEntrada.setText("");
            campoSalida.setText("");
        });

        // Mostrar ventana
        setVisible(true);
    }

    /*
     * public static void main(String[] args) {
     * new Copiadora();
     * }
     */
    // tengo que borrar el main porque para respetar la arquitectura de capas, el
    // main debe estar en la capa logica y este archivo no debe ser ejecutable
}