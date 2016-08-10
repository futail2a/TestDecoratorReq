package RTC;


/**
* RTC/Pose3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Pose3D implements org.omg.CORBA.portable.IDLEntity
{

  /// 3D position.
  public RTC.Point3D position = null;

  /// 3D orientation.
  public RTC.Orientation3D orientation = null;

  public Pose3D ()
  {
  } // ctor

  public Pose3D (RTC.Point3D _position, RTC.Orientation3D _orientation)
  {
    position = _position;
    orientation = _orientation;
  } // ctor

} // class Pose3D
