package RTC;

/**
* RTC/TimedULongSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedULongSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedULongSeq value = null;

  public TimedULongSeqHolder ()
  {
  }

  public TimedULongSeqHolder (RTC.TimedULongSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedULongSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedULongSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedULongSeqHelper.type ();
  }

}
