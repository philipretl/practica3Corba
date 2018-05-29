/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import sop_corba.ClienteInt;
import sop_corba.ServidorIntPOA;
import sop_corba.ServidorIntPackage.datosUsuario;

/**
 *
 * @author philipretl
 */
public class ServidorImpl extends ServidorIntPOA {
    private ArrayList<ClienteInt> usuarios;
    private ArrayList<String> datosUsuarios;
    
    public ServidorImpl(){
        usuarios = new ArrayList();
        datosUsuarios = new ArrayList();
    }
    
    @Override
    public boolean registrarCliente(ClienteInt objcllbck, String usuario) {
        boolean registro = false;
        
        if(!usuarios.contains(objcllbck)){
            registro= usuarios.add(objcllbck);
            datosUsuarios.add(usuario);
            notificar();
        
        }
        if(registro)
            System.out.println("El usuario" + usuario + "se registro");
        else
            System.out.println("El usuario" + usuario + "no se registro");
        
        return registro;
    }

    @Override
    public void enviarMensaje(String usuario, String mensaje) {
        for(ClienteInt cliente: usuarios)
            cliente.recibirMensaje(usuario, mensaje);
    }

    @Override
    public boolean desconectarCliente(ClienteInt objcllbck, String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public datosUsuario[] obtenerUsuariosConectados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean establecerSesionPriv(String usuario1, String usuario2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarMensajePriv(String us1, String us2, String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void notificar(){
        for(ClienteInt cliente:usuarios){
            cliente.borrarListaDeContactos();
            for(ClienteInt usuario:usuarios){
                if(usuario!=cliente){
                    cliente.recibirContacto(usuario.obtenerNombre());
                }
            }
        
        
        }
    }
    
}
