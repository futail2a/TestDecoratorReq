package RTC;


/**
* RTC/LimbStatusHelper.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum LimbStatus
     */
abstract public class LimbStatusHelper
{
  private static String  _id = "IDL:RTC/LimbStatus:1.0";

  public static void insert (org.omg.CORBA.Any a, RTC.LimbStatus that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static RTC.LimbStatus extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (RTC.LimbStatusHelper.id (), "LimbStatus", new String[] { "LIMB_STATUS_IDLE", "LIMB_STATUS_BRAKED", "LIMB_STATUS_MOVING", "LIMB_STATUS_OOR", "LIMB_STATUS_COLLISION"} );
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static RTC.LimbStatus read (org.omg.CORBA.portable.InputStream istream)
  {
    return RTC.LimbStatus.from_int (istream.read_long ());
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, RTC.LimbStatus value)
  {
    ostream.write_long (value.value ());
  }

}
