package RTC;


/**
* RTC/TimedAngularVelocity3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedAngularVelocity3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.AngularVelocity3D data = null;

  public TimedAngularVelocity3D ()
  {
  } // ctor

  public TimedAngularVelocity3D (RTC.Time _tm, RTC.AngularVelocity3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedAngularVelocity3D
