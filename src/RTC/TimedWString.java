package RTC;


/**
* RTC/TimedWString.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/BasicDataType.idlから
* 2016年8月9日 13時07分36秒 JST
*/

public final class TimedWString implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data = null;

  public TimedWString ()
  {
  } // ctor

  public TimedWString (RTC.Time _tm, String _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWString
