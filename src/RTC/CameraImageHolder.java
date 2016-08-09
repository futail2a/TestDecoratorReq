package RTC;

/**
* RTC/CameraImageHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 13時07分37秒 JST
*/

public final class CameraImageHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.CameraImage value = null;

  public CameraImageHolder ()
  {
  }

  public CameraImageHolder (RTC.CameraImage initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.CameraImageHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.CameraImageHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.CameraImageHelper.type ();
  }

}
