package RTC;

/**
* RTC/TimedPointCovariance2DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class TimedPointCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPointCovariance2D value = null;

  public TimedPointCovariance2DHolder ()
  {
  }

  public TimedPointCovariance2DHolder (RTC.TimedPointCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPointCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPointCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPointCovariance2DHelper.type ();
  }

}
