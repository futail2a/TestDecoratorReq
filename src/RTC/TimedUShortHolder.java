package RTC;

/**
* RTC/TimedUShortHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedUShortHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedUShort value = null;

  public TimedUShortHolder ()
  {
  }

  public TimedUShortHolder (RTC.TimedUShort initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedUShortHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedUShortHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedUShortHelper.type ();
  }

}
