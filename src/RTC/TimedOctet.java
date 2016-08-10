package RTC;


/**
* RTC/TimedOctet.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月10日 14時37分11秒 JST
*/

public final class TimedOctet implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public byte data = (byte)0;

  public TimedOctet ()
  {
  } // ctor

  public TimedOctet (RTC.Time _tm, byte _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOctet
