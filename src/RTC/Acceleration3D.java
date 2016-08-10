package RTC;


/**
* RTC/Acceleration3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Acceleration3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Acceleration along the x axis, in metres per second per second.
  public double ax = (double)0;

  /// Acceleration along the y axis, in metres per second per second.
  public double ay = (double)0;

  /// Acceleration along the z axis, in metres per second per second.
  public double az = (double)0;

  public Acceleration3D ()
  {
  } // ctor

  public Acceleration3D (double _ax, double _ay, double _az)
  {
    ax = _ax;
    ay = _ay;
    az = _az;
  } // ctor

} // class Acceleration3D
