package RTC;


/**
* RTC/TimedCharSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedCharSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public char data[] = null;

  public TimedCharSeq ()
  {
  } // ctor

  public TimedCharSeq (RTC.Time _tm, char[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedCharSeq
