package RTC;

/**
* RTC/TimedDoubleHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedDoubleHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedDouble value = null;

  public TimedDoubleHolder ()
  {
  }

  public TimedDoubleHolder (RTC.TimedDouble initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedDoubleHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedDoubleHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedDoubleHelper.type ();
  }

}
