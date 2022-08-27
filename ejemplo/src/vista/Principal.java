package vista;
import clases.*;
import controlador.Controlador;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Principal {
    static Controlador cT= new Controlador();
    public static void main(String[] args) {

        TipoDocumento [] td= cT.crearDocumentos();
        Rol [] rol= cT.crearRoles();
        Date date=new Date();
        td[2].setDescripcion("1000100");
        td[0].setDescripcion("20002000");
        //instanciacion de la clase usuario
        Usuario primerUsuario=new Usuario("1","speedCode@gmail.com","1234",td[0],rol[1],date);
        //instanciacion de la clase empresa
        Empresa SpeedCode=new Empresa("1","Cocacola",td[2],"30044287740","carrera 45#99-20",primerUsuario,date);
        primerUsuario.setEmpresa(SpeedCode);
        //instanciacion de la clase transaccion
        Transaccion transaccion=new Transaccion("1","ingreso por caja menor",300F,primerUsuario,date,true);
        String opcion=".";
        JOptionPane.showMessageDialog(null,"bienvido a SpedCode \n" +
                "la informacion de tu usuarios con correo " + primerUsuario.getCorreo() +" fue creada y \n" +
                "la informacio de tu empresa "+SpeedCode.getName()+" fue guardada correctamente");
        while(opcion!="s"){

            opcion=JOptionPane.showInputDialog("digita que deseas hacer \n" +
                    "A-Conocer la informacion de tu usuario\n" +
                    "B-Conocer la informacion de tu empresa\n" +
                    "C-Conocer la informacion de la transaccion incluido el usuario que la realizo \n" +
                    "D-modificar datos de la transaccion \n"+
                    "S-para salir");
            switch(opcion)
            {
                case "A":
                    JOptionPane.showMessageDialog(null,"correo deL usuario: "+primerUsuario.getCorreo()+"\n" +
                            "nombre de la empresa para la que el usuario trabaja: "+primerUsuario.getEmpresa().getName()+"\n"+
                            "la contrase del usuario es "+primerUsuario.getClave());
                    break;
                case "B":
                    JOptionPane.showMessageDialog(null,"nombre de la empresa: "+SpeedCode.getName()+"\n" +
                            "direccion de la empresa: "+SpeedCode.getAddress()+"\n" +
                            "telefono de la empresa: "+SpeedCode.getPhone()+"\n" +
                            "el nit de la empresa es: "+SpeedCode.getTipoDocumentoE().getDescripcion());
                    break;
                case "C":
                    JOptionPane.showMessageDialog(null,"monto de la transaccion: "+transaccion.getAmount()+"\n" +
                            "el concepto de la transaccion es : "+transaccion.getConcepto()+"\n"+
                            "el usuario que hizo la transferencia fue : "+transaccion.getUsuario().getIdUsuario());
                    break;
                case "D":
                    String opcion2=JOptionPane.showInputDialog("que informacion de la transaccion deseas editar \n" +
                            "A-monto del movimiento\n" +
                            "B-concepto del movimineto\n"+
                            "C-Salir");
                    while(opcion2!="S"){
                        switch (opcion2){
                            case "A":
                                float f=Float.parseFloat(JOptionPane.showInputDialog("digite el nuevo valor del movimiento"));
                                transaccion.setAmount(f);
                                JOptionPane.showMessageDialog(null,"cambio realizado");
                                opcion2="S";
                                break;
                            case "B":
                                transaccion.setConcepto(JOptionPane.showInputDialog("Digite el nuevo comentaio que llevara el movimiento"));
                                JOptionPane.showMessageDialog(null,"cambio realizado");
                                opcion2="S";
                                break;
                            case"C":
                                opcion2="S";
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"letra no valida");
                                break;
                        }
                    }

                    break;
                case "S":
                    JOptionPane.showMessageDialog(null,"adios");
                    opcion="s";
                    break;


                default:
                    JOptionPane.showMessageDialog(null,"letra no valida");
                    break;

            }
        }



    }
}
