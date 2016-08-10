package RTC;


/**
* RTC/TimedStringSeqHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/BasicDataType.idl����
* 2016�N8��10�� 14��37��12�b JST
*/

abstract public class TimedStringSeqHelper
{
  private static String  _id = "IDL:RTC/TimedStringSeq:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.TimedStringSeq that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.TimedStringSeq extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_sequence_tc (0, _tcOf_members0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "data",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.TimedStringSeqHelper.id (), "TimedStringSeq", _members0);
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

  public static RTC.TimedStringSeq read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.TimedStringSeq value = new RTC.TimedStringSeq ();
    value.tm = RTC.TimeHelper.read (istream);
    int _len0 = istream.read_long ();
    value.data = new String[_len0];
    for (int _o1 = 0;_o1 < value.data.length; ++_o1)
      value.data[_o1] = istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.TimedStringSeq value)
  {
    RTC.TimeHelper.write (ostream, value.tm);
    ostream.write_long (value.data.length);
    for (int _i0 = 0;_i0 < value.data.length; ++_i0)
      ostream.write_string (value.data[_i0]);
  }

}
