/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.RegistroEstudiante;
import vista.GUIEstudiante;
import vista.GUISIRES;

/**
 *
 * @author aaronn
 */
public class ControlSIRES implements ActionListener {
    
    private RegistroEstudiante registroEstudiante;
    
    public ControlSIRES(){
        registroEstudiante=new RegistroEstudiante();
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_SALIR)) {
            System.exit(0);
        }
        if (evento.getActionCommand().equalsIgnoreCase(GUISIRES.MNI_REGISTRO_ESTUDIANTES)) {
            GUIEstudiante guiEstudiante = new GUIEstudiante(registroEstudiante);
            guiEstudiante.show();
        }

    }

}
