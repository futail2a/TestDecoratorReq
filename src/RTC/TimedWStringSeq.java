package RTC;


/**
* RTC/TimedWStringSeq.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class TimedWStringSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data[] = null;

  public TimedWStringSeq ()
  {
  } // ctor

  public TimedWStringSeq (RTC.Time _tm, String[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWStringSeq
