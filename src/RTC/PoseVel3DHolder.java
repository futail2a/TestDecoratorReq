package RTC;

/**
* RTC/PoseVel3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class PoseVel3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.PoseVel3D value = null;

  public PoseVel3DHolder ()
  {
  }

  public PoseVel3DHolder (RTC.PoseVel3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.PoseVel3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.PoseVel3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.PoseVel3DHelper.type ();
  }

}