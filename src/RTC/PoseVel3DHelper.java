package RTC;


/**
* RTC/PoseVel3DHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/ExtendedDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/

abstract public class PoseVel3DHelper
{
  private static String  _id = "IDL:RTC/PoseVel3D:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.PoseVel3D that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.PoseVel3D extract (org.omg.CORBA.Any a)
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
          _tcOf_members0 = RTC.Pose3DHelper.type ();
          _members0[0] = new org.omg.CORBA.StructMember (
            "pose",
            _tcOf_members0,
            null);
          _tcOf_members0 = RTC.Velocity3DHelper.type ();
          _members0[1] = new org.omg.CORBA.StructMember (
            "velocities",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (RTC.PoseVel3DHelper.id (), "PoseVel3D", _members0);
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

  public static RTC.PoseVel3D read (org.omg.CORBA.portable.InputStream istream)
  {
    RTC.PoseVel3D value = new RTC.PoseVel3D ();
    value.pose = RTC.Pose3DHelper.read (istream);
    value.velocities = RTC.Velocity3DHelper.read (istream);
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.PoseVel3D value)
  {
    RTC.Pose3DHelper.write (ostream, value.pose);
    RTC.Velocity3DHelper.write (ostream, value.velocities);
  }

}
