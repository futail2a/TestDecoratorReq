package RTC;

/**
* RTC/GripperGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class GripperGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GripperGeometry value = null;

  public GripperGeometryHolder ()
  {
  }

  public GripperGeometryHolder (RTC.GripperGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GripperGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GripperGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GripperGeometryHelper.type ();
  }

}
