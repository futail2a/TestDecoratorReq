package RTC;


/**
* RTC/SpeedHeading2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class SpeedHeading2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Direction of travel in radians from the x axis.
  public double heading = (double)0;

  public SpeedHeading2D ()
  {
  } // ctor

  public SpeedHeading2D (double _speed, double _heading)
  {
    speed = _speed;
    heading = _heading;
  } // ctor

} // class SpeedHeading2D
