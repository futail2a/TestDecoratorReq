package RTC;


/**
* RTC/TimedWStringSeq.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedWStringSeq implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public String data[] = null;

  public TimedWStringSeq ()
  {
  } // ctor

  public TimedWStringSeq (RTC.Time _tm, String[] _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWStringSeq
