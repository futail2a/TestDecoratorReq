package RTC;

/**
* RTC/TimedStateHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedStateHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedState value = null;

  public TimedStateHolder ()
  {
  }

  public TimedStateHolder (RTC.TimedState initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedStateHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedStateHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedStateHelper.type ();
  }

}
