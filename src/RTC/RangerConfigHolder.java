package RTC;

/**
* RTC/RangerConfigHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月10日 14時37分13秒 JST
*/

public final class RangerConfigHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangerConfig value = null;

  public RangerConfigHolder ()
  {
  }

  public RangerConfigHolder (RTC.RangerConfig initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangerConfigHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangerConfigHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangerConfigHelper.type ();
  }

}
