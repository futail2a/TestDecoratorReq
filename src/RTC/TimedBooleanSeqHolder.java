package RTC;

/**
* RTC/TimedBooleanSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedBooleanSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedBooleanSeq value = null;

  public TimedBooleanSeqHolder ()
  {
  }

  public TimedBooleanSeqHolder (RTC.TimedBooleanSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedBooleanSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedBooleanSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedBooleanSeqHelper.type ();
  }

}
