package RTC;

/**
* RTC/TimedWStringSeqHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedWStringSeqHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedWStringSeq value = null;

  public TimedWStringSeqHolder ()
  {
  }

  public TimedWStringSeqHolder (RTC.TimedWStringSeq initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedWStringSeqHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedWStringSeqHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedWStringSeqHelper.type ();
  }

}
