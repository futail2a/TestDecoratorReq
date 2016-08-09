package RTC;


/**
* RTC/TimedCarlikeHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/ExtendedDataTypes.idlから
* 2016年8月9日 13時07分37秒 JST
*/

abstract public class TimedCarlikeHelper
{
  private static String  _id = "IDL:RTC/TimedCarlike:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.TimedCarlike that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.TimedCarlike extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.CarlikeHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "data",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.TimedCarlikeHelper.id (), "TimedCarlike", _members0);
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

  public static RTC.TimedCarlike read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.TimedCarlike value = new RTC.TimedCarlike ();
    value.tm = RTC.TimeHelper.read (istream);
    value.data = RTC.CarlikeHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.TimedCarlike value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.CarlikeHelper.write (ostream, value.data);
  }

}
