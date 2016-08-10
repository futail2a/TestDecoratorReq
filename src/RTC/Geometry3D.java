package RTC;


/**
* RTC/Geometry3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Geometry3D implements org.omg.CORBA.portable.IDLEntity
{

  /// coordinate space.
  public RTC.Pose3D pose = null;

  /// Size of the device, taken with the origin at its base point.
  public RTC.Size3D size = null;

  public Geometry3D ()
  {
  } // ctor

  public Geometry3D (RTC.Pose3D _pose, RTC.Size3D _size)
  {
    pose = _pose;
    size = _size;
  } // ctor

} // class Geometry3D
