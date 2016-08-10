package RTC;


/**
* RTC/Size3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Size3D implements org.omg.CORBA.portable.IDLEntity
{

  /// Length in metres.
  public double l = (double)0;

  /// Width in metres.
  public double w = (double)0;

  /// Height in metres.
  public double h = (double)0;

  public Size3D ()
  {
  } // ctor

  public Size3D (double _l, double _w, double _h)
  {
    l = _l;
    w = _w;
    h = _h;
  } // ctor

} // class Size3D
