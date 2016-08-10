package RTC;


/**
* RTC/Vector2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Vector2D implements org.omg.CORBA.portable.IDLEntity
{

  /// X value in metres.
  public double x = (double)0;

  /// Y value in metres.
  public double y = (double)0;

  public Vector2D ()
  {
  } // ctor

  public Vector2D (double _x, double _y)
  {
    x = _x;
    y = _y;
  } // ctor

} // class Vector2D
