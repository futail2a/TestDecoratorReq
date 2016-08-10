package RTC;

/**
* RTC/TimedCharHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedCharHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedChar value = null;

  public TimedCharHolder ()
  {
  }

  public TimedCharHolder (RTC.TimedChar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCharHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCharHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCharHelper.type ();
  }

}
