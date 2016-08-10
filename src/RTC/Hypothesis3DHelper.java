package RTC;


/**
* RTC/Hypothesis3DHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

abstract public class Hypothesis3DHelper
{
  private static String  _id = "IDL:RTC/Hypothesis3D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.Hypothesis3D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.Hypothesis3D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Pose3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "mean",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Covariance3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "covariance",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[2] = new org.omg.CORBA.StructMember (
            "weight",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.Hypothesis3DHelper.id (), "Hypothesis3D", _members0);
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

  public static RTC.Hypothesis3D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.Hypothesis3D value = new RTC.Hypothesis3D ();
    value.mean = RTC.Pose3DHelper.read (istream);
    value.covariance = RTC.Covariance3DHelper.read (istream);
    value.weight = istream.read_double ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.Hypothesis3D value)
  {
    RTC.Pose3DHelper.write (ostream, value.mean);
    RTC.Covariance3DHelper.write (ostream, value.covariance);
    ostream.write_double (value.weight);
  }

}
