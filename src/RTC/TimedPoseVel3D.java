package RTC;


/**
* RTC/TimedPoseVel3D.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月10日 14時37分12秒 JST
*/

public final class TimedPoseVel3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PoseVel3D data = null;

  public TimedPoseVel3D ()
  {
  } // ctor

  public TimedPoseVel3D (RTC.Time _tm, RTC.PoseVel3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoseVel3D
