package RTC;


/**
* RTC/IntensityListHelper.java .
* IDL-to-Javaコンパイラ(ポータブル)、バージョン"3.2"によって生成されました
* idl/InterfaceDataTypes.idlから
* 2016年8月9日 13時07分38秒 JST
*/


/*!
     * @typedef IntensityList
     */
abstract public class IntensityListHelper
{
  private static String  _id = "IDL:RTC/IntensityList:1.0";

  public static void insert (org.omg.CORBA.Any a, double[] that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static double[] extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
      __typeCode = org.omg.CORBA.ORB.init ().create_sequence_tc (0, __typeCode);
      __typeCode = org.omg.CORBA.ORB.init ().create_alias_tc (RTC.IntensityListHelper.id (), "IntensityList", __typeCode);
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static double[] read (org.omg.CORBA.portable.InputStream istream)
  {
    double value[] = null;
    int _len0 = istream.read_long ();
    value = new double[_len0];
    istream.read_double_array (value, 0, _len0);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, double[] value)
  {
    ostream.write_long (value.length);
    ostream.write_double_array (value, 0, value.length);
  }

}
