package RTC;

/**
* RTC/ActuatorHolder.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class ActuatorHolder implements org.omg.CORBA.portable.Streamable
{
  public RTC.Actuator value = null;

  public ActuatorHolder ()
  {
  }

  public ActuatorHolder (RTC.Actuator initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = RTC.ActuatorHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    RTC.ActuatorHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return RTC.ActuatorHelper.type ();
  }

}
