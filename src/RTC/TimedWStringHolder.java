package RTC;

/**
* RTC/TimedWStringHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedWStringHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWString value = null;

  public TimedWStringHolder ()
  {
  }

  public TimedWStringHolder (RTC.TimedWString initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWStringHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWStringHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWStringHelper.type ();
  }

}
