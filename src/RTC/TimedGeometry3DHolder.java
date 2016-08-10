package RTC;

/**
* RTC/TimedGeometry3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class TimedGeometry3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedGeometry3D value = null;

  public TimedGeometry3DHolder ()
  {
  }

  public TimedGeometry3DHolder (RTC.TimedGeometry3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedGeometry3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedGeometry3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedGeometry3DHelper.type ();
  }

}
