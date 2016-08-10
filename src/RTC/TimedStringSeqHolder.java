package RTC;

/**
* RTC/TimedStringSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedStringSeq value = null;

  public TimedStringSeqHolder ()
  {
  }

  public TimedStringSeqHolder (RTC.TimedStringSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedStringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedStringSeqHelper.type ();
  }

}
