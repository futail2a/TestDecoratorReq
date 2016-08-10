package RTC;


/**
* RTC/INSDataHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

abstract public class INSDataHelper
{
  private static String  _id = "IDL:RTC/INSData:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.INSData that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.INSData extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [7];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[1] = new org.omg.CORBA.StructMember (
            "latitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "longitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "altitude",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[4] = new org.omg.CORBA.StructMember (
            "heightAMSL",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Velocity3DHelper.type ();
          _members0[5] = new org.omg.CORBA.StructMember (
            "velocityENU",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Orientation3DHelper.type ();
          _members0[6] = new org.omg.CORBA.StructMember (
            "orientation",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.INSDataHelper.id (), "INSData", _members0);
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

  public static RTC.INSData read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.INSData value = new RTC.INSData ();
    value.tm = RTC.TimeHelper.read (istream);
    value.latitude = istream.read_double ();
    value.longitude = istream.read_double ();
    value.altitude = istream.read_double ();
    value.heightAMSL = istream.read_double ();
    value.velocityENU = RTC.Velocity3DHelper.read (istream);
    value.orientation = RTC.Orientation3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.INSData value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    ostream.write_double (value.latitude);
    ostream.write_double (value.longitude);
    ostream.write_double (value.altitude);
    ostream.write_double (value.heightAMSL);
    RTC.Velocity3DHelper.write (ostream, value.velocityENU);
    RTC.Orientation3DHelper.write (ostream, value.orientation);
  }

}
