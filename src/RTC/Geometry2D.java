package RTC;


/**
* RTC/Geometry2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Geometry2D implements org.omg.CORBA.portable.IDLEntity
{

  /// coordinate space.
  public RTC.Pose2D pose = null;

  /// Size of the device, taken with the origin at its base point.
  public RTC.Size2D size = null;

  public Geometry2D ()
  {
  } // ctor

  public Geometry2D (RTC.Pose2D _pose, RTC.Size2D _size)
  {
    pose = _pose;
    size = _size;
  } // ctor

} // class Geometry2D
