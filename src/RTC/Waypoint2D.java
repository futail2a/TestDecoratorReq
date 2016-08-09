package RTC;


/**
* RTC/Waypoint2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class Waypoint2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Location of the waypoint.
  public RTC.Pose2D target = null;

  /// How far away from the waypoint is considered success (radius in metres).
  public double distanceTolerance = (double)0;

  /// How much off the target heading is considered success (in radians).
  public double headingTolerance = (double)0;

  /// Target time to arrive at the waypoint by.
  public RTC.Time timeLimit = null;

  /// Maximum sped to travel at while heading to the waypoint.
  public RTC.Velocity2D maxSpeed = null;

  public Waypoint2D ()
  {
  } // ctor

  public Waypoint2D (RTC.Pose2D _target, double _distanceTolerance, double _headingTolerance, RTC.Time _timeLimit, RTC.Velocity2D _maxSpeed)
  {
    target = _target;
    distanceTolerance = _distanceTolerance;
    headingTolerance = _headingTolerance;
    timeLimit = _timeLimit;
    maxSpeed = _maxSpeed;
  } // ctor

} // class Waypoint2D
