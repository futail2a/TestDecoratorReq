package RTC;


/**
* RTC/TimedSpeedHeading3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedSpeedHeading3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.SpeedHeading3D data = null;

  public TimedSpeedHeading3D ()
  {
  } // ctor

  public TimedSpeedHeading3D (RTC.Time _tm, RTC.SpeedHeading3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedSpeedHeading3D
