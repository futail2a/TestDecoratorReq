package RTC;


/**
* RTC/Path3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class Path3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// The sequence of waypoints that make up the path.
  public RTC.Waypoint3D waypoints[] = null;

  public Path3D ()
  {
  } // ctor

  public Path3D (RTC.Time _tm, RTC.Waypoint3D[] _waypoints)
  {
    tm = _tm;
    waypoints = _waypoints;
  } // ctor

} // class Path3D
