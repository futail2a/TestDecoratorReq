package RTC;


/**
* RTC/CameraInfo.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class CameraInfo implements org.omg.CORBA.portable.IDLEntity
{

  /// Focal length (x, y) in metres.
  public RTC.Vector2D focalLength = null;

  /// Principal point of the camera.
  public RTC.Point2D principalPoint = null;

  /// Radial distortion coefficient 1.
  public double k1 = (double)0;

  /// Radial distortion coefficient 2.
  public double k2 = (double)0;

  /// Tangential distortion coefficient 1.
  public double p1 = (double)0;

  /// Tangential distortion coefficient 2.
  public double p2 = (double)0;

  public CameraInfo ()
  {
  } // ctor

  public CameraInfo (RTC.Vector2D _focalLength, RTC.Point2D _principalPoint, double _k1, double _k2, double _p1, double _p2)
  {
    focalLength = _focalLength;
    principalPoint = _principalPoint;
    k1 = _k1;
    k2 = _k2;
    p1 = _p1;
    p2 = _p2;
  } // ctor

} // class CameraInfo
