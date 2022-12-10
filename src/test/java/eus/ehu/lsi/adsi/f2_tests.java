package eus.ehu.lsi.adsi;

import com.visual.GestorPaneles;
import com.visual.funcionalidad2.Interfaz2_1;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class f2_tests {

    public static void main(String arg[]){
        GestorPaneles.getInstance().bind(new Interfaz2_1());


    }

}
