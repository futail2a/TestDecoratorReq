package RTC;


/**
* RTC/Size2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class Size2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Length in metres.
  public double l = (double)0;

  /// Width in metres.
  public double w = (double)0;

  public Size2D ()
  {
  } // ctor

  public Size2D (double _l, double _w)
  {
    l = _l;
    w = _w;
  } // ctor

} // class Size2D
