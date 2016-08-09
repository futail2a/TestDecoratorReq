package RTC;

/**
* RTC/TimedOAPHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedOAPHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOAP value = null;

  public TimedOAPHolder ()
  {
  }

  public TimedOAPHolder (RTC.TimedOAP initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOAPHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOAPHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOAPHelper.type ();
  }

}
