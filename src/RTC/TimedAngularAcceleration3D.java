package RTC;


/**
* RTC/TimedAngularAcceleration3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedAngularAcceleration3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.AngularAcceleration3D data = null;

  public TimedAngularAcceleration3D ()
  {
  } // ctor

  public TimedAngularAcceleration3D (RTC.Time _tm, RTC.AngularAcceleration3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAngularAcceleration3D
