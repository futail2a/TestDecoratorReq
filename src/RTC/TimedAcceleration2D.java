package RTC;


/**
* RTC/TimedAcceleration2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedAcceleration2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Acceleration2D data = null;

  public TimedAcceleration2D ()
  {
  } // ctor

  public TimedAcceleration2D (RTC.Time _tm, RTC.Acceleration2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAcceleration2D
