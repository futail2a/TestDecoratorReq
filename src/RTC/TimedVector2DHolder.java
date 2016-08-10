package RTC;

/**
* RTC/TimedVector2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedVector2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedVector2D value = null;

  public TimedVector2DHolder ()
  {
  }

  public TimedVector2DHolder (RTC.TimedVector2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedVector2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedVector2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedVector2DHelper.type ();
  }

}
