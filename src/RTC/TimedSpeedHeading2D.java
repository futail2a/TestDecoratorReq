package RTC;


/**
* RTC/TimedSpeedHeading2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedSpeedHeading2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.SpeedHeading2D data = null;

  public TimedSpeedHeading2D ()
  {
  } // ctor

  public TimedSpeedHeading2D (RTC.Time _tm, RTC.SpeedHeading2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSpeedHeading2D
