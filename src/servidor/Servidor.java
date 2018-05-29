package servidor;

import org.omg.CosNaming.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;

import sop_corba.*;

public class Servidor {

  public static void main(String args[]) {
    try{
       
      String[] listPar = new String[] {"java", "servidor.ServidorDeObjetos", "-ORBInitialHost", "localhost", "-ORBInitialPort", "2020"};
      ORB orb = ORB.init(listPar, null);
      
      // crea e iniciia el ORB
      //ORB orb = ORB.init(args, null);

      // obtiene la referencia del rootpoa & activate el POAManager
      POA rootpoa = 
      POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
      rootpoa.the_POAManager().activate();

      // crea el servant y lo registra con el ORB
      ServidorImpl convref = new ServidorImpl();
       
      // obtiene la referencia del objeto desde el servant
      org.omg.CORBA.Object obj = 
      rootpoa.servant_to_reference(convref);
      ServidorInt href = ServidorIntHelper.narrow(obj);
	  
      // obtiene la base del contexto de nombrado
      org.omg.CORBA.Object objref =
          orb.resolve_initial_references("NameService");
      // Usa NamingContextExt el cual es parte de la especificacion 
      // Naming Service (INS).
      NamingContextExt ncref = NamingContextExtHelper.narrow(objref);

      // Realiza el binding de la referencia de objeto en el N_S
      String name = "ServidorChat";
      NameComponent path[] = ncref.to_name( name );
      ncref.rebind(path, href);

      System.out.println("El Servidor esta listo y esperando ...");

      // esperan por las invocaciones desde los clientes
      orb.run();
    } 
	
      catch (Exception e) {
        System.err.println("ERROR: " + e);
        e.printStackTrace(System.out);
      }
	  
      System.out.println("Saliendo ...");
	
  }
}
