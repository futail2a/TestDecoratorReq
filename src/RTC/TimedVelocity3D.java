package RTC;


/**
* RTC/TimedVelocity3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedVelocity3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Velocity3D data = null;

  public TimedVelocity3D ()
  {
  } // ctor

  public TimedVelocity3D (RTC.Time _tm, RTC.Velocity3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedVelocity3D
