package RTC;

/**
* RTC/TimedLongHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedLongHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedLong value = null;

  public TimedLongHolder ()
  {
  }

  public TimedLongHolder (RTC.TimedLong initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedLongHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedLongHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedLongHelper.type ();
  }

}
