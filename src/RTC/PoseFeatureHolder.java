package RTC;

/**
* RTC/PoseFeatureHolder.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月10日 14時37分13秒 JST
*/

public final class PoseFeatureHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseFeature value = null;

  public PoseFeatureHolder ()
  {
  }

  public PoseFeatureHolder (RTC.PoseFeature initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseFeatureHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseFeatureHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseFeatureHelper.type ();
  }

}
