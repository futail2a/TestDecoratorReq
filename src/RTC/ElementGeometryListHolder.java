package RTC;


/**
* RTC/ElementGeometryListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef ElementGeometryList
     */
public final class ElementGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Geometry3D value[] = null;

  public ElementGeometryListHolder ()
  {
  }

  public ElementGeometryListHolder (RTC.Geometry3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ElementGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ElementGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ElementGeometryListHelper.type ();
  }

}
