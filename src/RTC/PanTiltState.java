package RTC;


/**
* RTC/PanTiltState.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class PanTiltState implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Pan and tilt angles.
  public RTC.PanTiltAngles angles = null;

  /// Speed at which the pan-tilt unit is changing its pan angle in radians per second.
  public double panSpeed = (double)0;

  /// Speed at which the pan-tilt unit is changing its tilt angle in radians per second.
  public double tiltSpeed = (double)0;

  public PanTiltState ()
  {
  } // ctor

  public PanTiltState (RTC.Time _tm, RTC.PanTiltAngles _angles, double _panSpeed, double _tiltSpeed)
  {
    tm = _tm;
    angles = _angles;
    panSpeed = _panSpeed;
    tiltSpeed = _tiltSpeed;
  } // ctor

} // class PanTiltState
