package RTC;


/**
* RTC/Velocity2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Velocity2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Velocity along the x axis in metres per second.
  public double vx = (double)0;

  /// Velocity along the y axis in metres per second.
  public double vy = (double)0;

  /// Yaw velocity in radians per second.
  public double va = (double)0;

  public Velocity2D ()
  {
  } // ctor

  public Velocity2D (double _vx, double _vy, double _va)
  {
    vx = _vx;
    vy = _vy;
    va = _va;
  } // ctor

} // class Velocity2D
