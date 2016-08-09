package RTC;


/**
* RTC/RangerGeometryHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

abstract public class RangerGeometryHelper
{
  private static String  _id = "IDL:RTC/RangerGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.RangerGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.RangerGeometry extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.Geometry3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "geometry",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Geometry3DHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.ElementGeometryListHelper.id (), "ElementGeometryList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "elementGeometries",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.RangerGeometryHelper.id (), "RangerGeometry", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.RangerGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.RangerGeometry value = new RTC.RangerGeometry ();
    value.geometry = RTC.Geometry3DHelper.read (istream);
    value.elementGeometries = RTC.ElementGeometryListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.RangerGeometry value)
  {
    RTC.Geometry3DHelper.write (ostream, value.geometry);
    RTC.ElementGeometryListHelper.write (ostream, value.elementGeometries);
  }

}
