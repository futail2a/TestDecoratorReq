package RTC;


/**
* RTC/TimedFloatSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedFloatSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public float data[] = null;

  public TimedFloatSeq ()
  {
  } // ctor

  public TimedFloatSeq (RTC.Time _tm, float[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedFloatSeq
