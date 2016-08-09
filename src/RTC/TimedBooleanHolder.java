package RTC;

/**
* RTC/TimedBooleanHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedBooleanHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedBoolean value = null;

  public TimedBooleanHolder ()
  {
  }

  public TimedBooleanHolder (RTC.TimedBoolean initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedBooleanHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedBooleanHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedBooleanHelper.type ();
  }

}
