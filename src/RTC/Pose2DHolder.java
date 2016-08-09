package RTC;

/**
* RTC/Pose2DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��36�b JST
*/

public final class Pose2DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Pose2D value = null;

  public Pose2DHolder ()
  {
  }

  public Pose2DHolder (RTC.Pose2D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Pose2DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Pose2DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Pose2DHelper.type ();
  }

}
