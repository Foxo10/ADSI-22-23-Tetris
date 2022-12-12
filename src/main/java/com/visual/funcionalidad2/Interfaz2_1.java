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
        add(getMainPanel("Elegir nivel"), BorderLayout.CENTER);
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
        content.setLayout((new BoxLayout(content, BoxLayout.Y_AXIS)));

        // boton nivel fácil
        JButton facil = new JButton("Facil");
        facil.setBounds(100,10,90,30);
        facil.addActionListener(mouseEventHandler());
        content.add(facil);

        // boton nivel intermedio
        JButton intermedio = new JButton("Intermedio");
        intermedio.setBounds(100,30,90,30);
        intermedio.addActionListener(mouseEventHandler());
        content.add(intermedio);

        // boton nivel difícil
        JButton dificil = new JButton("Dificil");
        dificil.setBounds(100,50,90,30);
        dificil.addActionListener(mouseEventHandler());
        content.add(dificil);


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

                    if(Objects.equals(button.getText(), "Facil")){
                        //


                    }else if(Objects.equals(button.getText(), "Intermedio")){
                        //


                    }else if(Objects.equals(button.getText(), "Dificil")){
                        //


                    }
                }
            }
        };
    }

}





