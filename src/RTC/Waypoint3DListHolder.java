package RTC;


/**
* RTC/Waypoint3DListHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef Waypoint3DList
     */
public final class Waypoint3DListHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Waypoint3D value[] = null;

  public Waypoint3DListHolder ()
  {
  }

  public Waypoint3DListHolder (RTC.Waypoint3D[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.Waypoint3DListHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.Waypoint3DListHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.Waypoint3DListHelper.type ();
  }

}
