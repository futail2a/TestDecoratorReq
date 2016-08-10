package RTC;


/**
* RTC/GripperStatus.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum GripperStatus
     * @brief Describes the status of a gripper.
     */
public class GripperStatus implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static RTC.GripperStatus[] __array = new RTC.GripperStatus [__size];

  public static final int _GRIPPER_STATE_OPEN = 0;
  public static final RTC.GripperStatus GRIPPER_STATE_OPEN = new RTC.GripperStatus(_GRIPPER_STATE_OPEN);
  public static final int _GRIPPER_STATE_CLOSED = 1;
  public static final RTC.GripperStatus GRIPPER_STATE_CLOSED = new RTC.GripperStatus(_GRIPPER_STATE_CLOSED);
  public static final int _GRIPPER_STATE_MOVING = 2;
  public static final RTC.GripperStatus GRIPPER_STATE_MOVING = new RTC.GripperStatus(_GRIPPER_STATE_MOVING);
  public static final int _GRIPPER_STATE_UNKNOWN = 3;
  public static final RTC.GripperStatus GRIPPER_STATE_UNKNOWN = new RTC.GripperStatus(_GRIPPER_STATE_UNKNOWN);

  public int value ()
  {
    return __value;
  }

  public static RTC.GripperStatus from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected GripperStatus (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class GripperStatus
