package RTC;


/**
* RTC/ActArrayActuatorCurrentHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

abstract public class ActArrayActuatorCurrentHelper
{
  private static String  _id = "IDL:RTC/ActArrayActuatorCurrent:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.ActArrayActuatorCurrent that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.ActArrayActuatorCurrent extract (org.omg.CORBA.Any a)
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
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [3];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = RTC.TimeHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "tm",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_ushort);
          _members0[1] = new org.omg.CORBA.StructMember (
            "index",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "current",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.ActArrayActuatorCurrentHelper.id (), "ActArrayActuatorCurrent", _members0);
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

  public static RTC.ActArrayActuatorCurrent read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.ActArrayActuatorCurrent value = new RTC.ActArrayActuatorCurrent ();
    value.tm = RTC.TimeHelper.read (istream);
    value.index = istream.read_ushort ();
    value.current = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.ActArrayActuatorCurrent value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    ostream.write_ushort (value.index);
    ostream.write_double (value.current);
  }

}
