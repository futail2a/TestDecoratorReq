package RTC;


/**
* RTC/TimedState.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class TimedState implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public short data = (short)0;

  public TimedState ()
  {
  } // ctor

  public TimedState (RTC.Time _tm, short _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedState
