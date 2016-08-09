package RTC;


/**
* RTC/Acceleration2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class Acceleration2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Acceleration along the x axis, in metres per second per second.
  public double ax = (double)0;

  /// Acceleration along the y axis, in metres per second per second.
  public double ay = (double)0;

  public Acceleration2D ()
  {
  } // ctor

  public Acceleration2D (double _ax, double _ay)
  {
    ax = _ax;
    ay = _ay;
  } // ctor

} // class Acceleration2D
