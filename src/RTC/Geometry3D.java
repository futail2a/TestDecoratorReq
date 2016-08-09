package RTC;


/**
* RTC/Geometry3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 13時07分37秒 JST
*/

public final class Geometry3D implements org.omg.CORBA.portable.IDLEntity
{

  /// coordinate space.
  public RTC.Pose3D pose = null;

  /// Size of the device, taken with the origin at its base point.
  public RTC.Size3D size = null;

  public Geometry3D ()
  {
  } // ctor

  public Geometry3D (RTC.Pose3D _pose, RTC.Size3D _size)
  {
    pose = _pose;
    size = _size;
  } // ctor

} // class Geometry3D
