package RTC;

/**
* RTC/TimedCarlikeHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedCarlikeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedCarlike value = null;

  public TimedCarlikeHolder ()
  {
  }

  public TimedCarlikeHolder (RTC.TimedCarlike initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedCarlikeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedCarlikeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedCarlikeHelper.type ();
  }

}
