package RTC;


/**
* RTC/Quaternion.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Quaternion implements org.omg.CORBA.portable.IDLEntity
{
  public double x = (double)0;
  public double y = (double)0;
  public double z = (double)0;
  public double w = (double)0;

  public Quaternion ()
  {
  } // ctor

  public Quaternion (double _x, double _y, double _z, double _w)
  {
    x = _x;
    y = _y;
    z = _z;
    w = _w;
  } // ctor

} // class Quaternion
