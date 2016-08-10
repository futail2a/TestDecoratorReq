package RTC;


/**
* RTC/GripperStateHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

abstract public class GripperStateHelper
{
  private static String  _id = "IDL:RTC/GripperState:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.GripperState that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.GripperState extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.GripperStatusHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "status",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.GripperStateHelper.id (), "GripperState", _members0);
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

  public static RTC.GripperState read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.GripperState value = new RTC.GripperState ();
    value.tm = RTC.TimeHelper.read (istream);
    value.status = RTC.GripperStatusHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.GripperState value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    RTC.GripperStatusHelper.write (ostream, value.status);
  }

}
