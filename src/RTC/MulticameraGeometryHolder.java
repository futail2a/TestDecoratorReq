package RTC;

/**
* RTC/MulticameraGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class MulticameraGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.MulticameraGeometry value = null;

  public MulticameraGeometryHolder ()
  {
  }

  public MulticameraGeometryHolder (RTC.MulticameraGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.MulticameraGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.MulticameraGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.MulticameraGeometryHelper.type ();
  }

}
