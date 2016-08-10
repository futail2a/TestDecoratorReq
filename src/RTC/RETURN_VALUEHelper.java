package RTC;


/**
* RTC/RETURN_VALUEHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/MobileRobot.idl����
* 2016�N8��10�� 14��37��11�b JST
*/

abstract public class RETURN_VALUEHelper
{
  private static String  _id = "IDL:RTC/RETURN_VALUE:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.RETURN_VALUE that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.RETURN_VALUE extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.RETURN_VALUEHelper.id (), "RETURN_VALUE", new String[] { "RETVAL_OK", "RETVAL_INVALID_PARAMETER", "RETVAL_EMPTY_MAP", "RETVAL_INVALID_PRECONDITION", "RETVAL_NOT_IMPL", "RETVAL_UNKNOWN_ERROR", "RETVAL_NOT_FOUND", "RETVAL_ODOMETRY_INVALID_VALUE", "RETVAL_ODOMETRY_TIME_OUT", "RETVAL_RANGE_INVALID_VALUE", "RETVAL_RANGE_TIME_OUT", "RETVAL_EMERGENCY_STOP", "RETVAL_OUTOF_RANGE"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.RETURN_VALUE read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.RETURN_VALUE.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.RETURN_VALUE value)
  {
    ostream.write_long (value.value ());
  }

}
