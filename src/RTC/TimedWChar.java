package RTC;


/**
* RTC/TimedWChar.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedWChar implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public char data = (char)0;

  public TimedWChar ()
  {
  } // ctor

  public TimedWChar (RTC.Time _tm, char _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedWChar
