package RTC;


/**
* RTC/TimedWCharSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedWCharSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public char data[] = null;

  public TimedWCharSeq ()
  {
  } // ctor

  public TimedWCharSeq (RTC.Time _tm, char[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWCharSeq
