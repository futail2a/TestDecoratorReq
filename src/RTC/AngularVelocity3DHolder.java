package RTC;

/**
* RTC/AngularVelocity3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class AngularVelocity3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.AngularVelocity3D value = null;

  public AngularVelocity3DHolder ()
  {
  }

  public AngularVelocity3DHolder (RTC.AngularVelocity3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.AngularVelocity3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.AngularVelocity3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.AngularVelocity3DHelper.type ();
  }

}