package RTC;

/**
* RTC/BumperGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class BumperGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.BumperGeometry value = null;

  public BumperGeometryHolder ()
  {
  }

  public BumperGeometryHolder (RTC.BumperGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.BumperGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.BumperGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.BumperGeometryHelper.type ();
  }

}
