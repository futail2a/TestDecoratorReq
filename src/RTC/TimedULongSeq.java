package RTC;


/**
* RTC/TimedULongSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedULongSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public int data[] = null;

  public TimedULongSeq ()
  {
  } // ctor

  public TimedULongSeq (RTC.Time _tm, int[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedULongSeq
