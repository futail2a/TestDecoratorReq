package RTC;

/**
* RTC/TimedWCharHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedWCharHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWChar value = null;

  public TimedWCharHolder ()
  {
  }

  public TimedWCharHolder (RTC.TimedWChar initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWCharHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWCharHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWCharHelper.type ();
  }

}
