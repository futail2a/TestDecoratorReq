package RTC;


/**
* RTC/ActArrayActuatorTypeHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/


/*!
     * @enum ActArrayActuatorType
     * @brief Describes the type of an actuator.
     */
abstract public class ActArrayActuatorTypeHelper
{
  private static String  _id = "IDL:RTC/ActArrayActuatorType:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.ActArrayActuatorType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.ActArrayActuatorType extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.ActArrayActuatorTypeHelper.id (), "ActArrayActuatorType", new String[] { "ACTARRAY_ACTUATORTYPE_LINEAR", "ACTARRAY_ACTUATORTYPE_ROTARY"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.ActArrayActuatorType read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.ActArrayActuatorType.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.ActArrayActuatorType value)
  {
    ostream.write_long (value.value ());
  }

}
