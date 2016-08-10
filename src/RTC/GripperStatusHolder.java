package RTC;

/**
* RTC/GripperStatusHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum GripperStatus
     * @brief Describes the status of a gripper.
     */
public final class GripperStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.GripperStatus value = null;

  public GripperStatusHolder ()
  {
  }

  public GripperStatusHolder (RTC.GripperStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.GripperStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.GripperStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.GripperStatusHelper.type ();
  }

}
