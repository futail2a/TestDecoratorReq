package RTC;


/**
* RTC/TimedShort.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

public final class TimedShort implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public short data = (short)0;

  public TimedShort ()
  {
  } // ctor

  public TimedShort (RTC.Time _tm, short _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedShort
