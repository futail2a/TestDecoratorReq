package RTC;

/**
* RTC/BumperArrayGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class BumperArrayGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.BumperArrayGeometry value = null;

  public BumperArrayGeometryHolder ()
  {
  }

  public BumperArrayGeometryHolder (RTC.BumperArrayGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.BumperArrayGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.BumperArrayGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.BumperArrayGeometryHelper.type ();
  }

}
