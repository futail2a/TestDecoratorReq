package RTC;

/**
* RTC/TimedPoseVel3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedPoseVel3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPoseVel3D value = null;

  public TimedPoseVel3DHolder ()
  {
  }

  public TimedPoseVel3DHolder (RTC.TimedPoseVel3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPoseVel3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPoseVel3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPoseVel3DHelper.type ();
  }

}
