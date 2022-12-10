package com.visual.funcionalidad2;

import com.visual.GestorPaneles;
import com.visual.PlantillaInterfaces;
import com.visual.RecursosVisuales;
import com.visual.funcionalidad1.Interfaz2;
import com.visual.funcionalidad1.Interfaz4;
import com.visual.funcionalidad1.Interfaz6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Interfaz2_1 extends PlantillaInterfaces {
    public Interfaz2_1(){
        RecursosVisuales rv = RecursosVisuales.getInstance();
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());

        add(rv.getTitle(), BorderLayout.NORTH);
        add(getMainPanel("Página Principal"), BorderLayout.CENTER);
    }

    @Override
    protected JPanel getSubtitlePanel(String subtitle){
        // Creamos el panel del subtitulo (flowlayout)
        JPanel subTitlePanel = new JPanel();
        subTitlePanel.setLayout(new FlowLayout());
        JLabel subTitle = new JLabel(subtitle);
        subTitle.setFont(RecursosVisuales.getInstance().subTitleFont);

        subTitlePanel.add(subTitle);
        subTitlePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));

        return subTitlePanel;
    }

    @Override
    protected JPanel getContentPanel(){
        // Contenido principal de la vista
        // [No loggeado] -> El contenido es un flowlayout con los botones de login...
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());

        // boton de login
        JButton login = new JButton("Log in");
        login.addActionListener(mouseEventHandler());
        content.add(login);

        // boton de registro
        JButton register = new JButton("Register");
        register.addActionListener(mouseEventHandler());
        content.add(register);

        // boton de recuperacion de contraseña
        JButton rec = new JButton("Recuperar Contraseña");
        rec.addActionListener(mouseEventHandler());
        content.add(rec);
        return content;
    }

    @Override
    protected ActionListener mouseEventHandler(){
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object o = e.getSource();

                if(o instanceof JButton){
                    JButton button = (JButton) o;

                    if(Objects.equals(button.getText(), "Log in")){
                        // Abrimos la vista de log in
                        GestorPaneles.getInstance().bind(new Interfaz2());

                    }else if(Objects.equals(button.getText(), "Register")){
                        // Abrimos la vista de registro
                        GestorPaneles.getInstance().bind(new Interfaz4());

                    }else if(Objects.equals(button.getText(), "Recuperar Contraseña")){
                        // Abrimos la vista de recuperacion
                        GestorPaneles.getInstance().bind(new Interfaz6());

                    }
                }
            }
        };
    }

}





