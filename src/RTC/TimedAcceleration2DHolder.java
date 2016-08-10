package RTC;

/**
* RTC/TimedAcceleration2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class TimedAcceleration2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedAcceleration2D value = null;

  public TimedAcceleration2DHolder ()
  {
  }

  public TimedAcceleration2DHolder (RTC.TimedAcceleration2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedAcceleration2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedAcceleration2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedAcceleration2DHelper.type ();
  }

}
