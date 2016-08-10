package RTC;


/**
* RTC/ActArrayActuatorStatus.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum ActArrayActuatorStatus
     * @brief Describes the status of an actuator.
     */
public class ActArrayActuatorStatus implements org.omg.CORBA.portable.IDLEntity
{
  private        int __value;
  private static int __size = 4;
  private static RTC.ActArrayActuatorStatus[] __array = new RTC.ActArrayActuatorStatus [__size];

  public static final int _ACTUATOR_STATUS_IDLE = 0;
  public static final RTC.ActArrayActuatorStatus ACTUATOR_STATUS_IDLE = new RTC.ActArrayActuatorStatus(_ACTUATOR_STATUS_IDLE);
  public static final int _ACTUATOR_STATUS_MOVING = 1;
  public static final RTC.ActArrayActuatorStatus ACTUATOR_STATUS_MOVING = new RTC.ActArrayActuatorStatus(_ACTUATOR_STATUS_MOVING);
  public static final int _ACTUATOR_STATUS_BRAKED = 2;
  public static final RTC.ActArrayActuatorStatus ACTUATOR_STATUS_BRAKED = new RTC.ActArrayActuatorStatus(_ACTUATOR_STATUS_BRAKED);
  public static final int _ACTUATOR_STATUS_STALLED = 3;
  public static final RTC.ActArrayActuatorStatus ACTUATOR_STATUS_STALLED = new RTC.ActArrayActuatorStatus(_ACTUATOR_STATUS_STALLED);

  public int value ()
  {
    return __value;
  }

  public static RTC.ActArrayActuatorStatus from_int (int value)
  {
    if (value >= 0 && value < __size)
      return __array[value];
    else
      throw new org.omg.CORBA.BAD_PARAM ();
  }

  protected ActArrayActuatorStatus (int value)
  {
    __value = value;
    __array[__value] = this;
  }
} // class ActArrayActuatorStatus
