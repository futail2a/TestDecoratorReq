package RTC;

/**
* RTC/TimedCovariance2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedCovariance2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCovariance2D value = null;

  public TimedCovariance2DHolder ()
  {
  }

  public TimedCovariance2DHolder (RTC.TimedCovariance2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCovariance2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCovariance2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCovariance2DHelper.type ();
  }

}
