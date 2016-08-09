package RTC;


/**
* RTC/MulticameraGeometryHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

abstract public class MulticameraGeometryHelper
{
  private static String  _id = "IDL:RTC/MulticameraGeometry:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.MulticameraGeometry that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.MulticameraGeometry extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.MulticameraGeometryListHelper.id (), "MulticameraGeometryList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "cameraGeometries",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.MulticameraGeometryHelper.id (), "MulticameraGeometry", _members0);
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

  public static RTC.MulticameraGeometry read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.MulticameraGeometry value = new RTC.MulticameraGeometry ();
    value.geometry = RTC.Geometry3DHelper.read (istream);
    value.cameraGeometries = RTC.MulticameraGeometryListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.MulticameraGeometry value)
  {
    RTC.Geometry3DHelper.write (ostream, value.geometry);
    RTC.MulticameraGeometryListHelper.write (ostream, value.cameraGeometries);
  }

}
