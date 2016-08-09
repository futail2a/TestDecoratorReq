package RTC;


/**
* RTC/Path2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class Path2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// The sequence of waypoints that make up the path.
  public RTC.Waypoint2D waypoints[] = null;

  public Path2D ()
  {
  } // ctor

  public Path2D (RTC.Time _tm, RTC.Waypoint2D[] _waypoints)
  {
    tm = _tm;
    waypoints = _waypoints;
  } // ctor

} // class Path2D
