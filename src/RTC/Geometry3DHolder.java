package RTC;

/**
* RTC/Geometry3DHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class Geometry3DHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry3D value = null;

  public Geometry3DHolder ()
  {
  }

  public Geometry3DHolder (RTC.Geometry3D initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Geometry3DHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Geometry3DHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Geometry3DHelper.type ();
  }

}