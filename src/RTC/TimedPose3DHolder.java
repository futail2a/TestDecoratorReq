package RTC;

/**
* RTC/TimedPose3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class TimedPose3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPose3D value = null;

  public TimedPose3DHolder ()
  {
  }

  public TimedPose3DHolder (RTC.TimedPose3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPose3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPose3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPose3DHelper.type ();
  }

}
