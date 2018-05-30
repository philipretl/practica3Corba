/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import org.omg.CORBA.Context;
import org.omg.CORBA.ContextList;
import org.omg.CORBA.DomainManager;
import org.omg.CORBA.ExceptionList;
import org.omg.CORBA.NVList;
import org.omg.CORBA.NamedValue;
import org.omg.CORBA.Object;
import org.omg.CORBA.Policy;
import org.omg.CORBA.Request;
import org.omg.CORBA.SetOverrideType;
import sop_corba.ClienteInt;
import sop_corba.ClienteIntPOA;

/**
 *
 * @author philipretl
 */
public class ClienteImpl extends ClienteIntPOA{
    private GuiCliente gui;
    ClienteImpl(GuiCliente gui) {
        this.gui=gui;
        
    }

    @Override
    public void recibirMensaje(String usuario, String mensaje) {
        gui.fijarTexto(usuario, mensaje);
    }

    @Override
    public void establecerSesionPrivada(String usuario) {
        gui.establecerPrivada(usuario);
    }

    @Override
    public void recibirMensajePrivado(String usuario, String mensaje) {
       gui.recibirMensaje(usuario, mensaje);
    }

    @Override
    public void recibirContacto(String usuario) {
        gui.fijarContacto(usuario);
    }

    @Override
    public String obtenerNombre() {
      String nombre = gui.obtenerNombre();
      return nombre;
    }

    @Override
    public void borrarListaDeContactos() {
        gui.borrarLista();
    }

   
}
