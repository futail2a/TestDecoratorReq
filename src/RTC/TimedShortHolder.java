package RTC;

/**
* RTC/TimedShortHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedShortHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedShort value = null;

  public TimedShortHolder ()
  {
  }

  public TimedShortHolder (RTC.TimedShort initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedShortHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedShortHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedShortHelper.type ();
  }

}
