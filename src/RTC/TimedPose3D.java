package RTC;


/**
* RTC/TimedPose3D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPose3D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Pose3D data = null;

  public TimedPose3D ()
  {
  } // ctor

  public TimedPose3D (RTC.Time _tm, RTC.Pose3D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPose3D
