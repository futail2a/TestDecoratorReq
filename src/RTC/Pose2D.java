package RTC;


/**
* RTC/Pose2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Pose2D implements org.omg.CORBA.portable.IDLEntity
{

  /// 2D position.
  public RTC.Point2D position = null;

  /// Heading in radians.
  public double heading = (double)0;

  public Pose2D ()
  {
  } // ctor

  public Pose2D (RTC.Point2D _position, double _heading)
  {
    position = _position;
    heading = _heading;
  } // ctor

} // class Pose2D
