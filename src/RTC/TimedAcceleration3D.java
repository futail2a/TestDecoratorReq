package RTC;


/**
* RTC/TimedAcceleration3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Acceleration3D data = null;

  public TimedAcceleration3D ()
  {
  } // ctor

  public TimedAcceleration3D (RTC.Time _tm, RTC.Acceleration3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAcceleration3D
