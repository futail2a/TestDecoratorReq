package RTC;

/**
* RTC/Covariance2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Covariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Covariance2D value = null;

  public Covariance2DHolder ()
  {
  }

  public Covariance2DHolder (RTC.Covariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Covariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Covariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Covariance2DHelper.type ();
  }

}
