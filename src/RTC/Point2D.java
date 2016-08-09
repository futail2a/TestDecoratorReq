package RTC;


/**
* RTC/Point2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class Point2D implements org.omg.CORBA.portable.IDLEntity
{

  /// X coordinate in metres.
  public double x = (double)0;

  /// Y coordinate in metres.
  public double y = (double)0;

  public Point2D ()
  {
  } // ctor

  public Point2D (double _x, double _y)
  {
    x = _x;
    y = _y;
  } // ctor

} // class Point2D
