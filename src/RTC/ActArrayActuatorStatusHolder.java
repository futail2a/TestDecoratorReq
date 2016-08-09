package RTC;

/**
* RTC/ActArrayActuatorStatusHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��37�b JST
*/


/*!
     * @enum ActArrayActuatorStatus
     * @brief Describes the status of an actuator.
     */
public final class ActArrayActuatorStatusHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorStatus value = null;

  public ActArrayActuatorStatusHolder ()
  {
  }

  public ActArrayActuatorStatusHolder (RTC.ActArrayActuatorStatus initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorStatusHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorStatusHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorStatusHelper.type ();
  }

}
