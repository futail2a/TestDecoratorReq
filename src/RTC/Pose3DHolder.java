package RTC;

/**
* RTC/Pose3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

public final class Pose3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Pose3D value = null;

  public Pose3DHolder ()
  {
  }

  public Pose3DHolder (RTC.Pose3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Pose3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Pose3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Pose3DHelper.type ();
  }

}
