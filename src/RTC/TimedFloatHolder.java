package RTC;

/**
* RTC/TimedFloatHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月10日 14時37分11秒 JST
*/

public final class TimedFloatHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedFloat value = null;

  public TimedFloatHolder ()
  {
  }

  public TimedFloatHolder (RTC.TimedFloat initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedFloatHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedFloatHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedFloatHelper.type ();
  }

}
