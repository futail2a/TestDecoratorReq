package RTC;


/**
* RTC/Waypoint3DListHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/


/*!
     * @typedef Waypoint3DList
     */
abstract public class Waypoint3DListHelper
{
  private static String  _id = "IDL:RTC/Waypoint3DList:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Waypoint3D[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Waypoint3D[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = RTC.Waypoint3DHelper.type ();
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.Waypoint3DListHelper.id (), "Waypoint3DList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.Waypoint3D[] read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Waypoint3D value[] = null;
    int _len0 = istream.read_long ();
    value = new RTC.Waypoint3D[_len0];
    for (int _o1 = 0;_o1 < value.length; ++_o1)
      value[_o1] = RTC.Waypoint3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Waypoint3D[] value)
  {
    ostream.write_long (value.length);
    for (int _i0 = 0;_i0 < value.length; ++_i0)
      RTC.Waypoint3DHelper.write (ostream, value[_i0]);
  }

}