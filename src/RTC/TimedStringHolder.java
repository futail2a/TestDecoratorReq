package RTC;

/**
* RTC/TimedStringHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedStringHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedString value = null;

  public TimedStringHolder ()
  {
  }

  public TimedStringHolder (RTC.TimedString initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedStringHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedStringHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedStringHelper.type ();
  }

}
