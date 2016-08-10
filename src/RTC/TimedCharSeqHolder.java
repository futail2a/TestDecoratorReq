package RTC;

/**
* RTC/TimedCharSeqHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月10日 14時37分11秒 JST
*/

public final class TimedCharSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCharSeq value = null;

  public TimedCharSeqHolder ()
  {
  }

  public TimedCharSeqHolder (RTC.TimedCharSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCharSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCharSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCharSeqHelper.type ();
  }

}
