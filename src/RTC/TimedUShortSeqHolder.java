package RTC;

/**
* RTC/TimedUShortSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedUShortSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedUShortSeq value = null;

  public TimedUShortSeqHolder ()
  {
  }

  public TimedUShortSeqHolder (RTC.TimedUShortSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedUShortSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedUShortSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedUShortSeqHelper.type ();
  }

}
