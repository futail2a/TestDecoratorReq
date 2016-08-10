package RTC;

/**
* RTC/FiducialFOVHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月10日 14時37分13秒 JST
*/

public final class FiducialFOVHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.FiducialFOV value = null;

  public FiducialFOVHolder ()
  {
  }

  public FiducialFOVHolder (RTC.FiducialFOV initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.FiducialFOVHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.FiducialFOVHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.FiducialFOVHelper.type ();
  }

}
