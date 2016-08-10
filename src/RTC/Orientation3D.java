package RTC;


/**
* RTC/Orientation3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Orientation3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Roll angle in radians.
  public double r = (double)0;

  /// Pitch angle in radians.
  public double p = (double)0;

  /// Yaw angle in radians.
  public double y = (double)0;

  public Orientation3D ()
  {
  } // ctor

  public Orientation3D (double _r, double _p, double _y)
  {
    r = _r;
    p = _p;
    y = _y;
  } // ctor

} // class Orientation3D
