package RTC;

/**
* RTC/TimedVelocity2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 13時07分37秒 JST
*/

public final class TimedVelocity2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVelocity2D value = null;

  public TimedVelocity2DHolder ()
  {
  }

  public TimedVelocity2DHolder (RTC.TimedVelocity2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVelocity2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVelocity2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVelocity2DHelper.type ();
  }

}
