package RTC;

/**
* RTC/Geometry3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class Geometry3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry3D value = null;

  public Geometry3DHolder ()
  {
  }

  public Geometry3DHolder (RTC.Geometry3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Geometry3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Geometry3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Geometry3DHelper.type ();
  }

}
