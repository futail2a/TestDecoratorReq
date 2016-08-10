package RTC;

/**
* RTC/TimedPose2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class TimedPose2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.TimedPose2D value = null;

  public TimedPose2DHolder ()
  {
  }

  public TimedPose2DHolder (RTC.TimedPose2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.TimedPose2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.TimedPose2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.TimedPose2DHelper.type ();
  }

}
