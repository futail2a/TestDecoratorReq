package RTC;

/**
* RTC/Vector3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class Vector3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Vector3D value = null;

  public Vector3DHolder ()
  {
  }

  public Vector3DHolder (RTC.Vector3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Vector3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Vector3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Vector3DHelper.type ();
  }

}
