package RTC;


/**
* RTC/TimedStringSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedStringSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data[] = null;

  public TimedStringSeq ()
  {
  } // ctor

  public TimedStringSeq (RTC.Time _tm, String[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedStringSeq
