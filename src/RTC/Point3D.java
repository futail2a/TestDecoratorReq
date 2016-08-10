package RTC;


/**
* RTC/Point3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Point3D implements org.omg.CORBA.portable.IDLEntity
{

  /// X coordinate in metres.
  public double x = (double)0;

  /// Y coordinate in metres.
  public double y = (double)0;

  /// Z coordinate in metres.
  public double z = (double)0;

  public Point3D ()
  {
  } // ctor

  public Point3D (double _x, double _y, double _z)
  {
    x = _x;
    y = _y;
    z = _z;
  } // ctor

} // class Point3D
