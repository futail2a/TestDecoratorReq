package RTC;


/**
* RTC/TimedOctetSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedOctetSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public byte data[] = null;

  public TimedOctetSeq ()
  {
  } // ctor

  public TimedOctetSeq (RTC.Time _tm, byte[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedOctetSeq
