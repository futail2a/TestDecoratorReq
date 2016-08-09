package RTC;

/**
* RTC/Velocity3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 13時07分37秒 JST
*/

public final class Velocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Velocity3D value = null;

  public Velocity3DHolder ()
  {
  }

  public Velocity3DHolder (RTC.Velocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Velocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Velocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Velocity3DHelper.type ();
  }

}
