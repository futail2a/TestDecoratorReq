package RTC;


/**
* RTC/TimedBoolean.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedBoolean implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public boolean data = false;

  public TimedBoolean ()
  {
  } // ctor

  public TimedBoolean (RTC.Time _tm, boolean _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedBoolean
