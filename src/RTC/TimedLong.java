package RTC;


/**
* RTC/TimedLong.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedLong implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public int data = (int)0;

  public TimedLong ()
  {
  } // ctor

  public TimedLong (RTC.Time _tm, int _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedLong
