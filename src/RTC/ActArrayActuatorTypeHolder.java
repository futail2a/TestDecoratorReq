package RTC;

/**
* RTC/ActArrayActuatorTypeHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/


/*!
     * @enum ActArrayActuatorType
     * @brief Describes the type of an actuator.
     */
public final class ActArrayActuatorTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.ActArrayActuatorType value = null;

  public ActArrayActuatorTypeHolder ()
  {
  }

  public ActArrayActuatorTypeHolder (RTC.ActArrayActuatorType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActArrayActuatorTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActArrayActuatorTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActArrayActuatorTypeHelper.type ();
  }

}
