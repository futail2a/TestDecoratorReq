package RTC;


/**
* RTC/TimedPoseVel2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedPoseVel2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.PoseVel2D data = null;

  public TimedPoseVel2D ()
  {
  } // ctor

  public TimedPoseVel2D (RTC.Time _tm, RTC.PoseVel2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPoseVel2D
