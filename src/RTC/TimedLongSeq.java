package RTC;


/**
* RTC/TimedLongSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedLongSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public int data[] = null;

  public TimedLongSeq ()
  {
  } // ctor

  public TimedLongSeq (RTC.Time _tm, int[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedLongSeq
