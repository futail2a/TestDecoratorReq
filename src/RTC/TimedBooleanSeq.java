package RTC;


/**
* RTC/TimedBooleanSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedBooleanSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public boolean data[] = null;

  public TimedBooleanSeq ()
  {
  } // ctor

  public TimedBooleanSeq (RTC.Time _tm, boolean[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedBooleanSeq
