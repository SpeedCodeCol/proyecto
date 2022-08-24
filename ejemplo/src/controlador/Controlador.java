package controlador;

import clases.*;

public class Controlador {
    public TipoDocumento[] crearDocumentos(){
        TipoDocumento nuevo=new TipoDocumento(1,"Cedula de ciudadania","C.C");
        TipoDocumento nuevo2=new TipoDocumento(2,"Pasaporte","P");
        TipoDocumento nuevo3=new TipoDocumento(3,"RUT","RUT");
        TipoDocumento[] td={nuevo,nuevo2,nuevo3};
        return td;
    }
    public Rol[] crearRoles(){
        Rol nuevo=new Rol(1,"administrador");
        Rol nuevo2=new Rol(2,"empleado");
        Rol [] rol={nuevo,nuevo2};
        return rol;
    }

}
