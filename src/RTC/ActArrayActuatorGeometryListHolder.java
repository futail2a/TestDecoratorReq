package RTC;


/**
* RTC/ActArrayActuatorGeometryListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/


/*!
     * @typedef ActArrayActuatorGeometryList
     * @brief List of ActArrayActuatorGeometry elements.
     */
public final class ActArrayActuatorGeometryListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorGeometry value[] = null;

  public ActArrayActuatorGeometryListHolder ()
  {
  }

  public ActArrayActuatorGeometryListHolder (RTC.ActArrayActuatorGeometry[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorGeometryListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorGeometryListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorGeometryListHelper.type ();
  }

}
