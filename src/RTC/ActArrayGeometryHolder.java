package RTC;

/**
* RTC/ActArrayGeometryHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月10日 14時37分13秒 JST
*/

public final class ActArrayGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayGeometry value = null;

  public ActArrayGeometryHolder ()
  {
  }

  public ActArrayGeometryHolder (RTC.ActArrayGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayGeometryHelper.type ();
  }

}
