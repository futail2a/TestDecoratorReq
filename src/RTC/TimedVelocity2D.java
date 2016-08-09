package RTC;


/**
* RTC/TimedVelocity2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedVelocity2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Velocity2D data = null;

  public TimedVelocity2D ()
  {
  } // ctor

  public TimedVelocity2D (RTC.Time _tm, RTC.Velocity2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVelocity2D
