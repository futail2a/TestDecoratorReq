package RTC;

/**
* RTC/ActArrayGeometryHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

public final class ActArrayGeometryHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayGeometry value = null;

  public ActArrayGeometryHolder ()
  {
  }

  public ActArrayGeometryHolder (RTC.ActArrayGeometry initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayGeometryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayGeometryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayGeometryHelper.type ();
  }

}
