package RTC;


/**
* RTC/TimedPose2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedPose2D implements org.omg.CORBA.portable.IDLEntity
{
  public RTC.Time tm = null;
  public RTC.Pose2D data = null;

  public TimedPose2D ()
  {
  } // ctor

  public TimedPose2D (RTC.Time _tm, RTC.Pose2D _data)
  {
    tm = _tm;
    data = _data;
  } // ctor

} // class TimedPose2D
