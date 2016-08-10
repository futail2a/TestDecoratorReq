package RTC;

/**
* RTC/TimedOctetSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedOctetSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedOctetSeq value = null;

  public TimedOctetSeqHolder ()
  {
  }

  public TimedOctetSeqHolder (RTC.TimedOctetSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedOctetSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedOctetSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedOctetSeqHelper.type ();
  }

}
