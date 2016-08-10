package RTC;


/**
* RTC/Carlike.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Carlike implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Steering angle in radians.
  public double steeringAngle = (double)0;

  public Carlike ()
  {
  } // ctor

  public Carlike (double _speed, double _steeringAngle)
  {
    speed = _speed;
    steeringAngle = _steeringAngle;
  } // ctor

} // class Carlike
