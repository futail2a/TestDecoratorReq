package RTC;


/**
* RTC/TimedUShortSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedUShortSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public short data[] = null;

  public TimedUShortSeq ()
  {
  } // ctor

  public TimedUShortSeq (RTC.Time _tm, short[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedUShortSeq
