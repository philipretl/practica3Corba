package sop_corba.ServidorIntPackage;


/**
* sop_corba/ServidorIntPackage/ListUsuariosHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from interfaz.idl
* martes 29 de mayo de 2018 07H47' COT
*/

public final class ListUsuariosHolder implements org.omg.CORBA.portable.Streamable
{
  public sop_corba.ServidorIntPackage.datosUsuario value[] = null;

  public ListUsuariosHolder ()
  {
  }

  public ListUsuariosHolder (sop_corba.ServidorIntPackage.datosUsuario[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = sop_corba.ServidorIntPackage.ListUsuariosHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
        sop_corba.ServidorIntPackage.ListUsuariosHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return sop_corba.ServidorIntPackage.ListUsuariosHelper.type ();
  }

}
