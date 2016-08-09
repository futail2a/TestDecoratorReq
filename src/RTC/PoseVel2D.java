package RTC;


/**
* RTC/PoseVel2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class PoseVel2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Pose2D pose = null;
  public RTC.Velocity2D velocities = null;

  public PoseVel2D ()
  {
  } // ctor

  public PoseVel2D (RTC.Pose2D _pose, RTC.Velocity2D _velocities)
  {
    pose = _pose;
    velocities = _velocities;
  } // ctor

} // class PoseVel2D
