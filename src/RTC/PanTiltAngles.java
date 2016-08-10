package RTC;


/**
* RTC/PanTiltAngles.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class PanTiltAngles implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Pan value in radians.
  public double pan = (double)0;

  /// Tilt value in radians.
  public double tilt = (double)0;

  public PanTiltAngles ()
  {
  } // ctor

  public PanTiltAngles (RTC.Time _tm, double _pan, double _tilt)
  {
    tm = _tm;
    pan = _pan;
    tilt = _tilt;
  } // ctor

} // class PanTiltAngles
