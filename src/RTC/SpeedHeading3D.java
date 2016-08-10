package RTC;


/**
* RTC/SpeedHeading3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class SpeedHeading3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Speed in metres per second.
  public double speed = (double)0;

  /// Direction of travel.
  public RTC.Orientation3D direction = null;

  public SpeedHeading3D ()
  {
  } // ctor

  public SpeedHeading3D (double _speed, RTC.Orientation3D _direction)
  {
    speed = _speed;
    direction = _direction;
  } // ctor

} // class SpeedHeading3D
