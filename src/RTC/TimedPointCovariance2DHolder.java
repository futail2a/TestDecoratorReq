package RTC;

/**
* RTC/TimedPointCovariance2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPointCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPointCovariance2D value = null;

  public TimedPointCovariance2DHolder ()
  {
  }

  public TimedPointCovariance2DHolder (RTC.TimedPointCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPointCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPointCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPointCovariance2DHelper.type ();
  }

}
