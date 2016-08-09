package RTC;


/**
* RTC/BumperGeometryListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/


/*!
     * @typedef BumperGeometryList
     */
public final class BumperGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.BumperGeometry value[] = null;

  public BumperGeometryListHolder ()
  {
  }

  public BumperGeometryListHolder (RTC.BumperGeometry[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.BumperGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.BumperGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.BumperGeometryListHelper.type ();
  }

}
