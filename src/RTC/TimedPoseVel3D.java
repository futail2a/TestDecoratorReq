package RTC;


/**
* RTC/TimedPoseVel3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPoseVel3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PoseVel3D data = null;

  public TimedPoseVel3D ()
  {
  } // ctor

  public TimedPoseVel3D (RTC.Time _tm, RTC.PoseVel3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoseVel3D
