package RTC;


/**
* RTC/Path2DHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 13時07分38秒 JST
*/

abstract public class Path2DHelper
{
  private static String  _id = "IDL:RTC/Path2D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Path2D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Path2D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Waypoint2DHelper.type ();
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.Waypoint2DListHelper.id (), "Waypoint2DList", _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "waypoints",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Path2DHelper.id (), "Path2D", _members0);
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

  public static RTC.Path2D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Path2D value = new RTC.Path2D ();
    value.tm = RTC.TimeHelper.read (istream);
    value.waypoints = RTC.Waypoint2DListHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Path2D value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.Waypoint2DListHelper.write (ostream, value.waypoints);
  }

}
