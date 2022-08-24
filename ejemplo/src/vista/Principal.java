package vista;
import clases.Rol;
import clases.TipoDocumento;
import clases.Transaccion;
import clases.Usuario;
import controlador.Controlador;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

public class Principal {
    static Controlador cT= new Controlador();
    public static void main(String[] args) {

        TipoDocumento [] td= cT.crearDocumentos();
        Rol [] rol= cT.crearRoles();












        }




}
