package RTC;


/**
* RTC/AngularVelocity3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class AngularVelocity3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Velocity around the x axis, in radians per second.
  public double avx = (double)0;

  /// Velocity around the y axis, in radians per second.
  public double avy = (double)0;

  /// Velocity around the z axis, in radians per second.
  public double avz = (double)0;

  public AngularVelocity3D ()
  {
  } // ctor

  public AngularVelocity3D (double _avx, double _avy, double _avz)
  {
    avx = _avx;
    avy = _avy;
    avz = _avz;
  } // ctor

} // class AngularVelocity3D
