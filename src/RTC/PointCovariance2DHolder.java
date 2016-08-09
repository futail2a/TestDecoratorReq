package RTC;

/**
* RTC/PointCovariance2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class PointCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PointCovariance2D value = null;

  public PointCovariance2DHolder ()
  {
  }

  public PointCovariance2DHolder (RTC.PointCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PointCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PointCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PointCovariance2DHelper.type ();
  }

}
