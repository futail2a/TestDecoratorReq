package RTC;

/**
* RTC/SpeedHeading3DHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class SpeedHeading3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.SpeedHeading3D value = null;

  public SpeedHeading3DHolder ()
  {
  }

  public SpeedHeading3DHolder (RTC.SpeedHeading3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.SpeedHeading3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.SpeedHeading3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.SpeedHeading3DHelper.type ();
  }

}
