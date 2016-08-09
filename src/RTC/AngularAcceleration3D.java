package RTC;


/**
* RTC/AngularAcceleration3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class AngularAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Acceleration around the x axis, in radians per second per second.
  public double aax = (double)0;

  /// Acceleration around the y axis, in radians per second per second.
  public double aay = (double)0;

  /// Acceleration around the z axis, in radians per second per second.
  public double aaz = (double)0;

  public AngularAcceleration3D ()
  {
  } // ctor

  public AngularAcceleration3D (double _aax, double _aay, double _aaz)
  {
    aax = _aax;
    aay = _aay;
    aaz = _aaz;
  } // ctor

} // class AngularAcceleration3D
