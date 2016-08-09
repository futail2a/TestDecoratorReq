package RTC;


/**
* RTC/PoseVel3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class PoseVel3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Pose3D pose = null;
  public RTC.Velocity3D velocities = null;

  public PoseVel3D ()
  {
  } // ctor

  public PoseVel3D (RTC.Pose3D _pose, RTC.Velocity3D _velocities)
  {
    pose = _pose;
    velocities = _velocities;
  } // ctor

} // class PoseVel3D
