package RTC;

/**
* RTC/RangerGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class RangerGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.RangerGeometry value = null;

  public RangerGeometryHolder ()
  {
  }

  public RangerGeometryHolder (RTC.RangerGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.RangerGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.RangerGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.RangerGeometryHelper.type ();
  }

}
