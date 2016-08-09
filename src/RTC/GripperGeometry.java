package RTC;


/**
* RTC/GripperGeometry.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class GripperGeometry implements org.omg.CORBA.portable.IDLEntity
{

  /// Geometry of the exterior of the gripper when open, in parent coordinate space.
  public RTC.Geometry3D exterior = null;

  /// Geometry of the interior of the gripper when open, in gripper coordinate space.
  public RTC.Geometry3D interior = null;

  public GripperGeometry ()
  {
  } // ctor

  public GripperGeometry (RTC.Geometry3D _exterior, RTC.Geometry3D _interior)
  {
    exterior = _exterior;
    interior = _interior;
  } // ctor

} // class GripperGeometry
